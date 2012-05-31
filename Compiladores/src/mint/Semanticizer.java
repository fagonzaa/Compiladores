package mint;


import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.CommonTree;
import java.util.Stack;


public class Semanticizer {

    SymTable symbols;
    Stack<Scope> scopes;

    public Semanticizer(SymTable sym) {
        this.symbols = sym;
        this.scopes = new Stack<Scope>();
    }

    public void analize(Tree root) {

        for(int i = 0; i < root.getChildCount(); i++) {

            Tree c = root.getChild(i);

            assert c.getType() == MintLexer.CLASS;
            scopes.push(symbols.classes.get(c.getChild(0).getText()));

            System.out.format("Entering class %s\n", c.getChild(0).getText());

            for(int j = 1; j < c.getChildCount(); j++ ) {

                Tree m = c.getChild(j);

                switch(m.getType()) {

                    case MintLexer.METHOD:
                        analizeMethod(m);
                        break;

                    case MintLexer.FIELD:
                        analizeField(m);
                        break;

                    case MintLexer.CTOR:
                        analizeCtor(m);
                        break;

                    default:
                        throw new IllegalArgumentException(String.format("Invalid node type %s at line %s:%s",
                            m.getType(), m.getLine(), m.getCharPositionInLine()));
                }
            }

            scopes.pop();

        }

    }

    public void analizeField(Tree m) {
        assert m.getType() == MintLexer.FIELD;
        Tree field = m.getChild(2);
        String id = field.getText();

        System.out.format("analizing field %s at %s:%s\n", id, field.getLine(), field.getCharPositionInLine());
        if( field.getChildCount() > 0 ) {            

            Type expr = analizeExpression( field.getChild(0) );
            Type fieldType = scopes.peek().find(id).type;

            if( fieldType.isEqual(Type.Float) && expr.isEqual(Type.Int)) {
                CommonTree cast = new CommonTree(new CommonToken(MintLexer.CAST));
                cast.addChild(new CommonTree(new CommonToken(MintLexer.FLOAT)));
                cast.addChild(field.getChild(0));
                field.deleteChild(0);
                field.addChild(cast);

                expr = Type.Float;

                assert field.getChild(0).getType() == MintLexer.CAST;
            }

            if( !expr.isEqual(fieldType) ) {
                System.out.format("error %s:%s can't assign expression of type %s to field %s of type %s\n",  
                    field.getLine(), field.getCharPositionInLine(), expr, id, fieldType);
            }
        }

    }

    public Type analizeExpression(Tree m) {

        switch (m.getType()) {

            case MintLexer.CHAR_LITERAL:
            case MintLexer.INTEGER_LITERAL:
                return Type.Int;

            case MintLexer.STRING_LITERAL:
                return Type.String;

            case MintLexer.FLOAT_LITERAL:
                return Type.Float;

            case MintLexer.TRUE:
            case MintLexer.FALSE:
                return Type.Boolean;

            case MintLexer.OP_PLUS:
                {
                    Type left = analizeExpression(m.getChild(0));
                    Type right = analizeExpression(m.getChild(1));

                    if( left.isEqual(Type.String) && right.isEqual(Type.String) ) {
                        return Type.String;
                    }
                }
            case MintLexer.OP_MINUS:
            case MintLexer.OP_MULT:
            case MintLexer.OP_DIV:
            case MintLexer.OP_MOD:
                {
                    Type left = analizeExpression(m.getChild(0));
                    Type right = analizeExpression(m.getChild(1));

                    if( left.isEqual(Type.Int) && right.isEqual(Type.Int)) {
                        return Type.Int;
                    }
                    else if( (left.isEqual(Type.Float) && right.isEqual(Type.Float))
                        || (left.isEqual(Type.Float) && right.isEqual(Type.Int))
                        || (left.isEqual(Type.Int) && right.isEqual(Type.Float))) {

                        return Type.Float;
                    }
                    else {
                        System.err.println(String.format("error %s:%s undefined operator '%s' for types %s and %s"
                            , m.getLine(), m.getCharPositionInLine(), m.getText(), left, right));
                    }

                }
                break;

            case MintLexer.CAST:
                {
                    Type castType = SymTable.parseType(m.getChild(0));
                    Type subexpr = analizeExpression(m.getChild(1));

                    if(castType.isEqual(subexpr)) {
                        return castType;
                    }
                    else if(castType.isEqual(Type.Int) && castType.isEqual(Type.Float)) {
                        
                    }
                }
                break;



        }
        return Type.Error;
    }

    public void analizeMethod(Tree m) {

    }

    public void analizeCtor(Tree m) {

    }

    public void analizeBlock(Tree block) {

        assert block.getType() == MintLexer.BLOCK;
    }
}