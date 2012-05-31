// $ANTLR 3.4 C:\\Users\\komandox\\Desktop\\Mint\\Mint.g 2012-05-26 16:51:33
 package mint; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MintParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS", "AND", "ARGS", "ARRAY_ACCESS", "ARRAY_CREATION", "ARRAY_TYPE", "ASSIGN_BAND", "ASSIGN_BOR", "ASSIGN_DIV", "ASSIGN_MOD", "ASSIGN_MULT", "ASSIGN_NOT", "ASSIGN_PLUS", "ASSIGN_SUB", "ASSIGN_XOR", "BLOCK", "BODY", "BOOLEAN", "CALL", "CAST", "CHAR_LITERAL", "CLASS", "COMMA", "COMMENT", "CTOR", "DEC", "DEDENT", "DO", "DOT", "ELSE", "ELSIF", "EQUAL", "EQUALS", "ERROR", "EXTENDS", "FALSE", "FIELD", "FIELD_ACCESS", "FLOAT", "FLOAT_LITERAL", "GREATER", "GTE", "IDENTIFIER", "IF", "INC", "INDENT", "INDENTATION", "INT", "INTEGER_LITERAL", "LBRACKET", "LESS", "LPAREN", "LTE", "METHOD", "METHOD_ACCESS", "NAME", "NEW", "NEWLINE", "OP_BAND", "OP_BNOT", "OP_BOR", "OP_CARET", "OP_DIV", "OP_MINUS", "OP_MOD", "OP_MULT", "OP_NOT", "OP_OR", "OP_PLUS", "PARAMS", "PASS", "POST", "PRIVATE", "PROGRAM", "PROTECTED", "PUBLIC", "RBRACKET", "RETURN", "RPAREN", "SELECTOR", "STRING_LITERAL", "SUPER", "THIS", "TOKEN", "TRUE", "VOID", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ACCESS=4;
    public static final int AND=5;
    public static final int ARGS=6;
    public static final int ARRAY_ACCESS=7;
    public static final int ARRAY_CREATION=8;
    public static final int ARRAY_TYPE=9;
    public static final int ASSIGN_BAND=10;
    public static final int ASSIGN_BOR=11;
    public static final int ASSIGN_DIV=12;
    public static final int ASSIGN_MOD=13;
    public static final int ASSIGN_MULT=14;
    public static final int ASSIGN_NOT=15;
    public static final int ASSIGN_PLUS=16;
    public static final int ASSIGN_SUB=17;
    public static final int ASSIGN_XOR=18;
    public static final int BLOCK=19;
    public static final int BODY=20;
    public static final int BOOLEAN=21;
    public static final int CALL=22;
    public static final int CAST=23;
    public static final int CHAR_LITERAL=24;
    public static final int CLASS=25;
    public static final int COMMA=26;
    public static final int COMMENT=27;
    public static final int CTOR=28;
    public static final int DEC=29;
    public static final int DEDENT=30;
    public static final int DO=31;
    public static final int DOT=32;
    public static final int ELSE=33;
    public static final int ELSIF=34;
    public static final int EQUAL=35;
    public static final int EQUALS=36;
    public static final int ERROR=37;
    public static final int EXTENDS=38;
    public static final int FALSE=39;
    public static final int FIELD=40;
    public static final int FIELD_ACCESS=41;
    public static final int FLOAT=42;
    public static final int FLOAT_LITERAL=43;
    public static final int GREATER=44;
    public static final int GTE=45;
    public static final int IDENTIFIER=46;
    public static final int IF=47;
    public static final int INC=48;
    public static final int INDENT=49;
    public static final int INDENTATION=50;
    public static final int INT=51;
    public static final int INTEGER_LITERAL=52;
    public static final int LBRACKET=53;
    public static final int LESS=54;
    public static final int LPAREN=55;
    public static final int LTE=56;
    public static final int METHOD=57;
    public static final int METHOD_ACCESS=58;
    public static final int NAME=59;
    public static final int NEW=60;
    public static final int NEWLINE=61;
    public static final int OP_BAND=62;
    public static final int OP_BNOT=63;
    public static final int OP_BOR=64;
    public static final int OP_CARET=65;
    public static final int OP_DIV=66;
    public static final int OP_MINUS=67;
    public static final int OP_MOD=68;
    public static final int OP_MULT=69;
    public static final int OP_NOT=70;
    public static final int OP_OR=71;
    public static final int OP_PLUS=72;
    public static final int PARAMS=73;
    public static final int PASS=74;
    public static final int POST=75;
    public static final int PRIVATE=76;
    public static final int PROGRAM=77;
    public static final int PROTECTED=78;
    public static final int PUBLIC=79;
    public static final int RBRACKET=80;
    public static final int RETURN=81;
    public static final int RPAREN=82;
    public static final int SELECTOR=83;
    public static final int STRING_LITERAL=84;
    public static final int SUPER=85;
    public static final int THIS=86;
    public static final int TOKEN=87;
    public static final int TRUE=88;
    public static final int VOID=89;
    public static final int WHILE=90;
    public static final int WS=91;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MintParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MintParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MintParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\komandox\\Desktop\\Mint\\Mint.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {

            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            System.out.println(String.format("error %s : %s %s", e.line, e.charPositionInLine, msg));
            
            // Now do something with hdr and msg...
        }


    public static class dedent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dedent"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:286:1: dedent : ( DEDENT | EOF );
    public final MintParser.dedent_return dedent() throws RecognitionException {
        MintParser.dedent_return retval = new MintParser.dedent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set1=null;

        Object set1_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:286:9: ( DEDENT | EOF )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set1=(Token)input.LT(1);

            if ( input.LA(1)==EOF||input.LA(1)==DEDENT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set1)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dedent"


    public static class newline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newline"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:288:1: newline : ( NEWLINE | EOF );
    public final MintParser.newline_return newline() throws RecognitionException {
        MintParser.newline_return retval = new MintParser.newline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:288:9: ( NEWLINE | EOF )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set2)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "newline"


    public static class compilationUnit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compilationUnit"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:1: compilationUnit : ( NEWLINE | classDeclaration )* EOF -> ^( PROGRAM ( classDeclaration )* ) ;
    public final MintParser.compilationUnit_return compilationUnit() throws RecognitionException {
        MintParser.compilationUnit_return retval = new MintParser.compilationUnit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEWLINE3=null;
        Token EOF5=null;
        MintParser.classDeclaration_return classDeclaration4 =null;


        Object NEWLINE3_tree=null;
        Object EOF5_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_classDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule classDeclaration");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:17: ( ( NEWLINE | classDeclaration )* EOF -> ^( PROGRAM ( classDeclaration )* ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:19: ( NEWLINE | classDeclaration )* EOF
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:19: ( NEWLINE | classDeclaration )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }
                else if ( (LA1_0==CLASS||LA1_0==PRIVATE||(LA1_0 >= PROTECTED && LA1_0 <= PUBLIC)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:20: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_compilationUnit2294); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE3);


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:30: classDeclaration
            	    {
            	    pushFollow(FOLLOW_classDeclaration_in_compilationUnit2298);
            	    classDeclaration4=classDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classDeclaration.add(classDeclaration4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_compilationUnit2302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF5);


            // AST REWRITE
            // elements: classDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 291:53: -> ^( PROGRAM ( classDeclaration )* )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:56: ^( PROGRAM ( classDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:291:66: ( classDeclaration )*
                while ( stream_classDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDeclaration.nextTree());

                }
                stream_classDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:293:1: literal : ( INTEGER_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | STRING_LITERAL | 'true' | 'false' );
    public final MintParser.literal_return literal() throws RecognitionException {
        MintParser.literal_return retval = new MintParser.literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set6=null;

        Object set6_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:293:9: ( INTEGER_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | STRING_LITERAL | 'true' | 'false' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set6=(Token)input.LT(1);

            if ( input.LA(1)==CHAR_LITERAL||input.LA(1)==FALSE||input.LA(1)==FLOAT_LITERAL||input.LA(1)==INTEGER_LITERAL||input.LA(1)==STRING_LITERAL||input.LA(1)==TRUE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set6)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:295:1: type : ( primitiveType | referenceType );
    public final MintParser.type_return type() throws RecognitionException {
        MintParser.type_return retval = new MintParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.primitiveType_return primitiveType7 =null;

        MintParser.referenceType_return referenceType8 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:295:6: ( primitiveType | referenceType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==BOOLEAN||LA2_0==FLOAT||LA2_0==INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==IDENTIFIER||LA2_1==RPAREN) ) {
                    alt2=1;
                }
                else if ( (LA2_1==LBRACKET) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==IDENTIFIER) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:295:8: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_type2347);
                    primitiveType7=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType7.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:295:24: referenceType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_referenceType_in_type2351);
                    referenceType8=referenceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, referenceType8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:297:1: primitiveType : ( 'int' | 'float' | 'boolean' );
    public final MintParser.primitiveType_return primitiveType() throws RecognitionException {
        MintParser.primitiveType_return retval = new MintParser.primitiveType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set9=null;

        Object set9_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:297:15: ( 'int' | 'float' | 'boolean' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set9=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set9)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class referenceType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "referenceType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:299:1: referenceType : ( classType | arrayType );
    public final MintParser.referenceType_return referenceType() throws RecognitionException {
        MintParser.referenceType_return retval = new MintParser.referenceType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.classType_return classType10 =null;

        MintParser.arrayType_return arrayType11 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:299:15: ( classType | arrayType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENTIFIER) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==IDENTIFIER||LA3_1==RPAREN) ) {
                    alt3=1;
                }
                else if ( (LA3_1==LBRACKET) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==BOOLEAN||LA3_0==FLOAT||LA3_0==INT) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:299:17: classType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classType_in_referenceType2375);
                    classType10=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:299:29: arrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayType_in_referenceType2379);
                    arrayType11=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType11.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "referenceType"


    public static class classType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:301:1: classType : name ;
    public final MintParser.classType_return classType() throws RecognitionException {
        MintParser.classType_return retval = new MintParser.classType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.name_return name12 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:301:11: ( name )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:301:13: name
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_name_in_classType2387);
            name12=name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, name12.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classType"


    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:303:1: arrayType : ( primitiveType '[' ']' -> ^( ARRAY_TYPE primitiveType ) | classType '[' ']' -> ^( ARRAY_TYPE classType ) );
    public final MintParser.arrayType_return arrayType() throws RecognitionException {
        MintParser.arrayType_return retval = new MintParser.arrayType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        MintParser.primitiveType_return primitiveType13 =null;

        MintParser.classType_return classType16 =null;


        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_primitiveType=new RewriteRuleSubtreeStream(adaptor,"rule primitiveType");
        RewriteRuleSubtreeStream stream_classType=new RewriteRuleSubtreeStream(adaptor,"rule classType");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:303:11: ( primitiveType '[' ']' -> ^( ARRAY_TYPE primitiveType ) | classType '[' ']' -> ^( ARRAY_TYPE classType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==BOOLEAN||LA4_0==FLOAT||LA4_0==INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENTIFIER) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:303:13: primitiveType '[' ']'
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayType2395);
                    primitiveType13=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitiveType.add(primitiveType13.getTree());

                    char_literal14=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType2397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal14);


                    char_literal15=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType2399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal15);


                    // AST REWRITE
                    // elements: primitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:35: -> ^( ARRAY_TYPE primitiveType )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:303:38: ^( ARRAY_TYPE primitiveType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_primitiveType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:304:4: classType '[' ']'
                    {
                    pushFollow(FOLLOW_classType_in_arrayType2412);
                    classType16=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classType.add(classType16.getTree());

                    char_literal17=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType2414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal17);


                    char_literal18=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType2416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal18);


                    // AST REWRITE
                    // elements: classType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:22: -> ^( ARRAY_TYPE classType )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:304:25: ^( ARRAY_TYPE classType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_classType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayType"


    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:306:1: name : IDENTIFIER ;
    public final MintParser.name_return name() throws RecognitionException {
        MintParser.name_return retval = new MintParser.name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER19=null;

        Object IDENTIFIER19_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:306:6: ( IDENTIFIER )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:306:8: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_name2432); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER19_tree = 
            (Object)adaptor.create(IDENTIFIER19)
            ;
            adaptor.addChild(root_0, IDENTIFIER19_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class modifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modifiers"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:308:1: modifiers : ( 'public' | 'protected' | 'private' );
    public final MintParser.modifiers_return modifiers() throws RecognitionException {
        MintParser.modifiers_return retval = new MintParser.modifiers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:308:11: ( 'public' | 'protected' | 'private' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set20=(Token)input.LT(1);

            if ( input.LA(1)==PRIVATE||(input.LA(1) >= PROTECTED && input.LA(1) <= PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set20)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modifiers"


    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:1: classDeclaration : ( ( modifiers )? 'class' id= IDENTIFIER ( superExtend )? classBody ) -> ^( 'class' $id ( superExtend )? classBody ) ;
    public final MintParser.classDeclaration_return classDeclaration() throws RecognitionException {
        MintParser.classDeclaration_return retval = new MintParser.classDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token string_literal22=null;
        MintParser.modifiers_return modifiers21 =null;

        MintParser.superExtend_return superExtend23 =null;

        MintParser.classBody_return classBody24 =null;


        Object id_tree=null;
        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        RewriteRuleSubtreeStream stream_superExtend=new RewriteRuleSubtreeStream(adaptor,"rule superExtend");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:18: ( ( ( modifiers )? 'class' id= IDENTIFIER ( superExtend )? classBody ) -> ^( 'class' $id ( superExtend )? classBody ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:20: ( ( modifiers )? 'class' id= IDENTIFIER ( superExtend )? classBody )
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:20: ( ( modifiers )? 'class' id= IDENTIFIER ( superExtend )? classBody )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:21: ( modifiers )? 'class' id= IDENTIFIER ( superExtend )? classBody
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:21: ( modifiers )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PRIVATE||(LA5_0 >= PROTECTED && LA5_0 <= PUBLIC)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:21: modifiers
                    {
                    pushFollow(FOLLOW_modifiers_in_classDeclaration2457);
                    modifiers21=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiers.add(modifiers21.getTree());

                    }
                    break;

            }


            string_literal22=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration2460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(string_literal22);


            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration2464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:54: ( superExtend )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EXTENDS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:54: superExtend
                    {
                    pushFollow(FOLLOW_superExtend_in_classDeclaration2466);
                    superExtend23=superExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_superExtend.add(superExtend23.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBody_in_classDeclaration2469);
            classBody24=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody24.getTree());

            }


            // AST REWRITE
            // elements: classBody, CLASS, superExtend, id
            // token labels: id
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:78: -> ^( 'class' $id ( superExtend )? classBody )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:81: ^( 'class' $id ( superExtend )? classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CLASS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_id.nextNode());

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:310:95: ( superExtend )?
                if ( stream_superExtend.hasNext() ) {
                    adaptor.addChild(root_1, stream_superExtend.nextTree());

                }
                stream_superExtend.reset();

                adaptor.addChild(root_1, stream_classBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"


    public static class superExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superExtend"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:312:1: superExtend : ( 'extends' ^ classType ) ;
    public final MintParser.superExtend_return superExtend() throws RecognitionException {
        MintParser.superExtend_return retval = new MintParser.superExtend_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal25=null;
        MintParser.classType_return classType26 =null;


        Object string_literal25_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:312:13: ( ( 'extends' ^ classType ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:312:15: ( 'extends' ^ classType )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:312:15: ( 'extends' ^ classType )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:312:16: 'extends' ^ classType
            {
            string_literal25=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_superExtend2493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal25_tree = 
            (Object)adaptor.create(string_literal25)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);
            }

            pushFollow(FOLLOW_classType_in_superExtend2496);
            classType26=classType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classType26.getTree());

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superExtend"


    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBody"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:314:1: classBody : INDENT classBodyDeclarations dedent -> classBodyDeclarations ;
    public final MintParser.classBody_return classBody() throws RecognitionException {
        MintParser.classBody_return retval = new MintParser.classBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT27=null;
        MintParser.classBodyDeclarations_return classBodyDeclarations28 =null;

        MintParser.dedent_return dedent29 =null;


        Object INDENT27_tree=null;
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_classBodyDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule classBodyDeclarations");
        RewriteRuleSubtreeStream stream_dedent=new RewriteRuleSubtreeStream(adaptor,"rule dedent");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:314:11: ( INDENT classBodyDeclarations dedent -> classBodyDeclarations )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:314:13: INDENT classBodyDeclarations dedent
            {
            INDENT27=(Token)match(input,INDENT,FOLLOW_INDENT_in_classBody2505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT27);


            pushFollow(FOLLOW_classBodyDeclarations_in_classBody2507);
            classBodyDeclarations28=classBodyDeclarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyDeclarations.add(classBodyDeclarations28.getTree());

            pushFollow(FOLLOW_dedent_in_classBody2509);
            dedent29=dedent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dedent.add(dedent29.getTree());

            // AST REWRITE
            // elements: classBodyDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:49: -> classBodyDeclarations
            {
                adaptor.addChild(root_0, stream_classBodyDeclarations.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBody"


    public static class classBodyDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyDeclarations"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:316:1: classBodyDeclarations : ( ( classBodyDeclaration )+ | emptyStmt ->);
    public final MintParser.classBodyDeclarations_return classBodyDeclarations() throws RecognitionException {
        MintParser.classBodyDeclarations_return retval = new MintParser.classBodyDeclarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.classBodyDeclaration_return classBodyDeclaration30 =null;

        MintParser.emptyStmt_return emptyStmt31 =null;


        RewriteRuleSubtreeStream stream_emptyStmt=new RewriteRuleSubtreeStream(adaptor,"rule emptyStmt");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:316:23: ( ( classBodyDeclaration )+ | emptyStmt ->)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOLEAN||LA8_0==FLOAT||LA8_0==IDENTIFIER||LA8_0==INT||LA8_0==PRIVATE||(LA8_0 >= PROTECTED && LA8_0 <= PUBLIC)||LA8_0==VOID) ) {
                alt8=1;
            }
            else if ( (LA8_0==PASS) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:316:25: ( classBodyDeclaration )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:316:25: ( classBodyDeclaration )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==BOOLEAN||LA7_0==FLOAT||LA7_0==IDENTIFIER||LA7_0==INT||LA7_0==PRIVATE||(LA7_0 >= PROTECTED && LA7_0 <= PUBLIC)||LA7_0==VOID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:316:26: classBodyDeclaration
                    	    {
                    	    pushFollow(FOLLOW_classBodyDeclaration_in_classBodyDeclarations2523);
                    	    classBodyDeclaration30=classBodyDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBodyDeclaration30.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:317:6: emptyStmt
                    {
                    pushFollow(FOLLOW_emptyStmt_in_classBodyDeclarations2533);
                    emptyStmt31=emptyStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_emptyStmt.add(emptyStmt31.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:16: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBodyDeclarations"


    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:319:1: classBodyDeclaration : ( classMemberDeclaration | constructorDeclaration );
    public final MintParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        MintParser.classBodyDeclaration_return retval = new MintParser.classBodyDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.classMemberDeclaration_return classMemberDeclaration32 =null;

        MintParser.constructorDeclaration_return constructorDeclaration33 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:319:22: ( classMemberDeclaration | constructorDeclaration )
            int alt9=2;
            switch ( input.LA(1) ) {
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==BOOLEAN||LA9_1==FLOAT||LA9_1==INT||LA9_1==VOID) ) {
                    alt9=1;
                }
                else if ( (LA9_1==IDENTIFIER) ) {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==LPAREN) ) {
                        alt9=2;
                    }
                    else if ( (LA9_4==IDENTIFIER||LA9_4==LBRACKET) ) {
                        alt9=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case FLOAT:
            case INT:
            case VOID:
                {
                alt9=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==LPAREN) ) {
                    alt9=2;
                }
                else if ( (LA9_3==IDENTIFIER||LA9_3==LBRACKET) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:319:24: classMemberDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classMemberDeclaration_in_classBodyDeclaration2544);
                    classMemberDeclaration32=classMemberDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classMemberDeclaration32.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:320:6: constructorDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constructorDeclaration_in_classBodyDeclaration2552);
                    constructorDeclaration33=constructorDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constructorDeclaration33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classBodyDeclaration"


    public static class classMemberDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMemberDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:322:1: classMemberDeclaration : ( fieldDeclaration | methodDeclaration );
    public final MintParser.classMemberDeclaration_return classMemberDeclaration() throws RecognitionException {
        MintParser.classMemberDeclaration_return retval = new MintParser.classMemberDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.fieldDeclaration_return fieldDeclaration34 =null;

        MintParser.methodDeclaration_return methodDeclaration35 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:322:24: ( fieldDeclaration | methodDeclaration )
            int alt10=2;
            switch ( input.LA(1) ) {
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
                {
                switch ( input.LA(2) ) {
                case BOOLEAN:
                case FLOAT:
                case INT:
                    {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==IDENTIFIER) ) {
                        int LA10_10 = input.LA(4);

                        if ( (LA10_10==LPAREN) ) {
                            alt10=2;
                        }
                        else if ( (LA10_10==EOF||LA10_10==COMMA||LA10_10==EQUAL||LA10_10==NEWLINE) ) {
                            alt10=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA10_5==LBRACKET) ) {
                        int LA10_11 = input.LA(4);

                        if ( (LA10_11==RBRACKET) ) {
                            int LA10_16 = input.LA(5);

                            if ( (LA10_16==IDENTIFIER) ) {
                                int LA10_10 = input.LA(6);

                                if ( (LA10_10==LPAREN) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_10==EOF||LA10_10==COMMA||LA10_10==EQUAL||LA10_10==NEWLINE) ) {
                                    alt10=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 16, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 11, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==IDENTIFIER) ) {
                        int LA10_10 = input.LA(4);

                        if ( (LA10_10==LPAREN) ) {
                            alt10=2;
                        }
                        else if ( (LA10_10==EOF||LA10_10==COMMA||LA10_10==EQUAL||LA10_10==NEWLINE) ) {
                            alt10=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 10, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA10_6==LBRACKET) ) {
                        int LA10_12 = input.LA(4);

                        if ( (LA10_12==RBRACKET) ) {
                            int LA10_17 = input.LA(5);

                            if ( (LA10_17==IDENTIFIER) ) {
                                int LA10_10 = input.LA(6);

                                if ( (LA10_10==LPAREN) ) {
                                    alt10=2;
                                }
                                else if ( (LA10_10==EOF||LA10_10==COMMA||LA10_10==EQUAL||LA10_10==NEWLINE) ) {
                                    alt10=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 10, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 17, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 12, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;

                    }
                    }
                    break;
                case VOID:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
            case FLOAT:
            case INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==IDENTIFIER) ) {
                    int LA10_7 = input.LA(3);

                    if ( (LA10_7==LPAREN) ) {
                        alt10=2;
                    }
                    else if ( (LA10_7==EOF||LA10_7==COMMA||LA10_7==EQUAL||LA10_7==NEWLINE) ) {
                        alt10=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 7, input);

                        throw nvae;

                    }
                }
                else if ( (LA10_2==LBRACKET) ) {
                    int LA10_8 = input.LA(3);

                    if ( (LA10_8==RBRACKET) ) {
                        int LA10_14 = input.LA(4);

                        if ( (LA10_14==IDENTIFIER) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==LPAREN) ) {
                                alt10=2;
                            }
                            else if ( (LA10_7==EOF||LA10_7==COMMA||LA10_7==EQUAL||LA10_7==NEWLINE) ) {
                                alt10=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 8, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==IDENTIFIER) ) {
                    int LA10_7 = input.LA(3);

                    if ( (LA10_7==LPAREN) ) {
                        alt10=2;
                    }
                    else if ( (LA10_7==EOF||LA10_7==COMMA||LA10_7==EQUAL||LA10_7==NEWLINE) ) {
                        alt10=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 7, input);

                        throw nvae;

                    }
                }
                else if ( (LA10_3==LBRACKET) ) {
                    int LA10_9 = input.LA(3);

                    if ( (LA10_9==RBRACKET) ) {
                        int LA10_15 = input.LA(4);

                        if ( (LA10_15==IDENTIFIER) ) {
                            int LA10_7 = input.LA(5);

                            if ( (LA10_7==LPAREN) ) {
                                alt10=2;
                            }
                            else if ( (LA10_7==EOF||LA10_7==COMMA||LA10_7==EQUAL||LA10_7==NEWLINE) ) {
                                alt10=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 7, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 9, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
                }
                break;
            case VOID:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:322:26: fieldDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fieldDeclaration_in_classMemberDeclaration2560);
                    fieldDeclaration34=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDeclaration34.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:323:6: methodDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodDeclaration_in_classMemberDeclaration2568);
                    methodDeclaration35=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classMemberDeclaration"


    public static class fieldDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:325:1: fieldDeclaration : ( modifiers type variableDeclarators newline -> ^( FIELD modifiers type variableDeclarators ) | type variableDeclarators newline -> ^( FIELD PRIVATE type variableDeclarators ) );
    public final MintParser.fieldDeclaration_return fieldDeclaration() throws RecognitionException {
        MintParser.fieldDeclaration_return retval = new MintParser.fieldDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.modifiers_return modifiers36 =null;

        MintParser.type_return type37 =null;

        MintParser.variableDeclarators_return variableDeclarators38 =null;

        MintParser.newline_return newline39 =null;

        MintParser.type_return type40 =null;

        MintParser.variableDeclarators_return variableDeclarators41 =null;

        MintParser.newline_return newline42 =null;


        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_variableDeclarators=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarators");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:325:18: ( modifiers type variableDeclarators newline -> ^( FIELD modifiers type variableDeclarators ) | type variableDeclarators newline -> ^( FIELD PRIVATE type variableDeclarators ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PRIVATE||(LA11_0 >= PROTECTED && LA11_0 <= PUBLIC)) ) {
                alt11=1;
            }
            else if ( (LA11_0==BOOLEAN||LA11_0==FLOAT||LA11_0==IDENTIFIER||LA11_0==INT) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:325:20: modifiers type variableDeclarators newline
                    {
                    pushFollow(FOLLOW_modifiers_in_fieldDeclaration2576);
                    modifiers36=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiers.add(modifiers36.getTree());

                    pushFollow(FOLLOW_type_in_fieldDeclaration2578);
                    type37=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type37.getTree());

                    pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration2580);
                    variableDeclarators38=variableDeclarators();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclarators.add(variableDeclarators38.getTree());

                    pushFollow(FOLLOW_newline_in_fieldDeclaration2582);
                    newline39=newline();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_newline.add(newline39.getTree());

                    // AST REWRITE
                    // elements: type, modifiers, variableDeclarators
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:63: -> ^( FIELD modifiers type variableDeclarators )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:325:66: ^( FIELD modifiers type variableDeclarators )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD, "FIELD")
                        , root_1);

                        adaptor.addChild(root_1, stream_modifiers.nextTree());

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, stream_variableDeclarators.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:326:10: type variableDeclarators newline
                    {
                    pushFollow(FOLLOW_type_in_fieldDeclaration2605);
                    type40=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type40.getTree());

                    pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration2607);
                    variableDeclarators41=variableDeclarators();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableDeclarators.add(variableDeclarators41.getTree());

                    pushFollow(FOLLOW_newline_in_fieldDeclaration2609);
                    newline42=newline();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_newline.add(newline42.getTree());

                    // AST REWRITE
                    // elements: variableDeclarators, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:43: -> ^( FIELD PRIVATE type variableDeclarators )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:326:46: ^( FIELD PRIVATE type variableDeclarators )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD, "FIELD")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(PRIVATE, "PRIVATE")
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, stream_variableDeclarators.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fieldDeclaration"


    public static class variableDeclarators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarators"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:328:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* -> ( variableDeclarator )+ ;
    public final MintParser.variableDeclarators_return variableDeclarators() throws RecognitionException {
        MintParser.variableDeclarators_return retval = new MintParser.variableDeclarators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal44=null;
        MintParser.variableDeclarator_return variableDeclarator43 =null;

        MintParser.variableDeclarator_return variableDeclarator45 =null;


        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:328:21: ( variableDeclarator ( ',' variableDeclarator )* -> ( variableDeclarator )+ )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:328:23: variableDeclarator ( ',' variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators2629);
            variableDeclarator43=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator43.getTree());

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:328:42: ( ',' variableDeclarator )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:328:43: ',' variableDeclarator
            	    {
            	    char_literal44=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableDeclarators2632); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal44);


            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators2634);
            	    variableDeclarator45=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator45.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: variableDeclarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:68: -> ( variableDeclarator )+
            {
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    adaptor.addChild(root_0, stream_variableDeclarator.nextTree());

                }
                stream_variableDeclarator.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclarators"


    public static class variableDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarator"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:1: variableDeclarator : IDENTIFIER ( '=' expr )? -> ^( IDENTIFIER ( expr )? ) ;
    public final MintParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        MintParser.variableDeclarator_return retval = new MintParser.variableDeclarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER46=null;
        Token char_literal47=null;
        MintParser.expr_return expr48 =null;


        Object IDENTIFIER46_tree=null;
        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:20: ( IDENTIFIER ( '=' expr )? -> ^( IDENTIFIER ( expr )? ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:22: IDENTIFIER ( '=' expr )?
            {
            IDENTIFIER46=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclarator2649); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER46);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:34: ( '=' expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:36: '=' expr
                    {
                    char_literal47=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_variableDeclarator2654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(char_literal47);


                    pushFollow(FOLLOW_expr_in_variableDeclarator2656);
                    expr48=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr48.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 330:48: -> ^( IDENTIFIER ( expr )? )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:51: ^( IDENTIFIER ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IDENTIFIER.nextNode()
                , root_1);

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:330:64: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"


    public static class methodDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:332:1: methodDeclaration : methodHeader block -> ^( METHOD methodHeader block ) ;
    public final MintParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        MintParser.methodDeclaration_return retval = new MintParser.methodDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.methodHeader_return methodHeader49 =null;

        MintParser.block_return block50 =null;


        RewriteRuleSubtreeStream stream_methodHeader=new RewriteRuleSubtreeStream(adaptor,"rule methodHeader");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:332:19: ( methodHeader block -> ^( METHOD methodHeader block ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:332:21: methodHeader block
            {
            pushFollow(FOLLOW_methodHeader_in_methodDeclaration2676);
            methodHeader49=methodHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodHeader.add(methodHeader49.getTree());

            pushFollow(FOLLOW_block_in_methodDeclaration2678);
            block50=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block50.getTree());

            // AST REWRITE
            // elements: block, methodHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 332:40: -> ^( METHOD methodHeader block )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:332:43: ^( METHOD methodHeader block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD, "METHOD")
                , root_1);

                adaptor.addChild(root_1, stream_methodHeader.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"


    public static class methodHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodHeader"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:334:1: methodHeader : ( modifiers methodType methodDeclarator -> modifiers methodType methodDeclarator | methodType methodDeclarator -> PRIVATE methodType methodDeclarator );
    public final MintParser.methodHeader_return methodHeader() throws RecognitionException {
        MintParser.methodHeader_return retval = new MintParser.methodHeader_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.modifiers_return modifiers51 =null;

        MintParser.methodType_return methodType52 =null;

        MintParser.methodDeclarator_return methodDeclarator53 =null;

        MintParser.methodType_return methodType54 =null;

        MintParser.methodDeclarator_return methodDeclarator55 =null;


        RewriteRuleSubtreeStream stream_methodDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule methodDeclarator");
        RewriteRuleSubtreeStream stream_methodType=new RewriteRuleSubtreeStream(adaptor,"rule methodType");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:334:14: ( modifiers methodType methodDeclarator -> modifiers methodType methodDeclarator | methodType methodDeclarator -> PRIVATE methodType methodDeclarator )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PRIVATE||(LA14_0 >= PROTECTED && LA14_0 <= PUBLIC)) ) {
                alt14=1;
            }
            else if ( (LA14_0==BOOLEAN||LA14_0==FLOAT||LA14_0==IDENTIFIER||LA14_0==INT||LA14_0==VOID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:334:16: modifiers methodType methodDeclarator
                    {
                    pushFollow(FOLLOW_modifiers_in_methodHeader2696);
                    modifiers51=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiers.add(modifiers51.getTree());

                    pushFollow(FOLLOW_methodType_in_methodHeader2699);
                    methodType52=methodType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodType.add(methodType52.getTree());

                    pushFollow(FOLLOW_methodDeclarator_in_methodHeader2701);
                    methodDeclarator53=methodDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodDeclarator.add(methodDeclarator53.getTree());

                    // AST REWRITE
                    // elements: methodDeclarator, modifiers, methodType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:55: -> modifiers methodType methodDeclarator
                    {
                        adaptor.addChild(root_0, stream_modifiers.nextTree());

                        adaptor.addChild(root_0, stream_methodType.nextTree());

                        adaptor.addChild(root_0, stream_methodDeclarator.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:335:5: methodType methodDeclarator
                    {
                    pushFollow(FOLLOW_methodType_in_methodHeader2715);
                    methodType54=methodType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodType.add(methodType54.getTree());

                    pushFollow(FOLLOW_methodDeclarator_in_methodHeader2717);
                    methodDeclarator55=methodDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodDeclarator.add(methodDeclarator55.getTree());

                    // AST REWRITE
                    // elements: methodDeclarator, methodType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:33: -> PRIVATE methodType methodDeclarator
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(PRIVATE, "PRIVATE")
                        );

                        adaptor.addChild(root_0, stream_methodType.nextTree());

                        adaptor.addChild(root_0, stream_methodDeclarator.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodHeader"


    public static class methodType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:337:1: methodType : ( type | 'void' );
    public final MintParser.methodType_return methodType() throws RecognitionException {
        MintParser.methodType_return retval = new MintParser.methodType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal57=null;
        MintParser.type_return type56 =null;


        Object string_literal57_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:337:13: ( type | 'void' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOLEAN||LA15_0==FLOAT||LA15_0==IDENTIFIER||LA15_0==INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==VOID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:337:16: type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_methodType2735);
                    type56=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type56.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:337:23: 'void'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal57=(Token)match(input,VOID,FOLLOW_VOID_in_methodType2739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal57_tree = 
                    (Object)adaptor.create(string_literal57)
                    ;
                    adaptor.addChild(root_0, string_literal57_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodType"


    public static class methodDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDeclarator"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:1: methodDeclarator : IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^( PARAMS ( formalParameterList )? ) ;
    public final MintParser.methodDeclarator_return methodDeclarator() throws RecognitionException {
        MintParser.methodDeclarator_return retval = new MintParser.methodDeclarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        MintParser.formalParameterList_return formalParameterList60 =null;


        Object IDENTIFIER58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:18: ( IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^( PARAMS ( formalParameterList )? ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:20: IDENTIFIER '(' ( formalParameterList )? ')'
            {
            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclarator2747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER58);


            char_literal59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodDeclarator2749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal59);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:35: ( formalParameterList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BOOLEAN||LA16_0==FLOAT||LA16_0==IDENTIFIER||LA16_0==INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:37: formalParameterList
                    {
                    pushFollow(FOLLOW_formalParameterList_in_methodDeclarator2753);
                    formalParameterList60=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList60.getTree());

                    }
                    break;

            }


            char_literal61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodDeclarator2758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal61);


            // AST REWRITE
            // elements: IDENTIFIER, formalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 339:64: -> IDENTIFIER ^( PARAMS ( formalParameterList )? )
            {
                adaptor.addChild(root_0, 
                stream_IDENTIFIER.nextNode()
                );

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:78: ^( PARAMS ( formalParameterList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:339:87: ( formalParameterList )?
                if ( stream_formalParameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameterList.nextTree());

                }
                stream_formalParameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDeclarator"


    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameterList"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:341:1: formalParameterList : formalParameter ( ',' formalParameter )* -> ( formalParameter )+ ;
    public final MintParser.formalParameterList_return formalParameterList() throws RecognitionException {
        MintParser.formalParameterList_return retval = new MintParser.formalParameterList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal63=null;
        MintParser.formalParameter_return formalParameter62 =null;

        MintParser.formalParameter_return formalParameter64 =null;


        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:341:21: ( formalParameter ( ',' formalParameter )* -> ( formalParameter )+ )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:341:23: formalParameter ( ',' formalParameter )*
            {
            pushFollow(FOLLOW_formalParameter_in_formalParameterList2777);
            formalParameter62=formalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameter.add(formalParameter62.getTree());

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:341:39: ( ',' formalParameter )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:341:40: ',' formalParameter
            	    {
            	    char_literal63=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList2780); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal63);


            	    pushFollow(FOLLOW_formalParameter_in_formalParameterList2782);
            	    formalParameter64=formalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_formalParameter.add(formalParameter64.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AST REWRITE
            // elements: formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 341:62: -> ( formalParameter )+
            {
                if ( !(stream_formalParameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_formalParameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_formalParameter.nextTree());

                }
                stream_formalParameter.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"


    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameter"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:343:1: formalParameter : ( type ^ IDENTIFIER ) ;
    public final MintParser.formalParameter_return formalParameter() throws RecognitionException {
        MintParser.formalParameter_return retval = new MintParser.formalParameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER66=null;
        MintParser.type_return type65 =null;


        Object IDENTIFIER66_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:343:17: ( ( type ^ IDENTIFIER ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:343:19: ( type ^ IDENTIFIER )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:343:19: ( type ^ IDENTIFIER )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:343:20: type ^ IDENTIFIER
            {
            pushFollow(FOLLOW_type_in_formalParameter2798);
            type65=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(type65.getTree(), root_0);

            IDENTIFIER66=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalParameter2801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER66_tree = 
            (Object)adaptor.create(IDENTIFIER66)
            ;
            adaptor.addChild(root_0, IDENTIFIER66_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formalParameter"


    public static class constructorDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDeclaration"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:345:1: constructorDeclaration : ( modifiers constructorDeclarator constructorBody -> ^( CTOR modifiers constructorDeclarator constructorBody ) | constructorDeclarator constructorBody -> ^( CTOR PRIVATE constructorDeclarator constructorBody ) );
    public final MintParser.constructorDeclaration_return constructorDeclaration() throws RecognitionException {
        MintParser.constructorDeclaration_return retval = new MintParser.constructorDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.modifiers_return modifiers67 =null;

        MintParser.constructorDeclarator_return constructorDeclarator68 =null;

        MintParser.constructorBody_return constructorBody69 =null;

        MintParser.constructorDeclarator_return constructorDeclarator70 =null;

        MintParser.constructorBody_return constructorBody71 =null;


        RewriteRuleSubtreeStream stream_constructorBody=new RewriteRuleSubtreeStream(adaptor,"rule constructorBody");
        RewriteRuleSubtreeStream stream_constructorDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule constructorDeclarator");
        RewriteRuleSubtreeStream stream_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule modifiers");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:345:24: ( modifiers constructorDeclarator constructorBody -> ^( CTOR modifiers constructorDeclarator constructorBody ) | constructorDeclarator constructorBody -> ^( CTOR PRIVATE constructorDeclarator constructorBody ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PRIVATE||(LA18_0 >= PROTECTED && LA18_0 <= PUBLIC)) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENTIFIER) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:345:27: modifiers constructorDeclarator constructorBody
                    {
                    pushFollow(FOLLOW_modifiers_in_constructorDeclaration2811);
                    modifiers67=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiers.add(modifiers67.getTree());

                    pushFollow(FOLLOW_constructorDeclarator_in_constructorDeclaration2813);
                    constructorDeclarator68=constructorDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorDeclarator.add(constructorDeclarator68.getTree());

                    pushFollow(FOLLOW_constructorBody_in_constructorDeclaration2815);
                    constructorBody69=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody69.getTree());

                    // AST REWRITE
                    // elements: constructorDeclarator, constructorBody, modifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:4: -> ^( CTOR modifiers constructorDeclarator constructorBody )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:346:7: ^( CTOR modifiers constructorDeclarator constructorBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CTOR, "CTOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_modifiers.nextTree());

                        adaptor.addChild(root_1, stream_constructorDeclarator.nextTree());

                        adaptor.addChild(root_1, stream_constructorBody.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:347:6: constructorDeclarator constructorBody
                    {
                    pushFollow(FOLLOW_constructorDeclarator_in_constructorDeclaration2838);
                    constructorDeclarator70=constructorDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorDeclarator.add(constructorDeclarator70.getTree());

                    pushFollow(FOLLOW_constructorBody_in_constructorDeclaration2840);
                    constructorBody71=constructorBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constructorBody.add(constructorBody71.getTree());

                    // AST REWRITE
                    // elements: constructorBody, constructorDeclarator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:4: -> ^( CTOR PRIVATE constructorDeclarator constructorBody )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:348:7: ^( CTOR PRIVATE constructorDeclarator constructorBody )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CTOR, "CTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(PRIVATE, "PRIVATE")
                        );

                        adaptor.addChild(root_1, stream_constructorDeclarator.nextTree());

                        adaptor.addChild(root_1, stream_constructorBody.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorDeclaration"


    public static class constructorDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorDeclarator"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:1: constructorDeclarator : IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^( PARAMS ( formalParameterList )? ) ;
    public final MintParser.constructorDeclarator_return constructorDeclarator() throws RecognitionException {
        MintParser.constructorDeclarator_return retval = new MintParser.constructorDeclarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        MintParser.formalParameterList_return formalParameterList74 =null;


        Object IDENTIFIER72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:23: ( IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^( PARAMS ( formalParameterList )? ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:25: IDENTIFIER '(' ( formalParameterList )? ')'
            {
            IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constructorDeclarator2864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER72);


            char_literal73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_constructorDeclarator2866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal73);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:40: ( formalParameterList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==BOOLEAN||LA19_0==FLOAT||LA19_0==IDENTIFIER||LA19_0==INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:42: formalParameterList
                    {
                    pushFollow(FOLLOW_formalParameterList_in_constructorDeclarator2870);
                    formalParameterList74=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList74.getTree());

                    }
                    break;

            }


            char_literal75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_constructorDeclarator2875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal75);


            // AST REWRITE
            // elements: formalParameterList, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 350:69: -> IDENTIFIER ^( PARAMS ( formalParameterList )? )
            {
                adaptor.addChild(root_0, 
                stream_IDENTIFIER.nextNode()
                );

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:83: ^( PARAMS ( formalParameterList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:350:92: ( formalParameterList )?
                if ( stream_formalParameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameterList.nextTree());

                }
                stream_formalParameterList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorDeclarator"


    public static class constructorBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorBody"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:352:1: constructorBody : ( ( INDENT ( 'this' | 'super' ) '(' )=> INDENT ( explicitConstructorInvocation blockStmts ) dedent -> ^( BLOCK explicitConstructorInvocation blockStmts ) | block );
    public final MintParser.constructorBody_return constructorBody() throws RecognitionException {
        MintParser.constructorBody_return retval = new MintParser.constructorBody_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT76=null;
        MintParser.explicitConstructorInvocation_return explicitConstructorInvocation77 =null;

        MintParser.blockStmts_return blockStmts78 =null;

        MintParser.dedent_return dedent79 =null;

        MintParser.block_return block80 =null;


        Object INDENT76_tree=null;
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_explicitConstructorInvocation=new RewriteRuleSubtreeStream(adaptor,"rule explicitConstructorInvocation");
        RewriteRuleSubtreeStream stream_blockStmts=new RewriteRuleSubtreeStream(adaptor,"rule blockStmts");
        RewriteRuleSubtreeStream stream_dedent=new RewriteRuleSubtreeStream(adaptor,"rule dedent");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:352:16: ( ( INDENT ( 'this' | 'super' ) '(' )=> INDENT ( explicitConstructorInvocation blockStmts ) dedent -> ^( BLOCK explicitConstructorInvocation blockStmts ) | block )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INDENT) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred1_Mint()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:353:2: ( INDENT ( 'this' | 'super' ) '(' )=> INDENT ( explicitConstructorInvocation blockStmts ) dedent
                    {
                    INDENT76=(Token)match(input,INDENT,FOLLOW_INDENT_in_constructorBody2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDENT.add(INDENT76);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:353:44: ( explicitConstructorInvocation blockStmts )
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:353:45: explicitConstructorInvocation blockStmts
                    {
                    pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2914);
                    explicitConstructorInvocation77=explicitConstructorInvocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitConstructorInvocation.add(explicitConstructorInvocation77.getTree());

                    pushFollow(FOLLOW_blockStmts_in_constructorBody2916);
                    blockStmts78=blockStmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_blockStmts.add(blockStmts78.getTree());

                    }


                    pushFollow(FOLLOW_dedent_in_constructorBody2919);
                    dedent79=dedent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dedent.add(dedent79.getTree());

                    // AST REWRITE
                    // elements: blockStmts, explicitConstructorInvocation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:3: -> ^( BLOCK explicitConstructorInvocation blockStmts )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:354:6: ^( BLOCK explicitConstructorInvocation blockStmts )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOCK, "BLOCK")
                        , root_1);

                        adaptor.addChild(root_1, stream_explicitConstructorInvocation.nextTree());

                        adaptor.addChild(root_1, stream_blockStmts.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:355:4: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_constructorBody2936);
                    block80=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block80.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorBody"


    public static class explicitConstructorInvocation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "explicitConstructorInvocation"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:1: explicitConstructorInvocation : (t= 'this' |t= 'super' ) argumentList newline -> ^( CALL $t argumentList ) ;
    public final MintParser.explicitConstructorInvocation_return explicitConstructorInvocation() throws RecognitionException {
        MintParser.explicitConstructorInvocation_return retval = new MintParser.explicitConstructorInvocation_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token t=null;
        MintParser.argumentList_return argumentList81 =null;

        MintParser.newline_return newline82 =null;


        Object t_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:31: ( (t= 'this' |t= 'super' ) argumentList newline -> ^( CALL $t argumentList ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:33: (t= 'this' |t= 'super' ) argumentList newline
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:33: (t= 'this' |t= 'super' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==THIS) ) {
                alt21=1;
            }
            else if ( (LA21_0==SUPER) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:35: t= 'this'
                    {
                    t=(Token)match(input,THIS,FOLLOW_THIS_in_explicitConstructorInvocation2948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(t);


                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:46: t= 'super'
                    {
                    t=(Token)match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation2954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(t);


                    }
                    break;

            }


            pushFollow(FOLLOW_argumentList_in_explicitConstructorInvocation2958);
            argumentList81=argumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentList.add(argumentList81.getTree());

            pushFollow(FOLLOW_newline_in_explicitConstructorInvocation2960);
            newline82=newline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_newline.add(newline82.getTree());

            // AST REWRITE
            // elements: argumentList, t
            // token labels: t
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 357:79: -> ^( CALL $t argumentList )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:357:82: ^( CALL $t argumentList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, stream_t.nextNode());

                adaptor.addChild(root_1, stream_argumentList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorInvocation"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:360:1: block : INDENT blockStmts dedent -> ^( BLOCK blockStmts ) ;
    public final MintParser.block_return block() throws RecognitionException {
        MintParser.block_return retval = new MintParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT83=null;
        MintParser.blockStmts_return blockStmts84 =null;

        MintParser.dedent_return dedent85 =null;


        Object INDENT83_tree=null;
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_blockStmts=new RewriteRuleSubtreeStream(adaptor,"rule blockStmts");
        RewriteRuleSubtreeStream stream_dedent=new RewriteRuleSubtreeStream(adaptor,"rule dedent");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:360:7: ( INDENT blockStmts dedent -> ^( BLOCK blockStmts ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:361:2: INDENT blockStmts dedent
            {
            INDENT83=(Token)match(input,INDENT,FOLLOW_INDENT_in_block2982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT83);


            pushFollow(FOLLOW_blockStmts_in_block2984);
            blockStmts84=blockStmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockStmts.add(blockStmts84.getTree());

            pushFollow(FOLLOW_dedent_in_block2986);
            dedent85=dedent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dedent.add(dedent85.getTree());

            // AST REWRITE
            // elements: blockStmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 361:27: -> ^( BLOCK blockStmts )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:361:30: ^( BLOCK blockStmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_blockStmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockStmts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockStmts"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:363:1: blockStmts : ( blockStmt ( blockStmt )* -> ( blockStmt )+ | emptyStmt );
    public final MintParser.blockStmts_return blockStmts() throws RecognitionException {
        MintParser.blockStmts_return retval = new MintParser.blockStmts_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.blockStmt_return blockStmt86 =null;

        MintParser.blockStmt_return blockStmt87 =null;

        MintParser.emptyStmt_return emptyStmt88 =null;


        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:364:2: ( blockStmt ( blockStmt )* -> ( blockStmt )+ | emptyStmt )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BOOLEAN||LA23_0==CHAR_LITERAL||LA23_0==DEC||LA23_0==DO||LA23_0==FALSE||(LA23_0 >= FLOAT && LA23_0 <= FLOAT_LITERAL)||(LA23_0 >= IDENTIFIER && LA23_0 <= INC)||(LA23_0 >= INT && LA23_0 <= INTEGER_LITERAL)||LA23_0==LPAREN||LA23_0==NEW||LA23_0==OP_BNOT||LA23_0==OP_MINUS||LA23_0==OP_NOT||LA23_0==OP_PLUS||LA23_0==RETURN||(LA23_0 >= STRING_LITERAL && LA23_0 <= THIS)||LA23_0==TRUE||LA23_0==WHILE) ) {
                alt23=1;
            }
            else if ( (LA23_0==PASS) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:364:4: blockStmt ( blockStmt )*
                    {
                    pushFollow(FOLLOW_blockStmt_in_blockStmts3004);
                    blockStmt86=blockStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt86.getTree());

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:364:14: ( blockStmt )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==BOOLEAN||LA22_0==CHAR_LITERAL||LA22_0==DEC||LA22_0==DO||LA22_0==FALSE||(LA22_0 >= FLOAT && LA22_0 <= FLOAT_LITERAL)||(LA22_0 >= IDENTIFIER && LA22_0 <= INC)||(LA22_0 >= INT && LA22_0 <= INTEGER_LITERAL)||LA22_0==LPAREN||LA22_0==NEW||LA22_0==OP_BNOT||LA22_0==OP_MINUS||LA22_0==OP_NOT||LA22_0==OP_PLUS||LA22_0==RETURN||(LA22_0 >= STRING_LITERAL && LA22_0 <= THIS)||LA22_0==TRUE||LA22_0==WHILE) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:364:16: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_blockStmts3008);
                    	    blockStmt87=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: blockStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:29: -> ( blockStmt )+
                    {
                        if ( !(stream_blockStmt.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_0, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:365:4: emptyStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_emptyStmt_in_blockStmts3021);
                    emptyStmt88=emptyStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyStmt88.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockStmts"


    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:367:1: blockStmt : ( localVariableDeclarationStmt | stmt );
    public final MintParser.blockStmt_return blockStmt() throws RecognitionException {
        MintParser.blockStmt_return retval = new MintParser.blockStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.localVariableDeclarationStmt_return localVariableDeclarationStmt89 =null;

        MintParser.stmt_return stmt90 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:368:2: ( localVariableDeclarationStmt | stmt )
            int alt24=2;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case FLOAT:
            case INT:
                {
                alt24=1;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    alt24=1;
                    }
                    break;
                case LBRACKET:
                    {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==RBRACKET) ) {
                        alt24=1;
                    }
                    else if ( (LA24_4==CHAR_LITERAL||LA24_4==DEC||LA24_4==FALSE||LA24_4==FLOAT_LITERAL||LA24_4==IDENTIFIER||LA24_4==INC||LA24_4==INTEGER_LITERAL||LA24_4==LPAREN||LA24_4==NEW||LA24_4==OP_BNOT||LA24_4==OP_MINUS||LA24_4==OP_NOT||LA24_4==OP_PLUS||(LA24_4 >= STRING_LITERAL && LA24_4 <= THIS)||LA24_4==TRUE) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case AND:
                case ASSIGN_BAND:
                case ASSIGN_BOR:
                case ASSIGN_DIV:
                case ASSIGN_MOD:
                case ASSIGN_MULT:
                case ASSIGN_NOT:
                case ASSIGN_PLUS:
                case ASSIGN_SUB:
                case ASSIGN_XOR:
                case DEC:
                case DOT:
                case EQUAL:
                case EQUALS:
                case GREATER:
                case GTE:
                case INC:
                case LESS:
                case LPAREN:
                case LTE:
                case NEWLINE:
                case OP_BAND:
                case OP_BOR:
                case OP_CARET:
                case OP_DIV:
                case OP_MINUS:
                case OP_MOD:
                case OP_MULT:
                case OP_OR:
                case OP_PLUS:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;

                }

                }
                break;
            case CHAR_LITERAL:
            case DEC:
            case DO:
            case FALSE:
            case FLOAT_LITERAL:
            case IF:
            case INC:
            case INTEGER_LITERAL:
            case LPAREN:
            case NEW:
            case OP_BNOT:
            case OP_MINUS:
            case OP_NOT:
            case OP_PLUS:
            case RETURN:
            case STRING_LITERAL:
            case SUPER:
            case THIS:
            case TRUE:
            case WHILE:
                {
                alt24=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:368:4: localVariableDeclarationStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_localVariableDeclarationStmt_in_blockStmt3032);
                    localVariableDeclarationStmt89=localVariableDeclarationStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableDeclarationStmt89.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:369:4: stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_blockStmt3038);
                    stmt90=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt90.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockStmt"


    public static class localVariableDeclarationStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableDeclarationStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:371:1: localVariableDeclarationStmt : type variableDeclarators newline -> ^( FIELD type variableDeclarators ) ;
    public final MintParser.localVariableDeclarationStmt_return localVariableDeclarationStmt() throws RecognitionException {
        MintParser.localVariableDeclarationStmt_return retval = new MintParser.localVariableDeclarationStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.type_return type91 =null;

        MintParser.variableDeclarators_return variableDeclarators92 =null;

        MintParser.newline_return newline93 =null;


        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_variableDeclarators=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarators");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:371:30: ( type variableDeclarators newline -> ^( FIELD type variableDeclarators ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:371:32: type variableDeclarators newline
            {
            pushFollow(FOLLOW_type_in_localVariableDeclarationStmt3046);
            type91=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type91.getTree());

            pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclarationStmt3048);
            variableDeclarators92=variableDeclarators();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarators.add(variableDeclarators92.getTree());

            pushFollow(FOLLOW_newline_in_localVariableDeclarationStmt3050);
            newline93=newline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_newline.add(newline93.getTree());

            // AST REWRITE
            // elements: variableDeclarators, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 371:66: -> ^( FIELD type variableDeclarators )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:371:69: ^( FIELD type variableDeclarators )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FIELD, "FIELD")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_variableDeclarators.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclarationStmt"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:373:1: stmt : ( exprStmt newline !| doStmt | returnStmt | ifThenStmt | whileStmt );
    public final MintParser.stmt_return stmt() throws RecognitionException {
        MintParser.stmt_return retval = new MintParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.exprStmt_return exprStmt94 =null;

        MintParser.newline_return newline95 =null;

        MintParser.doStmt_return doStmt96 =null;

        MintParser.returnStmt_return returnStmt97 =null;

        MintParser.ifThenStmt_return ifThenStmt98 =null;

        MintParser.whileStmt_return whileStmt99 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:373:6: ( exprStmt newline !| doStmt | returnStmt | ifThenStmt | whileStmt )
            int alt25=5;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
            case DEC:
            case FALSE:
            case FLOAT_LITERAL:
            case IDENTIFIER:
            case INC:
            case INTEGER_LITERAL:
            case LPAREN:
            case NEW:
            case OP_BNOT:
            case OP_MINUS:
            case OP_NOT:
            case OP_PLUS:
            case STRING_LITERAL:
            case SUPER:
            case THIS:
            case TRUE:
                {
                alt25=1;
                }
                break;
            case DO:
                {
                alt25=2;
                }
                break;
            case RETURN:
                {
                alt25=3;
                }
                break;
            case IF:
                {
                alt25=4;
                }
                break;
            case WHILE:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:373:8: exprStmt newline !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exprStmt_in_stmt3069);
                    exprStmt94=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt94.getTree());

                    pushFollow(FOLLOW_newline_in_stmt3071);
                    newline95=newline();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:374:4: doStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_doStmt_in_stmt3077);
                    doStmt96=doStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doStmt96.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:374:13: returnStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_returnStmt_in_stmt3081);
                    returnStmt97=returnStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStmt97.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:374:26: ifThenStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifThenStmt_in_stmt3085);
                    ifThenStmt98=ifThenStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifThenStmt98.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:374:39: whileStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whileStmt_in_stmt3089);
                    whileStmt99=whileStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStmt99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class emptyStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "emptyStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:376:1: emptyStmt : 'pass' newline !;
    public final MintParser.emptyStmt_return emptyStmt() throws RecognitionException {
        MintParser.emptyStmt_return retval = new MintParser.emptyStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal100=null;
        MintParser.newline_return newline101 =null;


        Object string_literal100_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:376:11: ( 'pass' newline !)
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:376:13: 'pass' newline !
            {
            root_0 = (Object)adaptor.nil();


            string_literal100=(Token)match(input,PASS,FOLLOW_PASS_in_emptyStmt3097); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal100_tree = 
            (Object)adaptor.create(string_literal100)
            ;
            adaptor.addChild(root_0, string_literal100_tree);
            }

            pushFollow(FOLLOW_newline_in_emptyStmt3099);
            newline101=newline();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "emptyStmt"


    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:378:1: exprStmt : expr ;
    public final MintParser.exprStmt_return exprStmt() throws RecognitionException {
        MintParser.exprStmt_return retval = new MintParser.exprStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.expr_return expr102 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:378:10: ( expr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:379:9: expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprStmt3116);
            expr102=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr102.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprStmt"


    public static class ifThenStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifThenStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:1: ifThenStmt : ( 'if' '(' expr ')' block ( elsifClause )* ( elseClause )? ) -> ^( 'if' expr block ( elsifClause )* ( elseClause )? ) ;
    public final MintParser.ifThenStmt_return ifThenStmt() throws RecognitionException {
        MintParser.ifThenStmt_return retval = new MintParser.ifThenStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        MintParser.expr_return expr105 =null;

        MintParser.block_return block107 =null;

        MintParser.elsifClause_return elsifClause108 =null;

        MintParser.elseClause_return elseClause109 =null;


        Object string_literal103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_elsifClause=new RewriteRuleSubtreeStream(adaptor,"rule elsifClause");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_elseClause=new RewriteRuleSubtreeStream(adaptor,"rule elseClause");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:12: ( ( 'if' '(' expr ')' block ( elsifClause )* ( elseClause )? ) -> ^( 'if' expr block ( elsifClause )* ( elseClause )? ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:14: ( 'if' '(' expr ')' block ( elsifClause )* ( elseClause )? )
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:14: ( 'if' '(' expr ')' block ( elsifClause )* ( elseClause )? )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:15: 'if' '(' expr ')' block ( elsifClause )* ( elseClause )?
            {
            string_literal103=(Token)match(input,IF,FOLLOW_IF_in_ifThenStmt3126); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal103);


            char_literal104=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifThenStmt3128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal104);


            pushFollow(FOLLOW_expr_in_ifThenStmt3130);
            expr105=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());

            char_literal106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifThenStmt3132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal106);


            pushFollow(FOLLOW_block_in_ifThenStmt3134);
            block107=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block107.getTree());

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:39: ( elsifClause )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ELSIF) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:39: elsifClause
            	    {
            	    pushFollow(FOLLOW_elsifClause_in_ifThenStmt3136);
            	    elsifClause108=elsifClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elsifClause.add(elsifClause108.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:52: ( elseClause )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ELSE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:389:52: elseClause
                    {
                    pushFollow(FOLLOW_elseClause_in_ifThenStmt3139);
                    elseClause109=elseClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseClause.add(elseClause109.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: elsifClause, block, IF, elseClause, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 390:3: -> ^( 'if' expr block ( elsifClause )* ( elseClause )? )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:390:6: ^( 'if' expr block ( elsifClause )* ( elseClause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IF.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:390:24: ( elsifClause )*
                while ( stream_elsifClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifClause.nextTree());

                }
                stream_elsifClause.reset();

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:390:37: ( elseClause )?
                if ( stream_elseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseClause.nextTree());

                }
                stream_elseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifThenStmt"


    public static class elsifClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elsifClause"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:392:1: elsifClause : 'elsif' ^ '(' ! expr ')' ! block ;
    public final MintParser.elsifClause_return elsifClause() throws RecognitionException {
        MintParser.elsifClause_return retval = new MintParser.elsifClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        MintParser.expr_return expr112 =null;

        MintParser.block_return block114 =null;


        Object string_literal110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:393:2: ( 'elsif' ^ '(' ! expr ')' ! block )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:393:4: 'elsif' ^ '(' ! expr ')' ! block
            {
            root_0 = (Object)adaptor.nil();


            string_literal110=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifClause3169); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal110_tree = 
            (Object)adaptor.create(string_literal110)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal110_tree, root_0);
            }

            char_literal111=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_elsifClause3172); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_elsifClause3175);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr112.getTree());

            char_literal113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_elsifClause3177); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_elsifClause3180);
            block114=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block114.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elsifClause"


    public static class elseClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseClause"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:395:1: elseClause : 'else' ^ block ;
    public final MintParser.elseClause_return elseClause() throws RecognitionException {
        MintParser.elseClause_return retval = new MintParser.elseClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal115=null;
        MintParser.block_return block116 =null;


        Object string_literal115_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:396:2: ( 'else' ^ block )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:396:4: 'else' ^ block
            {
            root_0 = (Object)adaptor.nil();


            string_literal115=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseClause3189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal115_tree = 
            (Object)adaptor.create(string_literal115)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal115_tree, root_0);
            }

            pushFollow(FOLLOW_block_in_elseClause3192);
            block116=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block116.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseClause"


    public static class whileStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:398:1: whileStmt : 'while' ^ '(' ! expr ')' ! block ;
    public final MintParser.whileStmt_return whileStmt() throws RecognitionException {
        MintParser.whileStmt_return retval = new MintParser.whileStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        MintParser.expr_return expr119 =null;

        MintParser.block_return block121 =null;


        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:398:11: ( 'while' ^ '(' ! expr ')' ! block )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:398:13: 'while' ^ '(' ! expr ')' ! block
            {
            root_0 = (Object)adaptor.nil();


            string_literal117=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStmt3200); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal117_tree = 
            (Object)adaptor.create(string_literal117)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal117_tree, root_0);
            }

            char_literal118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileStmt3203); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_whileStmt3206);
            expr119=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

            char_literal120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileStmt3208); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_whileStmt3211);
            block121=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block121.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStmt"


    public static class doStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:400:1: doStmt : 'do' block 'while' '(' expr ')' newline -> ^( 'do' expr block ) ;
    public final MintParser.doStmt_return doStmt() throws RecognitionException {
        MintParser.doStmt_return retval = new MintParser.doStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal122=null;
        Token string_literal124=null;
        Token char_literal125=null;
        Token char_literal127=null;
        MintParser.block_return block123 =null;

        MintParser.expr_return expr126 =null;

        MintParser.newline_return newline128 =null;


        Object string_literal122_tree=null;
        Object string_literal124_tree=null;
        Object char_literal125_tree=null;
        Object char_literal127_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_newline=new RewriteRuleSubtreeStream(adaptor,"rule newline");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:400:8: ( 'do' block 'while' '(' expr ')' newline -> ^( 'do' expr block ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:400:10: 'do' block 'while' '(' expr ')' newline
            {
            string_literal122=(Token)match(input,DO,FOLLOW_DO_in_doStmt3219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(string_literal122);


            pushFollow(FOLLOW_block_in_doStmt3221);
            block123=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block123.getTree());

            string_literal124=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStmt3223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal124);


            char_literal125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doStmt3225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal125);


            pushFollow(FOLLOW_expr_in_doStmt3227);
            expr126=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr126.getTree());

            char_literal127=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStmt3229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal127);


            pushFollow(FOLLOW_newline_in_doStmt3231);
            newline128=newline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_newline.add(newline128.getTree());

            // AST REWRITE
            // elements: expr, DO, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 400:50: -> ^( 'do' expr block )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:400:53: ^( 'do' expr block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DO.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doStmt"


    public static class returnStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStmt"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:402:1: returnStmt : 'return' ^ ( expr )? newline !;
    public final MintParser.returnStmt_return returnStmt() throws RecognitionException {
        MintParser.returnStmt_return retval = new MintParser.returnStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal129=null;
        MintParser.expr_return expr130 =null;

        MintParser.newline_return newline131 =null;


        Object string_literal129_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:402:12: ( 'return' ^ ( expr )? newline !)
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:402:14: 'return' ^ ( expr )? newline !
            {
            root_0 = (Object)adaptor.nil();


            string_literal129=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStmt3249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal129_tree = 
            (Object)adaptor.create(string_literal129)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal129_tree, root_0);
            }

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:402:24: ( expr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CHAR_LITERAL||LA28_0==DEC||LA28_0==FALSE||LA28_0==FLOAT_LITERAL||LA28_0==IDENTIFIER||LA28_0==INC||LA28_0==INTEGER_LITERAL||LA28_0==LPAREN||LA28_0==NEW||LA28_0==OP_BNOT||LA28_0==OP_MINUS||LA28_0==OP_NOT||LA28_0==OP_PLUS||(LA28_0 >= STRING_LITERAL && LA28_0 <= THIS)||LA28_0==TRUE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:402:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_returnStmt3254);
                    expr130=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr130.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_newline_in_returnStmt3259);
            newline131=newline();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnStmt"


    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:406:1: primary : ( literal | 'this' ( '.' IDENTIFIER )* (arg= argumentList )? -> { arg != null }? ^( CALL ^( NAME 'this' ( IDENTIFIER )* ) ( argumentList )? ) -> ^( FIELD_ACCESS 'this' ( IDENTIFIER )* ) | '(' ! expr ')' !| 'new' ^ classType argumentList | 'super' argumentList -> ^( CALL 'super' argumentList ) | 'super' '.' IDENTIFIER (arg= argumentList )? -> {arg != null}? ^( CALL ^( NAME 'super' IDENTIFIER argumentList ) ) -> ^( FIELD_ACCESS 'super' IDENTIFIER ) | name ( '.' IDENTIFIER )* (args= argumentList )? -> { args != null }? ^( CALL ^( NAME name ( IDENTIFIER )* ) ( argumentList )? ) -> ^( FIELD_ACCESS name ( IDENTIFIER )* ) );
    public final MintParser.primary_return primary() throws RecognitionException {
        MintParser.primary_return retval = new MintParser.primary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal133=null;
        Token char_literal134=null;
        Token IDENTIFIER135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token string_literal139=null;
        Token string_literal142=null;
        Token string_literal144=null;
        Token char_literal145=null;
        Token IDENTIFIER146=null;
        Token char_literal148=null;
        Token IDENTIFIER149=null;
        MintParser.argumentList_return arg =null;

        MintParser.argumentList_return args =null;

        MintParser.literal_return literal132 =null;

        MintParser.expr_return expr137 =null;

        MintParser.classType_return classType140 =null;

        MintParser.argumentList_return argumentList141 =null;

        MintParser.argumentList_return argumentList143 =null;

        MintParser.name_return name147 =null;


        Object string_literal133_tree=null;
        Object char_literal134_tree=null;
        Object IDENTIFIER135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        Object string_literal139_tree=null;
        Object string_literal142_tree=null;
        Object string_literal144_tree=null;
        Object char_literal145_tree=null;
        Object IDENTIFIER146_tree=null;
        Object char_literal148_tree=null;
        Object IDENTIFIER149_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:407:2: ( literal | 'this' ( '.' IDENTIFIER )* (arg= argumentList )? -> { arg != null }? ^( CALL ^( NAME 'this' ( IDENTIFIER )* ) ( argumentList )? ) -> ^( FIELD_ACCESS 'this' ( IDENTIFIER )* ) | '(' ! expr ')' !| 'new' ^ classType argumentList | 'super' argumentList -> ^( CALL 'super' argumentList ) | 'super' '.' IDENTIFIER (arg= argumentList )? -> {arg != null}? ^( CALL ^( NAME 'super' IDENTIFIER argumentList ) ) -> ^( FIELD_ACCESS 'super' IDENTIFIER ) | name ( '.' IDENTIFIER )* (args= argumentList )? -> { args != null }? ^( CALL ^( NAME name ( IDENTIFIER )* ) ( argumentList )? ) -> ^( FIELD_ACCESS name ( IDENTIFIER )* ) )
            int alt34=7;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
            case FALSE:
            case FLOAT_LITERAL:
            case INTEGER_LITERAL:
            case STRING_LITERAL:
            case TRUE:
                {
                alt34=1;
                }
                break;
            case THIS:
                {
                alt34=2;
                }
                break;
            case LPAREN:
                {
                alt34=3;
                }
                break;
            case NEW:
                {
                alt34=4;
                }
                break;
            case SUPER:
                {
                int LA34_5 = input.LA(2);

                if ( (LA34_5==DOT) ) {
                    alt34=6;
                }
                else if ( (LA34_5==LPAREN) ) {
                    alt34=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 5, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                alt34=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:407:4: literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primary3272);
                    literal132=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal132.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:408:4: 'this' ( '.' IDENTIFIER )* (arg= argumentList )?
                    {
                    string_literal133=(Token)match(input,THIS,FOLLOW_THIS_in_primary3278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(string_literal133);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:408:11: ( '.' IDENTIFIER )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==DOT) ) {
                            int LA29_2 = input.LA(2);

                            if ( (LA29_2==IDENTIFIER) ) {
                                alt29=1;
                            }


                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:408:12: '.' IDENTIFIER
                    	    {
                    	    char_literal134=(Token)match(input,DOT,FOLLOW_DOT_in_primary3281); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal134);


                    	    IDENTIFIER135=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary3283); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER135);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:408:32: (arg= argumentList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPAREN) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:408:32: arg= argumentList
                            {
                            pushFollow(FOLLOW_argumentList_in_primary3289);
                            arg=argumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentList.add(arg.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: argumentList, THIS, IDENTIFIER, IDENTIFIER, THIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 409:3: -> { arg != null }? ^( CALL ^( NAME 'this' ( IDENTIFIER )* ) ( argumentList )? )
                    if ( arg != null ) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:409:23: ^( CALL ^( NAME 'this' ( IDENTIFIER )* ) ( argumentList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:409:30: ^( NAME 'this' ( IDENTIFIER )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_THIS.nextNode()
                        );

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:409:44: ( IDENTIFIER )*
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:409:57: ( argumentList )?
                        if ( stream_argumentList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentList.nextTree());

                        }
                        stream_argumentList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 410:3: -> ^( FIELD_ACCESS 'this' ( IDENTIFIER )* )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:410:6: ^( FIELD_ACCESS 'this' ( IDENTIFIER )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_THIS.nextNode()
                        );

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:410:29: ( IDENTIFIER )*
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:411:4: '(' ! expr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primary3333); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_primary3336);
                    expr137=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr137.getTree());

                    char_literal138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primary3338); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:413:4: 'new' ^ classType argumentList
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal139=(Token)match(input,NEW,FOLLOW_NEW_in_primary3346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal139_tree = 
                    (Object)adaptor.create(string_literal139)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(string_literal139_tree, root_0);
                    }

                    pushFollow(FOLLOW_classType_in_primary3349);
                    classType140=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType140.getTree());

                    pushFollow(FOLLOW_argumentList_in_primary3351);
                    argumentList141=argumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentList141.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:414:4: 'super' argumentList
                    {
                    string_literal142=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary3356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(string_literal142);


                    pushFollow(FOLLOW_argumentList_in_primary3358);
                    argumentList143=argumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentList.add(argumentList143.getTree());

                    // AST REWRITE
                    // elements: argumentList, SUPER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 414:25: -> ^( CALL 'super' argumentList )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:414:28: ^( CALL 'super' argumentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_1, stream_argumentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:415:11: 'super' '.' IDENTIFIER (arg= argumentList )?
                    {
                    string_literal144=(Token)match(input,SUPER,FOLLOW_SUPER_in_primary3380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(string_literal144);


                    char_literal145=(Token)match(input,DOT,FOLLOW_DOT_in_primary3382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal145);


                    IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary3384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:415:37: (arg= argumentList )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==LPAREN) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:415:37: arg= argumentList
                            {
                            pushFollow(FOLLOW_argumentList_in_primary3388);
                            arg=argumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentList.add(arg.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: SUPER, IDENTIFIER, SUPER, argumentList, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 416:10: -> {arg != null}? ^( CALL ^( NAME 'super' IDENTIFIER argumentList ) )
                    if (arg != null) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:416:28: ^( CALL ^( NAME 'super' IDENTIFIER argumentList ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:416:35: ^( NAME 'super' IDENTIFIER argumentList )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_2, stream_argumentList.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 417:10: -> ^( FIELD_ACCESS 'super' IDENTIFIER )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:417:13: ^( FIELD_ACCESS 'super' IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:418:11: name ( '.' IDENTIFIER )* (args= argumentList )?
                    {
                    pushFollow(FOLLOW_name_in_primary3447);
                    name147=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name147.getTree());

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:418:16: ( '.' IDENTIFIER )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==DOT) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==IDENTIFIER) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:418:17: '.' IDENTIFIER
                    	    {
                    	    char_literal148=(Token)match(input,DOT,FOLLOW_DOT_in_primary3450); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal148);


                    	    IDENTIFIER149=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary3452); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER149);


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:418:38: (args= argumentList )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LPAREN) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:418:38: args= argumentList
                            {
                            pushFollow(FOLLOW_argumentList_in_primary3458);
                            args=argumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentList.add(args.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: name, IDENTIFIER, IDENTIFIER, name, argumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:10: -> { args != null }? ^( CALL ^( NAME name ( IDENTIFIER )* ) ( argumentList )? )
                    if ( args != null ) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:419:31: ^( CALL ^( NAME name ( IDENTIFIER )* ) ( argumentList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:419:38: ^( NAME name ( IDENTIFIER )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NAME, "NAME")
                        , root_2);

                        adaptor.addChild(root_2, stream_name.nextTree());

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:419:50: ( IDENTIFIER )*
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:419:63: ( argumentList )?
                        if ( stream_argumentList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentList.nextTree());

                        }
                        stream_argumentList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 420:10: -> ^( FIELD_ACCESS name ( IDENTIFIER )* )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:420:13: ^( FIELD_ACCESS name ( IDENTIFIER )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:420:33: ( IDENTIFIER )*
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class argumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentList"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:424:1: argumentList : '(' ( expr ( ',' expr )* )? ')' -> ^( ARGS ( expr )* ) ;
    public final MintParser.argumentList_return argumentList() throws RecognitionException {
        MintParser.argumentList_return retval = new MintParser.argumentList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        Token char_literal154=null;
        MintParser.expr_return expr151 =null;

        MintParser.expr_return expr153 =null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object char_literal154_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:9: ( '(' ( expr ( ',' expr )* )? ')' -> ^( ARGS ( expr )* ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:11: '(' ( expr ( ',' expr )* )? ')'
            {
            char_literal150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentList3536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal150);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:15: ( expr ( ',' expr )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==CHAR_LITERAL||LA36_0==DEC||LA36_0==FALSE||LA36_0==FLOAT_LITERAL||LA36_0==IDENTIFIER||LA36_0==INC||LA36_0==INTEGER_LITERAL||LA36_0==LPAREN||LA36_0==NEW||LA36_0==OP_BNOT||LA36_0==OP_MINUS||LA36_0==OP_NOT||LA36_0==OP_PLUS||(LA36_0 >= STRING_LITERAL && LA36_0 <= THIS)||LA36_0==TRUE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:16: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_argumentList3539);
                    expr151=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr151.getTree());

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:21: ( ',' expr )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==COMMA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:23: ',' expr
                    	    {
                    	    char_literal152=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentList3543); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal152);


                    	    pushFollow(FOLLOW_expr_in_argumentList3545);
                    	    expr153=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr153.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentList3556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal154);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 425:45: -> ^( ARGS ( expr )* )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:48: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_1);

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:425:55: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentList"


    public static class arrayCreationType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayCreationType"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:427:1: arrayCreationType : ( primitiveType | classType );
    public final MintParser.arrayCreationType_return arrayCreationType() throws RecognitionException {
        MintParser.arrayCreationType_return retval = new MintParser.arrayCreationType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.primitiveType_return primitiveType155 =null;

        MintParser.classType_return classType156 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:428:2: ( primitiveType | classType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BOOLEAN||LA37_0==FLOAT||LA37_0==INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==IDENTIFIER) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:428:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_arrayCreationType3574);
                    primitiveType155=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType155.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:428:20: classType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classType_in_arrayCreationType3578);
                    classType156=classType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classType156.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayCreationType"


    public static class arrayCreationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayCreationExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:430:1: arrayCreationExpr : 'new' arrayCreationType ( '[' expr ']' )* -> ^( ARRAY_CREATION arrayCreationType ^( ARGS ( expr )+ ) ) ;
    public final MintParser.arrayCreationExpr_return arrayCreationExpr() throws RecognitionException {
        MintParser.arrayCreationExpr_return retval = new MintParser.arrayCreationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        MintParser.arrayCreationType_return arrayCreationType158 =null;

        MintParser.expr_return expr160 =null;


        Object string_literal157_tree=null;
        Object char_literal159_tree=null;
        Object char_literal161_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_arrayCreationType=new RewriteRuleSubtreeStream(adaptor,"rule arrayCreationType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:9: ( 'new' arrayCreationType ( '[' expr ']' )* -> ^( ARRAY_CREATION arrayCreationType ^( ARGS ( expr )+ ) ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:11: 'new' arrayCreationType ( '[' expr ']' )*
            {
            string_literal157=(Token)match(input,NEW,FOLLOW_NEW_in_arrayCreationExpr3596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(string_literal157);


            pushFollow(FOLLOW_arrayCreationType_in_arrayCreationExpr3598);
            arrayCreationType158=arrayCreationType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayCreationType.add(arrayCreationType158.getTree());

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:35: ( '[' expr ']' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LBRACKET) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:36: '[' expr ']'
            	    {
            	    char_literal159=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreationExpr3601); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal159);


            	    pushFollow(FOLLOW_expr_in_arrayCreationExpr3603);
            	    expr160=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr160.getTree());

            	    char_literal161=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreationExpr3605); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal161);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // AST REWRITE
            // elements: expr, arrayCreationType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 431:51: -> ^( ARRAY_CREATION arrayCreationType ^( ARGS ( expr )+ ) )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:54: ^( ARRAY_CREATION arrayCreationType ^( ARGS ( expr )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAY_CREATION, "ARRAY_CREATION")
                , root_1);

                adaptor.addChild(root_1, stream_arrayCreationType.nextTree());

                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:431:89: ^( ARGS ( expr )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_2);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayCreationExpr"


    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:433:1: selector : ( '.' IDENTIFIER (arg= argumentList )? -> { arg != null }? ^( CALL IDENTIFIER ( argumentList )? ) -> ^( FIELD_ACCESS IDENTIFIER ) | '.' 'super' argumentList -> ^( CALL 'super' argumentList ) | '.' 'super' '.' IDENTIFIER (arg= argumentList )? -> {arg != null}? ^( CALL 'super' IDENTIFIER ( argumentList )? ) -> ^( FIELD_ACCESS 'super' IDENTIFIER ) | '[' expr ']' -> ^( ARRAY_ACCESS expr ) );
    public final MintParser.selector_return selector() throws RecognitionException {
        MintParser.selector_return retval = new MintParser.selector_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal162=null;
        Token IDENTIFIER163=null;
        Token char_literal164=null;
        Token string_literal165=null;
        Token char_literal167=null;
        Token string_literal168=null;
        Token char_literal169=null;
        Token IDENTIFIER170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        MintParser.argumentList_return arg =null;

        MintParser.argumentList_return argumentList166 =null;

        MintParser.expr_return expr172 =null;


        Object char_literal162_tree=null;
        Object IDENTIFIER163_tree=null;
        Object char_literal164_tree=null;
        Object string_literal165_tree=null;
        Object char_literal167_tree=null;
        Object string_literal168_tree=null;
        Object char_literal169_tree=null;
        Object IDENTIFIER170_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:434:5: ( '.' IDENTIFIER (arg= argumentList )? -> { arg != null }? ^( CALL IDENTIFIER ( argumentList )? ) -> ^( FIELD_ACCESS IDENTIFIER ) | '.' 'super' argumentList -> ^( CALL 'super' argumentList ) | '.' 'super' '.' IDENTIFIER (arg= argumentList )? -> {arg != null}? ^( CALL 'super' IDENTIFIER ( argumentList )? ) -> ^( FIELD_ACCESS 'super' IDENTIFIER ) | '[' expr ']' -> ^( ARRAY_ACCESS expr ) )
            int alt41=4;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DOT) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==IDENTIFIER) ) {
                    alt41=1;
                }
                else if ( (LA41_1==SUPER) ) {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==DOT) ) {
                        alt41=3;
                    }
                    else if ( (LA41_4==LPAREN) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA41_0==LBRACKET) ) {
                alt41=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:434:9: '.' IDENTIFIER (arg= argumentList )?
                    {
                    char_literal162=(Token)match(input,DOT,FOLLOW_DOT_in_selector3637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal162);


                    IDENTIFIER163=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER163);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:434:27: (arg= argumentList )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==LPAREN) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:434:27: arg= argumentList
                            {
                            pushFollow(FOLLOW_argumentList_in_selector3643);
                            arg=argumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentList.add(arg.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: argumentList, IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:6: -> { arg != null }? ^( CALL IDENTIFIER ( argumentList )? )
                    if ( arg != null ) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:435:26: ^( CALL IDENTIFIER ( argumentList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:435:44: ( argumentList )?
                        if ( stream_argumentList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentList.nextTree());

                        }
                        stream_argumentList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 436:6: -> ^( FIELD_ACCESS IDENTIFIER )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:436:9: ^( FIELD_ACCESS IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:437:9: '.' 'super' argumentList
                    {
                    char_literal164=(Token)match(input,DOT,FOLLOW_DOT_in_selector3685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal164);


                    string_literal165=(Token)match(input,SUPER,FOLLOW_SUPER_in_selector3687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(string_literal165);


                    pushFollow(FOLLOW_argumentList_in_selector3689);
                    argumentList166=argumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentList.add(argumentList166.getTree());

                    // AST REWRITE
                    // elements: SUPER, argumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 437:34: -> ^( CALL 'super' argumentList )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:437:37: ^( CALL 'super' argumentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_1, stream_argumentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:438:7: '.' 'super' '.' IDENTIFIER (arg= argumentList )?
                    {
                    char_literal167=(Token)match(input,DOT,FOLLOW_DOT_in_selector3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal167);


                    string_literal168=(Token)match(input,SUPER,FOLLOW_SUPER_in_selector3709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(string_literal168);


                    char_literal169=(Token)match(input,DOT,FOLLOW_DOT_in_selector3711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal169);


                    IDENTIFIER170=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector3713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER170);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:438:37: (arg= argumentList )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LPAREN) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:438:37: arg= argumentList
                            {
                            pushFollow(FOLLOW_argumentList_in_selector3717);
                            arg=argumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argumentList.add(arg.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENTIFIER, argumentList, SUPER, IDENTIFIER, SUPER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 439:2: -> {arg != null}? ^( CALL 'super' IDENTIFIER ( argumentList )? )
                    if (arg != null) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:439:20: ^( CALL 'super' IDENTIFIER ( argumentList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:439:46: ( argumentList )?
                        if ( stream_argumentList.hasNext() ) {
                            adaptor.addChild(root_1, stream_argumentList.nextTree());

                        }
                        stream_argumentList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 440:2: -> ^( FIELD_ACCESS 'super' IDENTIFIER )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:440:5: ^( FIELD_ACCESS 'super' IDENTIFIER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SUPER.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:441:9: '[' expr ']'
                    {
                    char_literal171=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_selector3755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(char_literal171);


                    pushFollow(FOLLOW_expr_in_selector3757);
                    expr172=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr172.getTree());

                    char_literal173=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_selector3759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(char_literal173);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 441:22: -> ^( ARRAY_ACCESS expr )
                    {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:441:25: ^( ARRAY_ACCESS expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfixExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:444:1: postfixExpr : ( primary (s+= selector )* (op+= '++' |op+= '--' )* -> { $s != null && $op != null}? ^( POST ^( ACCESS ^( SELECTOR ( selector )* ) primary ) ( $op)* ) -> { $s != null }? ^( ACCESS ^( SELECTOR ( selector )* ) primary ) -> { $op != null }? ^( POST primary ( $op)* ) -> primary | arrayCreationExpr );
    public final MintParser.postfixExpr_return postfixExpr() throws RecognitionException {
        MintParser.postfixExpr_return retval = new MintParser.postfixExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token op=null;
        List list_op=null;
        List list_s=null;
        MintParser.primary_return primary174 =null;

        MintParser.arrayCreationExpr_return arrayCreationExpr175 =null;

        RuleReturnScope s = null;
        Object op_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:2: ( primary (s+= selector )* (op+= '++' |op+= '--' )* -> { $s != null && $op != null}? ^( POST ^( ACCESS ^( SELECTOR ( selector )* ) primary ) ( $op)* ) -> { $s != null }? ^( ACCESS ^( SELECTOR ( selector )* ) primary ) -> { $op != null }? ^( POST primary ( $op)* ) -> primary | arrayCreationExpr )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==CHAR_LITERAL||LA44_0==FALSE||LA44_0==FLOAT_LITERAL||LA44_0==IDENTIFIER||LA44_0==INTEGER_LITERAL||LA44_0==LPAREN||(LA44_0 >= STRING_LITERAL && LA44_0 <= THIS)||LA44_0==TRUE) ) {
                alt44=1;
            }
            else if ( (LA44_0==NEW) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==IDENTIFIER) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==LPAREN) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==EOF||LA44_3==AND||(LA44_3 >= ASSIGN_BAND && LA44_3 <= ASSIGN_XOR)||LA44_3==COMMA||(LA44_3 >= EQUAL && LA44_3 <= EQUALS)||(LA44_3 >= GREATER && LA44_3 <= GTE)||(LA44_3 >= LBRACKET && LA44_3 <= LESS)||LA44_3==LTE||(LA44_3 >= NEWLINE && LA44_3 <= OP_BAND)||(LA44_3 >= OP_BOR && LA44_3 <= OP_MULT)||(LA44_3 >= OP_OR && LA44_3 <= OP_PLUS)||LA44_3==RBRACKET||LA44_3==RPAREN) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA44_2==BOOLEAN||LA44_2==FLOAT||LA44_2==INT) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:4: primary (s+= selector )* (op+= '++' |op+= '--' )*
                    {
                    pushFollow(FOLLOW_primary_in_postfixExpr3782);
                    primary174=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary.add(primary174.getTree());

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:13: (s+= selector )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==DOT||LA42_0==LBRACKET) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:13: s+= selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_postfixExpr3786);
                    	    s=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selector.add(s.getTree());
                    	    if (list_s==null) list_s=new ArrayList();
                    	    list_s.add(s.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:25: (op+= '++' |op+= '--' )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==INC) ) {
                            alt43=1;
                        }
                        else if ( (LA43_0==DEC) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:26: op+= '++'
                    	    {
                    	    op=(Token)match(input,INC,FOLLOW_INC_in_postfixExpr3792); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_INC.add(op);

                    	    if (list_op==null) list_op=new ArrayList();
                    	    list_op.add(op);


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:445:37: op+= '--'
                    	    {
                    	    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixExpr3798); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DEC.add(op);

                    	    if (list_op==null) list_op=new ArrayList();
                    	    list_op.add(op);


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: primary, op, selector, op, primary, primary, selector, primary
                    // token labels: 
                    // rule labels: retval
                    // token list labels: op
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op", list_op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 446:3: -> { $s != null && $op != null}? ^( POST ^( ACCESS ^( SELECTOR ( selector )* ) primary ) ( $op)* )
                    if ( list_s != null && list_op != null) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:446:36: ^( POST ^( ACCESS ^( SELECTOR ( selector )* ) primary ) ( $op)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POST, "POST")
                        , root_1);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:446:43: ^( ACCESS ^( SELECTOR ( selector )* ) primary )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ACCESS, "ACCESS")
                        , root_2);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:446:52: ^( SELECTOR ( selector )* )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECTOR, "SELECTOR")
                        , root_3);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:446:63: ( selector )*
                        while ( stream_selector.hasNext() ) {
                            adaptor.addChild(root_3, stream_selector.nextTree());

                        }
                        stream_selector.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_2, stream_primary.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:446:84: ( $op)*
                        while ( stream_op.hasNext() ) {
                            adaptor.addChild(root_1, stream_op.nextNode());

                        }
                        stream_op.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 447:3: -> { $s != null }? ^( ACCESS ^( SELECTOR ( selector )* ) primary )
                    if ( list_s != null ) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:447:22: ^( ACCESS ^( SELECTOR ( selector )* ) primary )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ACCESS, "ACCESS")
                        , root_1);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:447:31: ^( SELECTOR ( selector )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECTOR, "SELECTOR")
                        , root_2);

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:447:42: ( selector )*
                        while ( stream_selector.hasNext() ) {
                            adaptor.addChild(root_2, stream_selector.nextTree());

                        }
                        stream_selector.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_primary.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 448:3: -> { $op != null }? ^( POST primary ( $op)* )
                    if ( list_op != null ) {
                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:448:23: ^( POST primary ( $op)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(POST, "POST")
                        , root_1);

                        adaptor.addChild(root_1, stream_primary.nextTree());

                        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:448:39: ( $op)*
                        while ( stream_op.hasNext() ) {
                            adaptor.addChild(root_1, stream_op.nextNode());

                        }
                        stream_op.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 449:3: -> primary
                    {
                        adaptor.addChild(root_0, stream_primary.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:450:4: arrayCreationExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayCreationExpr_in_postfixExpr3874);
                    arrayCreationExpr175=arrayCreationExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreationExpr175.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"


    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:453:1: unaryExpr : ( preIncrementExpr | preDecrementExpr | '+' ! unaryExpr | '-' ^ unaryExpr | unaryExprNotPlusMinus );
    public final MintParser.unaryExpr_return unaryExpr() throws RecognitionException {
        MintParser.unaryExpr_return retval = new MintParser.unaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal178=null;
        Token char_literal180=null;
        MintParser.preIncrementExpr_return preIncrementExpr176 =null;

        MintParser.preDecrementExpr_return preDecrementExpr177 =null;

        MintParser.unaryExpr_return unaryExpr179 =null;

        MintParser.unaryExpr_return unaryExpr181 =null;

        MintParser.unaryExprNotPlusMinus_return unaryExprNotPlusMinus182 =null;


        Object char_literal178_tree=null;
        Object char_literal180_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:454:2: ( preIncrementExpr | preDecrementExpr | '+' ! unaryExpr | '-' ^ unaryExpr | unaryExprNotPlusMinus )
            int alt45=5;
            switch ( input.LA(1) ) {
            case INC:
                {
                alt45=1;
                }
                break;
            case DEC:
                {
                alt45=2;
                }
                break;
            case OP_PLUS:
                {
                alt45=3;
                }
                break;
            case OP_MINUS:
                {
                alt45=4;
                }
                break;
            case CHAR_LITERAL:
            case FALSE:
            case FLOAT_LITERAL:
            case IDENTIFIER:
            case INTEGER_LITERAL:
            case LPAREN:
            case NEW:
            case OP_BNOT:
            case OP_NOT:
            case STRING_LITERAL:
            case SUPER:
            case THIS:
            case TRUE:
                {
                alt45=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:454:4: preIncrementExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_preIncrementExpr_in_unaryExpr3885);
                    preIncrementExpr176=preIncrementExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, preIncrementExpr176.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:455:4: preDecrementExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_preDecrementExpr_in_unaryExpr3891);
                    preDecrementExpr177=preDecrementExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, preDecrementExpr177.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:456:4: '+' ! unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal178=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_unaryExpr3897); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr3900);
                    unaryExpr179=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr179.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:457:4: '-' ^ unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal180=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_unaryExpr3905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = 
                    (Object)adaptor.create(char_literal180)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal180_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr3908);
                    unaryExpr181=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr181.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:458:4: unaryExprNotPlusMinus
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unaryExprNotPlusMinus_in_unaryExpr3913);
                    unaryExprNotPlusMinus182=unaryExprNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExprNotPlusMinus182.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"


    public static class preIncrementExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "preIncrementExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:460:1: preIncrementExpr : '++' ^ unaryExpr ;
    public final MintParser.preIncrementExpr_return preIncrementExpr() throws RecognitionException {
        MintParser.preIncrementExpr_return retval = new MintParser.preIncrementExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal183=null;
        MintParser.unaryExpr_return unaryExpr184 =null;


        Object string_literal183_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:461:2: ( '++' ^ unaryExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:461:4: '++' ^ unaryExpr
            {
            root_0 = (Object)adaptor.nil();


            string_literal183=(Token)match(input,INC,FOLLOW_INC_in_preIncrementExpr3923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal183_tree = 
            (Object)adaptor.create(string_literal183)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal183_tree, root_0);
            }

            pushFollow(FOLLOW_unaryExpr_in_preIncrementExpr3926);
            unaryExpr184=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr184.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "preIncrementExpr"


    public static class preDecrementExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "preDecrementExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:463:1: preDecrementExpr : '--' ^ unaryExpr ;
    public final MintParser.preDecrementExpr_return preDecrementExpr() throws RecognitionException {
        MintParser.preDecrementExpr_return retval = new MintParser.preDecrementExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal185=null;
        MintParser.unaryExpr_return unaryExpr186 =null;


        Object string_literal185_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:464:2: ( '--' ^ unaryExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:464:4: '--' ^ unaryExpr
            {
            root_0 = (Object)adaptor.nil();


            string_literal185=(Token)match(input,DEC,FOLLOW_DEC_in_preDecrementExpr3936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal185_tree = 
            (Object)adaptor.create(string_literal185)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal185_tree, root_0);
            }

            pushFollow(FOLLOW_unaryExpr_in_preDecrementExpr3939);
            unaryExpr186=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr186.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "preDecrementExpr"


    public static class unaryExprNotPlusMinus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExprNotPlusMinus"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:466:1: unaryExprNotPlusMinus : ( ( '(' type ')' )=> castExpr | postfixExpr | '~' ^ unaryExpr | '!' ^ unaryExpr );
    public final MintParser.unaryExprNotPlusMinus_return unaryExprNotPlusMinus() throws RecognitionException {
        MintParser.unaryExprNotPlusMinus_return retval = new MintParser.unaryExprNotPlusMinus_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal189=null;
        Token char_literal191=null;
        MintParser.castExpr_return castExpr187 =null;

        MintParser.postfixExpr_return postfixExpr188 =null;

        MintParser.unaryExpr_return unaryExpr190 =null;

        MintParser.unaryExpr_return unaryExpr192 =null;


        Object char_literal189_tree=null;
        Object char_literal191_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:467:9: ( ( '(' type ')' )=> castExpr | postfixExpr | '~' ^ unaryExpr | '!' ^ unaryExpr )
            int alt46=4;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                int LA46_1 = input.LA(2);

                if ( (synpred2_Mint()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
                }
                break;
            case CHAR_LITERAL:
            case FALSE:
            case FLOAT_LITERAL:
            case IDENTIFIER:
            case INTEGER_LITERAL:
            case NEW:
            case STRING_LITERAL:
            case SUPER:
            case THIS:
            case TRUE:
                {
                alt46=2;
                }
                break;
            case OP_BNOT:
                {
                alt46=3;
                }
                break;
            case OP_NOT:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:467:12: ( '(' type ')' )=> castExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_castExpr_in_unaryExprNotPlusMinus3969);
                    castExpr187=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr187.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:468:4: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfixExpr_in_unaryExprNotPlusMinus3974);
                    postfixExpr188=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr188.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:469:4: '~' ^ unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal189=(Token)match(input,OP_BNOT,FOLLOW_OP_BNOT_in_unaryExprNotPlusMinus3980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal189_tree = 
                    (Object)adaptor.create(char_literal189)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal189_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpr_in_unaryExprNotPlusMinus3983);
                    unaryExpr190=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr190.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:470:4: '!' ^ unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal191=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_unaryExprNotPlusMinus3989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal191_tree = 
                    (Object)adaptor.create(char_literal191)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal191_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpr_in_unaryExprNotPlusMinus3992);
                    unaryExpr192=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr192.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExprNotPlusMinus"


    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "castExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:473:1: castExpr : '(' type ')' unaryExpr -> ^( CAST type unaryExpr ) ;
    public final MintParser.castExpr_return castExpr() throws RecognitionException {
        MintParser.castExpr_return retval = new MintParser.castExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal193=null;
        Token char_literal195=null;
        MintParser.type_return type194 =null;

        MintParser.unaryExpr_return unaryExpr196 =null;


        Object char_literal193_tree=null;
        Object char_literal195_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:473:10: ( '(' type ')' unaryExpr -> ^( CAST type unaryExpr ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:473:12: '(' type ')' unaryExpr
            {
            char_literal193=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpr4003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(char_literal193);


            pushFollow(FOLLOW_type_in_castExpr4005);
            type194=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type194.getTree());

            char_literal195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpr4007); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(char_literal195);


            pushFollow(FOLLOW_unaryExpr_in_castExpr4009);
            unaryExpr196=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr196.getTree());

            // AST REWRITE
            // elements: unaryExpr, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 473:35: -> ^( CAST type unaryExpr )
            {
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:473:38: ^( CAST type unaryExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CAST, "CAST")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_unaryExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "castExpr"


    public static class multiplicativeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:1: multiplicativeExpr : ( unaryExpr ) ( ( '*' | '/' | '%' ) ^ unaryExpr )* ;
    public final MintParser.multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        MintParser.multiplicativeExpr_return retval = new MintParser.multiplicativeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set198=null;
        MintParser.unaryExpr_return unaryExpr197 =null;

        MintParser.unaryExpr_return unaryExpr199 =null;


        Object set198_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:20: ( ( unaryExpr ) ( ( '*' | '/' | '%' ) ^ unaryExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:22: ( unaryExpr ) ( ( '*' | '/' | '%' ) ^ unaryExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:22: ( unaryExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:23: unaryExpr
            {
            pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr4028);
            unaryExpr197=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr197.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:34: ( ( '*' | '/' | '%' ) ^ unaryExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==OP_DIV||(LA47_0 >= OP_MOD && LA47_0 <= OP_MULT)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:475:35: ( '*' | '/' | '%' ) ^ unaryExpr
            	    {
            	    set198=(Token)input.LT(1);

            	    set198=(Token)input.LT(1);

            	    if ( input.LA(1)==OP_DIV||(input.LA(1) >= OP_MOD && input.LA(1) <= OP_MULT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set198)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr4046);
            	    unaryExpr199=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr199.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpr"


    public static class additiveExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:1: additiveExpr : ( multiplicativeExpr ) ( ( '+' | '-' ) ^ multiplicativeExpr )* ;
    public final MintParser.additiveExpr_return additiveExpr() throws RecognitionException {
        MintParser.additiveExpr_return retval = new MintParser.additiveExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set201=null;
        MintParser.multiplicativeExpr_return multiplicativeExpr200 =null;

        MintParser.multiplicativeExpr_return multiplicativeExpr202 =null;


        Object set201_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:14: ( ( multiplicativeExpr ) ( ( '+' | '-' ) ^ multiplicativeExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:16: ( multiplicativeExpr ) ( ( '+' | '-' ) ^ multiplicativeExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:16: ( multiplicativeExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:17: multiplicativeExpr
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4057);
            multiplicativeExpr200=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr200.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:37: ( ( '+' | '-' ) ^ multiplicativeExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==OP_MINUS||LA48_0==OP_PLUS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:477:38: ( '+' | '-' ) ^ multiplicativeExpr
            	    {
            	    set201=(Token)input.LT(1);

            	    set201=(Token)input.LT(1);

            	    if ( input.LA(1)==OP_MINUS||input.LA(1)==OP_PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set201)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4072);
            	    multiplicativeExpr202=multiplicativeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr202.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExpr"


    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:1: relationalExpr : ( additiveExpr ) ( ( '<' | '>' | '<=' | '>=' ) ^ additiveExpr )* ;
    public final MintParser.relationalExpr_return relationalExpr() throws RecognitionException {
        MintParser.relationalExpr_return retval = new MintParser.relationalExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set204=null;
        MintParser.additiveExpr_return additiveExpr203 =null;

        MintParser.additiveExpr_return additiveExpr205 =null;


        Object set204_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:16: ( ( additiveExpr ) ( ( '<' | '>' | '<=' | '>=' ) ^ additiveExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:18: ( additiveExpr ) ( ( '<' | '>' | '<=' | '>=' ) ^ additiveExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:18: ( additiveExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:19: additiveExpr
            {
            pushFollow(FOLLOW_additiveExpr_in_relationalExpr4083);
            additiveExpr203=additiveExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr203.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:33: ( ( '<' | '>' | '<=' | '>=' ) ^ additiveExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0 >= GREATER && LA49_0 <= GTE)||LA49_0==LESS||LA49_0==LTE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:479:34: ( '<' | '>' | '<=' | '>=' ) ^ additiveExpr
            	    {
            	    set204=(Token)input.LT(1);

            	    set204=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GTE)||input.LA(1)==LESS||input.LA(1)==LTE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set204)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExpr_in_relationalExpr4106);
            	    additiveExpr205=additiveExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr205.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:1: equalityExpr : ( relationalExpr ) ( ( '==' | '!=' ) ^ relationalExpr )* ;
    public final MintParser.equalityExpr_return equalityExpr() throws RecognitionException {
        MintParser.equalityExpr_return retval = new MintParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set207=null;
        MintParser.relationalExpr_return relationalExpr206 =null;

        MintParser.relationalExpr_return relationalExpr208 =null;


        Object set207_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:14: ( ( relationalExpr ) ( ( '==' | '!=' ) ^ relationalExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:16: ( relationalExpr ) ( ( '==' | '!=' ) ^ relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:16: ( relationalExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:17: relationalExpr
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr4117);
            relationalExpr206=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr206.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:33: ( ( '==' | '!=' ) ^ relationalExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ASSIGN_NOT||LA50_0==EQUALS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:481:34: ( '==' | '!=' ) ^ relationalExpr
            	    {
            	    set207=(Token)input.LT(1);

            	    set207=(Token)input.LT(1);

            	    if ( input.LA(1)==ASSIGN_NOT||input.LA(1)==EQUALS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set207)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr4130);
            	    relationalExpr208=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr208.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"


    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:1: andExpr : ( equalityExpr ) ( '&' ^ equalityExpr )* ;
    public final MintParser.andExpr_return andExpr() throws RecognitionException {
        MintParser.andExpr_return retval = new MintParser.andExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal210=null;
        MintParser.equalityExpr_return equalityExpr209 =null;

        MintParser.equalityExpr_return equalityExpr211 =null;


        Object char_literal210_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:9: ( ( equalityExpr ) ( '&' ^ equalityExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:11: ( equalityExpr ) ( '&' ^ equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:11: ( equalityExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:12: equalityExpr
            {
            pushFollow(FOLLOW_equalityExpr_in_andExpr4141);
            equalityExpr209=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr209.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:26: ( '&' ^ equalityExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==OP_BAND) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:483:27: '&' ^ equalityExpr
            	    {
            	    char_literal210=(Token)match(input,OP_BAND,FOLLOW_OP_BAND_in_andExpr4145); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal210_tree = 
            	    (Object)adaptor.create(char_literal210)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal210_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equalityExpr_in_andExpr4148);
            	    equalityExpr211=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr211.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class exclusiveOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exclusiveOrExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:1: exclusiveOrExpr : ( andExpr ) ( '^' ^ andExpr )* ;
    public final MintParser.exclusiveOrExpr_return exclusiveOrExpr() throws RecognitionException {
        MintParser.exclusiveOrExpr_return retval = new MintParser.exclusiveOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal213=null;
        MintParser.andExpr_return andExpr212 =null;

        MintParser.andExpr_return andExpr214 =null;


        Object char_literal213_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:17: ( ( andExpr ) ( '^' ^ andExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:19: ( andExpr ) ( '^' ^ andExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:19: ( andExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:20: andExpr
            {
            pushFollow(FOLLOW_andExpr_in_exclusiveOrExpr4159);
            andExpr212=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr212.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:29: ( '^' ^ andExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==OP_CARET) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:485:30: '^' ^ andExpr
            	    {
            	    char_literal213=(Token)match(input,OP_CARET,FOLLOW_OP_CARET_in_exclusiveOrExpr4163); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal213_tree = 
            	    (Object)adaptor.create(char_literal213)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal213_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_andExpr_in_exclusiveOrExpr4166);
            	    andExpr214=andExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr214.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exclusiveOrExpr"


    public static class inclusiveOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inclusiveOrExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:1: inclusiveOrExpr : ( exclusiveOrExpr ) ( '|' ^ exclusiveOrExpr )* ;
    public final MintParser.inclusiveOrExpr_return inclusiveOrExpr() throws RecognitionException {
        MintParser.inclusiveOrExpr_return retval = new MintParser.inclusiveOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal216=null;
        MintParser.exclusiveOrExpr_return exclusiveOrExpr215 =null;

        MintParser.exclusiveOrExpr_return exclusiveOrExpr217 =null;


        Object char_literal216_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:17: ( ( exclusiveOrExpr ) ( '|' ^ exclusiveOrExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:19: ( exclusiveOrExpr ) ( '|' ^ exclusiveOrExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:19: ( exclusiveOrExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:20: exclusiveOrExpr
            {
            pushFollow(FOLLOW_exclusiveOrExpr_in_inclusiveOrExpr4177);
            exclusiveOrExpr215=exclusiveOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpr215.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:37: ( '|' ^ exclusiveOrExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==OP_BOR) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:487:38: '|' ^ exclusiveOrExpr
            	    {
            	    char_literal216=(Token)match(input,OP_BOR,FOLLOW_OP_BOR_in_inclusiveOrExpr4181); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal216_tree = 
            	    (Object)adaptor.create(char_literal216)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal216_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_exclusiveOrExpr_in_inclusiveOrExpr4184);
            	    exclusiveOrExpr217=exclusiveOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpr217.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inclusiveOrExpr"


    public static class conditionalAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:1: conditionalAndExpr : ( inclusiveOrExpr ) ( '&&' ^ inclusiveOrExpr )* ;
    public final MintParser.conditionalAndExpr_return conditionalAndExpr() throws RecognitionException {
        MintParser.conditionalAndExpr_return retval = new MintParser.conditionalAndExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal219=null;
        MintParser.inclusiveOrExpr_return inclusiveOrExpr218 =null;

        MintParser.inclusiveOrExpr_return inclusiveOrExpr220 =null;


        Object string_literal219_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:20: ( ( inclusiveOrExpr ) ( '&&' ^ inclusiveOrExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:22: ( inclusiveOrExpr ) ( '&&' ^ inclusiveOrExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:22: ( inclusiveOrExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:23: inclusiveOrExpr
            {
            pushFollow(FOLLOW_inclusiveOrExpr_in_conditionalAndExpr4195);
            inclusiveOrExpr218=inclusiveOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpr218.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:40: ( '&&' ^ inclusiveOrExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AND) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:489:41: '&&' ^ inclusiveOrExpr
            	    {
            	    string_literal219=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpr4199); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal219_tree = 
            	    (Object)adaptor.create(string_literal219)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal219_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_inclusiveOrExpr_in_conditionalAndExpr4202);
            	    inclusiveOrExpr220=inclusiveOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpr220.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpr"


    public static class conditionalOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:1: conditionalOrExpr : ( conditionalAndExpr ) ( '||' ^ conditionalAndExpr )* ;
    public final MintParser.conditionalOrExpr_return conditionalOrExpr() throws RecognitionException {
        MintParser.conditionalOrExpr_return retval = new MintParser.conditionalOrExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal222=null;
        MintParser.conditionalAndExpr_return conditionalAndExpr221 =null;

        MintParser.conditionalAndExpr_return conditionalAndExpr223 =null;


        Object string_literal222_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:19: ( ( conditionalAndExpr ) ( '||' ^ conditionalAndExpr )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:21: ( conditionalAndExpr ) ( '||' ^ conditionalAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:21: ( conditionalAndExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:22: conditionalAndExpr
            {
            pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr4213);
            conditionalAndExpr221=conditionalAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr221.getTree());

            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:42: ( '||' ^ conditionalAndExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==OP_OR) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:491:43: '||' ^ conditionalAndExpr
            	    {
            	    string_literal222=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_conditionalOrExpr4217); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal222_tree = 
            	    (Object)adaptor.create(string_literal222)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal222_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conditionalAndExpr_in_conditionalOrExpr4220);
            	    conditionalAndExpr223=conditionalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpr223.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpr"


    public static class conditionalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:493:1: conditionalExpr : conditionalOrExpr ;
    public final MintParser.conditionalExpr_return conditionalExpr() throws RecognitionException {
        MintParser.conditionalExpr_return retval = new MintParser.conditionalExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.conditionalOrExpr_return conditionalOrExpr224 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:493:17: ( conditionalOrExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:493:19: conditionalOrExpr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpr_in_conditionalExpr4230);
            conditionalOrExpr224=conditionalOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpr224.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalExpr"


    public static class assignmentExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:496:1: assignmentExpr : conditionalExpr ( assignmentOperator ^ assignmentExpr )? ;
    public final MintParser.assignmentExpr_return assignmentExpr() throws RecognitionException {
        MintParser.assignmentExpr_return retval = new MintParser.assignmentExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.conditionalExpr_return conditionalExpr225 =null;

        MintParser.assignmentOperator_return assignmentOperator226 =null;

        MintParser.assignmentExpr_return assignmentExpr227 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:497:9: ( conditionalExpr ( assignmentOperator ^ assignmentExpr )? )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:497:11: conditionalExpr ( assignmentOperator ^ assignmentExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalExpr_in_assignmentExpr4248);
            conditionalExpr225=conditionalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpr225.getTree());

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:497:27: ( assignmentOperator ^ assignmentExpr )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= ASSIGN_BAND && LA56_0 <= ASSIGN_MULT)||(LA56_0 >= ASSIGN_PLUS && LA56_0 <= ASSIGN_XOR)||LA56_0==EQUAL) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:497:28: assignmentOperator ^ assignmentExpr
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpr4251);
                    assignmentOperator226=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignmentOperator226.getTree(), root_0);

                    pushFollow(FOLLOW_assignmentExpr_in_assignmentExpr4254);
                    assignmentExpr227=assignmentExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpr227.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentExpr"


    public static class leftHandSide_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftHandSide"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:501:1: leftHandSide : primary ;
    public final MintParser.leftHandSide_return leftHandSide() throws RecognitionException {
        MintParser.leftHandSide_return retval = new MintParser.leftHandSide_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.primary_return primary228 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:502:9: ( primary )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:502:11: primary
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_primary_in_leftHandSide4283);
            primary228=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary228.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftHandSide"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:504:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '&=' | '^=' | '|=' );
    public final MintParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        MintParser.assignmentOperator_return retval = new MintParser.assignmentOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set229=null;

        Object set229_tree=null;

        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:504:20: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '&=' | '^=' | '|=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            {
            root_0 = (Object)adaptor.nil();


            set229=(Token)input.LT(1);

            if ( (input.LA(1) >= ASSIGN_BAND && input.LA(1) <= ASSIGN_MULT)||(input.LA(1) >= ASSIGN_PLUS && input.LA(1) <= ASSIGN_XOR)||input.LA(1)==EQUAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set229)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:506:1: expr : assignmentExpr ;
    public final MintParser.expr_return expr() throws RecognitionException {
        MintParser.expr_return retval = new MintParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MintParser.assignmentExpr_return assignmentExpr230 =null;



        try {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:506:6: ( assignmentExpr )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:507:9: assignmentExpr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpr_in_expr4341);
            assignmentExpr230=assignmentExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpr230.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    // $ANTLR start synpred1_Mint
    public final void synpred1_Mint_fragment() throws RecognitionException {
        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:353:2: ( INDENT ( 'this' | 'super' ) '(' )
        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:353:3: INDENT ( 'this' | 'super' ) '('
        {
        match(input,INDENT,FOLLOW_INDENT_in_synpred1_Mint2896); if (state.failed) return ;

        if ( (input.LA(1) >= SUPER && input.LA(1) <= THIS) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_Mint2906); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Mint

    // $ANTLR start synpred2_Mint
    public final void synpred2_Mint_fragment() throws RecognitionException {
        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:467:12: ( '(' type ')' )
        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:467:14: '(' type ')'
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_Mint3959); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred2_Mint3961);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred2_Mint3963); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Mint

    // Delegated rules

    public final boolean synpred2_Mint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Mint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Mint() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Mint_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_NEWLINE_in_compilationUnit2294 = new BitSet(new long[]{0x2000000002000000L,0x000000000000D000L});
    public static final BitSet FOLLOW_classDeclaration_in_compilationUnit2298 = new BitSet(new long[]{0x2000000002000000L,0x000000000000D000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_type2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_type2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_referenceType2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_referenceType2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_classType2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_arrayType2395 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayType2397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayType2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_arrayType2412 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayType2414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayType2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_name2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classDeclaration2457 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration2460 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration2464 = new BitSet(new long[]{0x0002004000000000L});
    public static final BitSet FOLLOW_superExtend_in_classDeclaration2466 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_superExtend2493 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_classType_in_superExtend2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_classBody2505 = new BitSet(new long[]{0x0008440000200000L,0x000000000200D400L});
    public static final BitSet FOLLOW_classBodyDeclarations_in_classBody2507 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_dedent_in_classBody2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBodyDeclarations2523 = new BitSet(new long[]{0x0008440000200002L,0x000000000200D000L});
    public static final BitSet FOLLOW_emptyStmt_in_classBodyDeclarations2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classMemberDeclaration_in_classBodyDeclaration2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDeclaration_in_classBodyDeclaration2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_classMemberDeclaration2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_classMemberDeclaration2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDeclaration2576 = new BitSet(new long[]{0x0008440000200000L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration2578 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration2580 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_fieldDeclaration2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration2605 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration2607 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_fieldDeclaration2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators2629 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarators2632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators2634 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclarator2649 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_EQUAL_in_variableDeclarator2654 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_variableDeclarator2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodHeader_in_methodDeclaration2676 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodHeader2696 = new BitSet(new long[]{0x0008440000200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_methodType_in_methodHeader2699 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_methodDeclarator_in_methodHeader2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodType_in_methodHeader2715 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_methodDeclarator_in_methodHeader2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_methodType2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_methodType2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclarator2747 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_methodDeclarator2749 = new BitSet(new long[]{0x0008440000200000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterList_in_methodDeclarator2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_methodDeclarator2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList2777 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList2780 = new BitSet(new long[]{0x0008440000200000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameterList2782 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_formalParameter2798 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_formalParameter2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_constructorDeclaration2811 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_constructorDeclarator_in_constructorDeclaration2813 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_constructorBody_in_constructorDeclaration2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDeclarator_in_constructorDeclaration2838 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_constructorBody_in_constructorDeclaration2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constructorDeclarator2864 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_constructorDeclarator2866 = new BitSet(new long[]{0x0008440000200000L,0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameterList_in_constructorDeclarator2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_constructorDeclarator2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_constructorBody2911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2914 = new BitSet(new long[]{0x9099CC80A1200000L,0x0000000005720548L});
    public static final BitSet FOLLOW_blockStmts_in_constructorBody2916 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_dedent_in_constructorBody2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_constructorBody2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_explicitConstructorInvocation2948 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation2954 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_argumentList_in_explicitConstructorInvocation2958 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_explicitConstructorInvocation2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_block2982 = new BitSet(new long[]{0x9099CC80A1200000L,0x0000000005720548L});
    public static final BitSet FOLLOW_blockStmts_in_block2984 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_dedent_in_block2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStmt_in_blockStmts3004 = new BitSet(new long[]{0x9099CC80A1200002L,0x0000000005720148L});
    public static final BitSet FOLLOW_blockStmt_in_blockStmts3008 = new BitSet(new long[]{0x9099CC80A1200002L,0x0000000005720148L});
    public static final BitSet FOLLOW_emptyStmt_in_blockStmts3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStmt_in_blockStmt3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_blockStmt3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_localVariableDeclarationStmt3046 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclarationStmt3048 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_localVariableDeclarationStmt3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt3069 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_stmt3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStmt_in_stmt3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStmt_in_stmt3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifThenStmt_in_stmt3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_stmt3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASS_in_emptyStmt3097 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_emptyStmt3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifThenStmt3126 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_ifThenStmt3128 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_ifThenStmt3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_ifThenStmt3132 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_ifThenStmt3134 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_elsifClause_in_ifThenStmt3136 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_elseClause_in_ifThenStmt3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifClause3169 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_elsifClause3172 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_elsifClause3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_elsifClause3177 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_elsifClause3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseClause3189 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_elseClause3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStmt3200 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_whileStmt3203 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_whileStmt3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_whileStmt3208 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_whileStmt3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStmt3219 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_block_in_doStmt3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHILE_in_doStmt3223 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_doStmt3225 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_doStmt3227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_doStmt3229 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_doStmt3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStmt3249 = new BitSet(new long[]{0xB091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_returnStmt3254 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_newline_in_returnStmt3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary3278 = new BitSet(new long[]{0x0080000100000002L});
    public static final BitSet FOLLOW_DOT_in_primary3281 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary3283 = new BitSet(new long[]{0x0080000100000002L});
    public static final BitSet FOLLOW_argumentList_in_primary3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary3333 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_primary3336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_primary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_primary3346 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_classType_in_primary3349 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_argumentList_in_primary3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary3356 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_argumentList_in_primary3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary3380 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DOT_in_primary3382 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary3384 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_argumentList_in_primary3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_primary3447 = new BitSet(new long[]{0x0080000100000002L});
    public static final BitSet FOLLOW_DOT_in_primary3450 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary3452 = new BitSet(new long[]{0x0080000100000002L});
    public static final BitSet FOLLOW_argumentList_in_primary3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentList3536 = new BitSet(new long[]{0x9091488021000000L,0x0000000001740148L});
    public static final BitSet FOLLOW_expr_in_argumentList3539 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_argumentList3543 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_argumentList3545 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentList3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_arrayCreationType3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_arrayCreationType3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreationExpr3596 = new BitSet(new long[]{0x0008440000200000L});
    public static final BitSet FOLLOW_arrayCreationType_in_arrayCreationExpr3598 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreationExpr3601 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_arrayCreationExpr3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreationExpr3605 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector3637 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3639 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_argumentList_in_selector3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SUPER_in_selector3687 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_argumentList_in_selector3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SUPER_in_selector3709 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_DOT_in_selector3711 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector3713 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_argumentList_in_selector3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_selector3755 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_expr_in_selector3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACKET_in_selector3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfixExpr3782 = new BitSet(new long[]{0x0021000120000002L});
    public static final BitSet FOLLOW_selector_in_postfixExpr3786 = new BitSet(new long[]{0x0021000120000002L});
    public static final BitSet FOLLOW_INC_in_postfixExpr3792 = new BitSet(new long[]{0x0001000020000002L});
    public static final BitSet FOLLOW_DEC_in_postfixExpr3798 = new BitSet(new long[]{0x0001000020000002L});
    public static final BitSet FOLLOW_arrayCreationExpr_in_postfixExpr3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preIncrementExpr_in_unaryExpr3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preDecrementExpr_in_unaryExpr3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PLUS_in_unaryExpr3897 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MINUS_in_unaryExpr3905 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExprNotPlusMinus_in_unaryExpr3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_preIncrementExpr3923 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_preIncrementExpr3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_preDecrementExpr3936 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_preDecrementExpr3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_unaryExprNotPlusMinus3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExprNotPlusMinus3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_BNOT_in_unaryExprNotPlusMinus3980 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExprNotPlusMinus3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_unaryExprNotPlusMinus3989 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExprNotPlusMinus3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_castExpr4003 = new BitSet(new long[]{0x0008440000200000L});
    public static final BitSet FOLLOW_type_in_castExpr4005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpr4007 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr4028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000034L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4032 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr4046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000034L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_set_in_additiveExpr4061 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr4083 = new BitSet(new long[]{0x0140300000000002L});
    public static final BitSet FOLLOW_set_in_relationalExpr4087 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr4106 = new BitSet(new long[]{0x0140300000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr4117 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_set_in_equalityExpr4121 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr4130 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr4141 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_OP_BAND_in_andExpr4145 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr4148 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_exclusiveOrExpr4159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CARET_in_exclusiveOrExpr4163 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_andExpr_in_exclusiveOrExpr4166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_exclusiveOrExpr_in_inclusiveOrExpr4177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_BOR_in_inclusiveOrExpr4181 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_exclusiveOrExpr_in_inclusiveOrExpr4184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_inclusiveOrExpr_in_conditionalAndExpr4195 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpr4199 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_inclusiveOrExpr_in_conditionalAndExpr4202 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr4213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_OP_OR_in_conditionalOrExpr4217 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_conditionalAndExpr_in_conditionalOrExpr4220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_conditionalOrExpr_in_conditionalExpr4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpr_in_assignmentExpr4248 = new BitSet(new long[]{0x0000000800077C02L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpr4251 = new BitSet(new long[]{0x9091488021000000L,0x0000000001700148L});
    public static final BitSet FOLLOW_assignmentExpr_in_assignmentExpr4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_leftHandSide4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpr_in_expr4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_synpred1_Mint2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_synpred1_Mint2898 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_Mint2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred2_Mint3959 = new BitSet(new long[]{0x0008440000200000L});
    public static final BitSet FOLLOW_type_in_synpred2_Mint3961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred2_Mint3963 = new BitSet(new long[]{0x0000000000000002L});

}