package mint;

import mint.MintLexer;
import org.antlr.runtime.tree.Tree;
import java.util.*;

public class SymTable {

    Hashtable<String, ClassScope> classes;
    Hashtable<Tree, Scope> scopes;

    public void print()
    {
        for( Enumeration<String> it = classes.keys(); it.hasMoreElements(); ) {
            String id = it.nextElement();
            System.out.println("type: " + id);
            for( Symbol s : classes.get(id).getSymbols().values() ) {
                
                if(s instanceof MethodSymbol) {

                    StringBuilder paramBuilder = new StringBuilder();

                    System.out.print(String.format("%s %s %s(", modifierStr(s.visibility), s.type, s.id ));
                    
                    for( Symbol p : ((MethodSymbol)s).methodScope.parameters.values() ) {
                        paramBuilder.append(p.type);
                        paramBuilder.append(" ");
                        paramBuilder.append(p.id);
                        paramBuilder.append(", ");
                    }

                    // Quitamos la coma de al final
                    if( paramBuilder.length() >= 2) {
                        paramBuilder.setLength(paramBuilder.length() - 2);
                    }

                    System.out.println(String.format("%s)", paramBuilder));

                    print(((MethodSymbol)s).methodScope, 1);

                }
                else {
                    System.out.println(String.format("%s %s %s", modifierStr(s.visibility), s.type, s.id ));
                }

            }
        }
    }

    public String modifierStr(Visibility v) {
        switch(v) {
            case PUBLIC:
                return "public";

            case PROTECTED:
                return "protected";

            case PRIVATE:
                return "private";

            default:
                throw new IllegalArgumentException("Invalid modifier ");
        }
    }
    
    public void print(Scope scope, int indent) {

        StringBuilder indentation = new StringBuilder();
        for(int i = 0; i < indent; i++) {
            indentation.append("    ");
        }
        for(int i = 0; i < indent; i++) {
            indentation.append(">");
        }

        for( Enumeration<Symbol> sit = scope.getSymbols().elements(); sit.hasMoreElements(); ) {            
                Symbol s = sit.nextElement();
                System.out.println(String.format("%s %s %s", indentation, s.type, s.id ));
        }
        
        for( Scope s : scope.subscopes )
        {
            System.out.println(String.format("%s BLOCK", indentation));
            print(s, indent+1);
        }
    }

    public SymTable(Tree root) {

        this.classes = new Hashtable<String, ClassScope>();
        this.scopes = new Hashtable<Tree, Scope>();

        if ( root.getType() != MintLexer.PROGRAM ) {
            // ERROR
            return;
        }

        for( int j = 0; j < root.getChildCount(); j++) {

            ClassScope scope = new ClassScope();
            Tree classNode = root.getChild(j);
            String id = classNode.getChild(0).getText();

            if( classes.containsKey(id) ) {
                throw new IllegalArgumentException("class " + id + " already exists");
            }

            classes.put(id, scope);

            for(int i = 1; i < classNode.getChildCount(); i++) {

                Tree member = classNode.getChild(i);
                switch(member.getType())
                {
                    case MintLexer.FIELD:
                        addField(member, scope);
                        break;

                    case MintLexer.METHOD:
                        addMethod(member, scope);
                        break;

                    case MintLexer.CTOR:
                        addCtor(member, scope);
                        break;
                }

            }
        }

    }

    private Visibility parseModifier(int m) {

        switch(m) {
            case MintLexer.PUBLIC:
                return Visibility.PUBLIC;
            
            case MintLexer.PROTECTED:
                return Visibility.PROTECTED;

            case MintLexer.PRIVATE:
                return Visibility.PRIVATE;

            default:
                throw new IllegalArgumentException("Invalid modifier type");
        }

    }

    public static Type parseType(Tree t) {

        switch(t.getType())
        {
            case MintLexer.INT:
                return Type.Int;

            case MintLexer.FLOAT:
                return Type.Float;

            case MintLexer.BOOLEAN:
                return Type.Boolean;

            case MintLexer.VOID:
                return Type.Void;

            case MintLexer.IDENTIFIER:
                if( t.getText().equals("String") ) {
                    return Type.String;
                }
                else {
                    return new Type(t.getText());
                }

            case MintLexer.ARRAY_TYPE:
                return parseType(t.getChild(0)).arrayType();

            default:
                throw new IllegalArgumentException("Invalid modifier type");
        }
    }

    private void addField(Tree node, Scope scope) {

        assert node.getType() == MintLexer.FIELD;

        Visibility modifier = parseModifier(node.getChild(0).getType());
        Type type = parseType(node.getChild(1));
        String name = node.getChild(2).getText();

        Symbol s = new Symbol(name, modifier, type, scope);

        scope.add(name, s);
    }

    private void addParameterList(Tree params, MethodSymbol s) {
        
        assert params.getType() == MintLexer.PARAMS;

        for( int i = 0; i < params.getChildCount(); i++) {

            Tree p = params.getChild(i);

            Tree idTree;

            Type t = parseType(p);

            if( p.getType() == MintLexer.ARRAY_TYPE) {
                
                idTree = p.getChild(1);
                assert t.isArray();
            }
            else {
                
                idTree = p.getChild(0);
                assert !Type.Int.isArray();
                assert !t.isArray();
            }

            assert idTree.getType() == MintLexer.IDENTIFIER;

            String id = idTree.getText();
            s.methodScope.addParameter(id, new Symbol(id, null, t, s.methodScope));
        }
        
    }

    private void addMethod(Tree node, ClassScope classScope) {

        assert node.getType() == MintLexer.METHOD;

        Visibility modifier = parseModifier(node.getChild(0).getType());
        Type type = parseType(node.getChild(1));
        String name = node.getChild(2).getText();

        MethodScope scope = new MethodScope(classScope);

        MethodSymbol s = new MethodSymbol(name, modifier, type, classScope, scope);

        Tree params = node.getChild(3);

        addParameterList(params, s);
        
        fillBlock(node.getChild(4), scope, scope);
        
        classScope.add(name, s);

    }

    private void addCtor(Tree node, ClassScope classScope) {

        assert node.getType() == MintLexer.CTOR;

        Visibility modifier = parseModifier(node.getChild(0).getType());
        String name = node.getChild(1).getText();

        MethodScope scope = new MethodScope(classScope);
        MethodSymbol s = new MethodSymbol(name, modifier, null, classScope, scope);
        
        classScope.add(name, s);

        fillBlock(node.getChild(3), scope, scope);
        
        
    }

    private void fillBlock(Tree node, Scope scope, MethodScope method) {
    
        assert node != null;
        assert scope != null;
        assert scopes != null;
        assert node.getType() == MintLexer.BLOCK;

        scopes.put(node, scope);     
        

        for(int i = 0; i < node.getChildCount(); i++) {

            Tree sentence = node.getChild(i);

            switch (sentence.getType()) {

                case MintLexer.FIELD:
                    addLocal(sentence, scope);
                    break;

                case MintLexer.IF:
                    fillBlock(sentence.getChild(1), new LocalScope(scope, method), method);
                    if( sentence.getChildCount() > 2) {
                        for( int j = 2; j < sentence.getChildCount(); j++ ) {
                            Tree eli = sentence.getChild(j);
                            if( eli.getType() == MintLexer.ELSIF ) {
                                fillBlock(eli.getChild(1), new LocalScope(scope, method), method);
                            }
                            else if( eli.getType() == MintLexer.ELSE ) {
                                fillBlock(eli.getChild(0), new LocalScope(scope, method), method);
                            }
                        }
                    }
                    break;
                
                case MintLexer.DO:
                    fillBlock(sentence.getChild(1), new LocalScope(scope, method), method);
                    break;

                case MintLexer.WHILE:
                    fillBlock(sentence.getChild(1), new LocalScope(scope, method), method);
                    break;
                
                default:
                    return;
            }

        }
    }

    private void addLocal(Tree node, Scope scope) {

        assert node.getType() == MintLexer.FIELD;

        Type type = parseType(node.getChild(0));
        
        for(int i = 1; i < node.getChildCount(); i++) {
            Tree declarator = node.getChild(i);
            assert declarator.getType() == MintLexer.IDENTIFIER;

            String id  = declarator.getText();
            try {
                scope.add(id, new Symbol(id, null, type, scope));    
            }
            catch(IllegalArgumentException e)
            {
                throw new IllegalArgumentException("hsad");
            }
            

        }

    }

}