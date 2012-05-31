// $ANTLR 3.4 C:\\Users\\komandox\\Desktop\\Mint\\Mint.g 2012-05-26 16:51:33
 package mint; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MintLexer extends Lexer {
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

            private Stack<Integer> indentation = initStack();
                    public int getIndentation() { return indentation.peek(); }
            
    	static Stack<Integer> initStack() {
    		Stack<Integer> s = new Stack<Integer>();
    		s.push(0);
    		return s;
    	}
    	
    	List tokens = new ArrayList();
    	public void emit(Token token) {
    	        state.token = token;
    	        tokens.add(token);
    	}
    	public Token nextToken() {
    	        super.nextToken();
    	        if ( tokens.size()==0 ) {
    	            return Token.EOF_TOKEN;
    	        }
    	        return (Token)tokens.remove(0);
    	}



    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MintLexer() {} 
    public MintLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MintLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\komandox\\Desktop\\Mint\\Mint.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:28:5: ( '&&' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:28:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ASSIGN_BAND"
    public final void mASSIGN_BAND() throws RecognitionException {
        try {
            int _type = ASSIGN_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:29:13: ( '&=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:29:15: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_BAND"

    // $ANTLR start "ASSIGN_BOR"
    public final void mASSIGN_BOR() throws RecognitionException {
        try {
            int _type = ASSIGN_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:30:12: ( '|=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:30:14: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_BOR"

    // $ANTLR start "ASSIGN_DIV"
    public final void mASSIGN_DIV() throws RecognitionException {
        try {
            int _type = ASSIGN_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:31:12: ( '/=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:31:14: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_DIV"

    // $ANTLR start "ASSIGN_MOD"
    public final void mASSIGN_MOD() throws RecognitionException {
        try {
            int _type = ASSIGN_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:32:12: ( '%=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:32:14: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_MOD"

    // $ANTLR start "ASSIGN_MULT"
    public final void mASSIGN_MULT() throws RecognitionException {
        try {
            int _type = ASSIGN_MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:33:13: ( '*=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:33:15: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_MULT"

    // $ANTLR start "ASSIGN_NOT"
    public final void mASSIGN_NOT() throws RecognitionException {
        try {
            int _type = ASSIGN_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:34:12: ( '!=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:34:14: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_NOT"

    // $ANTLR start "ASSIGN_PLUS"
    public final void mASSIGN_PLUS() throws RecognitionException {
        try {
            int _type = ASSIGN_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:35:13: ( '+=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:35:15: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_PLUS"

    // $ANTLR start "ASSIGN_SUB"
    public final void mASSIGN_SUB() throws RecognitionException {
        try {
            int _type = ASSIGN_SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:36:12: ( '-=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:36:14: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_SUB"

    // $ANTLR start "ASSIGN_XOR"
    public final void mASSIGN_XOR() throws RecognitionException {
        try {
            int _type = ASSIGN_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:37:12: ( '^=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:37:14: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_XOR"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:38:9: ( 'boolean' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:38:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:39:7: ( 'class' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:39:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:40:7: ( ',' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:41:5: ( '--' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:41:7: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:42:4: ( 'do' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:42:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:43:5: ( '.' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:43:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:44:6: ( 'else' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:44:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:45:7: ( 'elsif' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:45:9: 'elsif'
            {
            match("elsif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSIF"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:46:7: ( '=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:46:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:47:8: ( '==' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:47:10: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:48:9: ( 'extends' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:48:11: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:49:7: ( 'false' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:49:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:50:7: ( 'float' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:50:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:51:9: ( '>' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:51:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:52:5: ( '>=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:52:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:53:4: ( 'if' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:53:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:54:5: ( '++' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:54:7: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:55:5: ( 'int' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:55:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:56:10: ( '[' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:56:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:57:6: ( '<' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:57:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:58:8: ( '(' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:58:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:59:5: ( '<=' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:59:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:60:5: ( 'new' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:60:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "OP_BAND"
    public final void mOP_BAND() throws RecognitionException {
        try {
            int _type = OP_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:61:9: ( '&' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:61:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_BAND"

    // $ANTLR start "OP_BNOT"
    public final void mOP_BNOT() throws RecognitionException {
        try {
            int _type = OP_BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:62:9: ( '~' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:62:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_BNOT"

    // $ANTLR start "OP_BOR"
    public final void mOP_BOR() throws RecognitionException {
        try {
            int _type = OP_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:63:8: ( '|' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:63:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_BOR"

    // $ANTLR start "OP_CARET"
    public final void mOP_CARET() throws RecognitionException {
        try {
            int _type = OP_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:64:10: ( '^' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:64:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_CARET"

    // $ANTLR start "OP_DIV"
    public final void mOP_DIV() throws RecognitionException {
        try {
            int _type = OP_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:65:8: ( '/' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:65:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_DIV"

    // $ANTLR start "OP_MINUS"
    public final void mOP_MINUS() throws RecognitionException {
        try {
            int _type = OP_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:66:10: ( '-' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:66:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_MINUS"

    // $ANTLR start "OP_MOD"
    public final void mOP_MOD() throws RecognitionException {
        try {
            int _type = OP_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:67:8: ( '%' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:67:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_MOD"

    // $ANTLR start "OP_MULT"
    public final void mOP_MULT() throws RecognitionException {
        try {
            int _type = OP_MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:68:9: ( '*' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:68:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_MULT"

    // $ANTLR start "OP_NOT"
    public final void mOP_NOT() throws RecognitionException {
        try {
            int _type = OP_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:69:8: ( '!' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:69:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_NOT"

    // $ANTLR start "OP_OR"
    public final void mOP_OR() throws RecognitionException {
        try {
            int _type = OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:70:7: ( '||' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:70:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_OR"

    // $ANTLR start "OP_PLUS"
    public final void mOP_PLUS() throws RecognitionException {
        try {
            int _type = OP_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:71:9: ( '+' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:71:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP_PLUS"

    // $ANTLR start "PASS"
    public final void mPASS() throws RecognitionException {
        try {
            int _type = PASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:72:6: ( 'pass' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:72:8: 'pass'
            {
            match("pass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PASS"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:73:9: ( 'private' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:73:11: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:74:11: ( 'protected' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:74:13: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:75:8: ( 'public' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:75:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:76:10: ( ']' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:76:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:77:8: ( 'return' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:77:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:78:8: ( ')' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:78:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:79:7: ( 'super' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:79:9: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:80:6: ( 'this' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:80:8: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:81:6: ( 'true' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:81:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:82:6: ( 'void' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:82:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:83:7: ( 'while' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:83:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:134:9: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:134:11: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:134:39: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:137:9: ( '\"' (~ ( '\"' | '\\r' | '\\n' ) )* '\"' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:137:11: '\"' (~ ( '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:137:15: (~ ( '\"' | '\\r' | '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "FLOAT_LITERAL"
    public final void mFLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:9: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ) | ( '.' ( '0' .. '9' )+ ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
                    {
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:12: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
                    {
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:12: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:27: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:43: ( ( '0' .. '9' )+ '.' )
                    {
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:43: ( ( '0' .. '9' )+ '.' )
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:44: ( '0' .. '9' )+ '.'
                    {
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:44: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match('.'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:63: ( '.' ( '0' .. '9' )+ )
                    {
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:63: ( '.' ( '0' .. '9' )+ )
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:64: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:140:67: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_LITERAL"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:143:9: ( '\\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) '\\'' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:143:11: '\\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' ) '\\''
            {
            match('\''); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:146:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:146:11: ( '0' .. '9' )+
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:146:11: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_LITERAL"

    // $ANTLR start "INDENTATION"
    public final void mINDENTATION() throws RecognitionException {
        try {
            int _type = INDENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken ws=null;

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:12: ( ( ( '\\r' )? '\\n' WS )* ( '\\r' )? '\\n' (ws= WS ) )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:15: ( ( '\\r' )? '\\n' WS )* ( '\\r' )? '\\n' (ws= WS )
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:15: ( ( '\\r' )? '\\n' WS )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:16: ( '\\r' )? '\\n' WS
            	    {
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:16: ( '\\r' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='\r') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:16: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:31: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:41: (ws= WS )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:149:42: ws= WS
            {
            int wsStart694 = getCharIndex();
            int wsStartLine694 = getLine();
            int wsStartCharPos694 = getCharPositionInLine();
            mWS(); 
            ws = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, wsStart694, getCharIndex()-1);
            ws.setLine(wsStartLine694);
            ws.setCharPositionInLine(wsStartCharPos694);


            }



                    int start = getCharIndex();
                    int startLine = getLine();
                    int startCharPos = getCharPositionInLine();

                    int indentsize = ws.getText().replace("\t", "    ").replace("<EOF>", "").length();

                    CommonToken token = null;

            //	System.out.print(ws.getText());
            //	System.out.print(indentsize);
            //	System.out.print(" ");
            //	System.out.println(getIndentation());
            	
            	
                    if (indentsize > getIndentation()) {
                       token = new CommonToken(INDENT); 
                       token.setText("INDENT\n");
                       indentation.push(indentsize);
                       
                       token.setStartIndex(start);
                       token.setLine(startLine);
                       token.setCharPositionInLine(startCharPos);
                    
                       emit(token);
                    }
                    else if( indentsize == getIndentation()) {
                        token = new CommonToken(NEWLINE);
                        token.setText("\n");
            //            token.setChannel(HIDDEN);
                        token.setStartIndex(start);
                        token.setLine(startLine);
                        token.setCharPositionInLine(startCharPos);
                    
                        emit(token);
                    }
                    else {
                   	    boolean nl = false;
                    
            	    while (indentsize < getIndentation()) {
            	    	
            	    	if (!nl) {
            	   	token = new CommonToken(NEWLINE);
                        	token.setText("NEWLINE");
            //            	token.setChannel(HIDDEN);
                        	token.setStartIndex(start);
                        	token.setLine(startLine);
                        	token.setCharPositionInLine(startCharPos);
                    
                        	emit(token);
                        	nl = true;
                        	}
            	    
                            token = new CommonToken(DEDENT);
                            token.setText("DEDENT");
                            indentation.pop();
                            token.setStartIndex(start);
                            token.setLine(startLine);
                            token.setCharPositionInLine(startCharPos);
                    
                            emit(token);
                        }
                    }

                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDENTATION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:217:5: ( ( '\\t' | ' ' )* )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:217:7: ( '\\t' | ' ' )*
            {
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:217:7: ( '\\t' | ' ' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:219:9: ( '!' | '!=' | '\"' | '%' | '%=' | '&&' | '&' | '&=' | '*' | '*=' | '+' | '++' | '+=' | ',' | '-' | '--' | '-=' | '.' | '/' | '/=' | '<' | '<=' | '==' | '=' | '>' | '>=' | '^' | '^=' | '|' | '|=' | '||' | '~' | '[' | ']' | '(' | ')' | 'boolean' | 'class' | 'do' | 'else' | 'elsif' | 'extends' | 'false' | 'float' | 'if' | 'int' | 'new' | 'pass' | 'private' | 'protected' | 'public' | 'return' | 'super' | 'this' | 'true' | 'void' | 'while' )
            int alt13=57;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:219:12: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:220:11: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:221:11: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:222:11: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:223:11: '%='
                    {
                    match("%="); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:224:11: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:225:11: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:226:11: '&='
                    {
                    match("&="); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:228:11: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:229:11: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:230:11: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:231:11: '++'
                    {
                    match("++"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:232:11: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:233:11: ','
                    {
                    match(','); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:234:11: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:235:11: '--'
                    {
                    match("--"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:236:11: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:237:11: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 19 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:238:11: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:239:11: '/='
                    {
                    match("/="); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:240:11: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 22 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:241:11: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 23 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:242:11: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 24 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:243:11: '='
                    {
                    match('='); 

                    }
                    break;
                case 25 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:244:11: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 26 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:245:11: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 27 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:247:11: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 28 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:248:11: '^='
                    {
                    match("^="); 



                    }
                    break;
                case 29 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:249:11: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 30 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:250:11: '|='
                    {
                    match("|="); 



                    }
                    break;
                case 31 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:251:11: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 32 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:252:11: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:254:11: '['
                    {
                    match('['); 

                    }
                    break;
                case 34 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:255:11: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 35 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:256:11: '('
                    {
                    match('('); 

                    }
                    break;
                case 36 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:257:11: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 37 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:259:11: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;
                case 38 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:260:11: 'class'
                    {
                    match("class"); 



                    }
                    break;
                case 39 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:261:11: 'do'
                    {
                    match("do"); 



                    }
                    break;
                case 40 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:262:11: 'else'
                    {
                    match("else"); 



                    }
                    break;
                case 41 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:263:11: 'elsif'
                    {
                    match("elsif"); 



                    }
                    break;
                case 42 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:264:11: 'extends'
                    {
                    match("extends"); 



                    }
                    break;
                case 43 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:265:11: 'false'
                    {
                    match("false"); 



                    }
                    break;
                case 44 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:266:11: 'float'
                    {
                    match("float"); 



                    }
                    break;
                case 45 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:267:11: 'if'
                    {
                    match("if"); 



                    }
                    break;
                case 46 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:268:11: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 47 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:269:11: 'new'
                    {
                    match("new"); 



                    }
                    break;
                case 48 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:270:11: 'pass'
                    {
                    match("pass"); 



                    }
                    break;
                case 49 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:271:11: 'private'
                    {
                    match("private"); 



                    }
                    break;
                case 50 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:272:11: 'protected'
                    {
                    match("protected"); 



                    }
                    break;
                case 51 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:273:11: 'public'
                    {
                    match("public"); 



                    }
                    break;
                case 52 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:274:11: 'return'
                    {
                    match("return"); 



                    }
                    break;
                case 53 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:275:11: 'super'
                    {
                    match("super"); 



                    }
                    break;
                case 54 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:276:11: 'this'
                    {
                    match("this"); 



                    }
                    break;
                case 55 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:277:11: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 56 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:278:11: 'void'
                    {
                    match("void"); 



                    }
                    break;
                case 57 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:279:11: 'while'
                    {
                    match("while"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOKEN"

    // $ANTLR start "ERROR"
    public final void mERROR() throws RecognitionException {
        try {
            int _type = ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:282:7: ( . )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:282:9: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ERROR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:9: ( '//' ( . )* ( '\\r' )? '\\n' )
            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:11: '//' ( . )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:16: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\r') ) {
                    alt14=2;
                }
                else if ( (LA14_0=='\n') ) {
                    alt14=2;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:19: ( '\\r' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:284:19: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:8: ( AND | ASSIGN_BAND | ASSIGN_BOR | ASSIGN_DIV | ASSIGN_MOD | ASSIGN_MULT | ASSIGN_NOT | ASSIGN_PLUS | ASSIGN_SUB | ASSIGN_XOR | BOOLEAN | CLASS | COMMA | DEC | DO | DOT | ELSE | ELSIF | EQUAL | EQUALS | EXTENDS | FALSE | FLOAT | GREATER | GTE | IF | INC | INT | LBRACKET | LESS | LPAREN | LTE | NEW | OP_BAND | OP_BNOT | OP_BOR | OP_CARET | OP_DIV | OP_MINUS | OP_MOD | OP_MULT | OP_NOT | OP_OR | OP_PLUS | PASS | PRIVATE | PROTECTED | PUBLIC | RBRACKET | RETURN | RPAREN | SUPER | THIS | TRUE | VOID | WHILE | IDENTIFIER | STRING_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | INTEGER_LITERAL | INDENTATION | WS | TOKEN | ERROR | COMMENT )
        int alt16=66;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:14: ASSIGN_BAND
                {
                mASSIGN_BAND(); 


                }
                break;
            case 3 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:26: ASSIGN_BOR
                {
                mASSIGN_BOR(); 


                }
                break;
            case 4 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:37: ASSIGN_DIV
                {
                mASSIGN_DIV(); 


                }
                break;
            case 5 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:48: ASSIGN_MOD
                {
                mASSIGN_MOD(); 


                }
                break;
            case 6 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:59: ASSIGN_MULT
                {
                mASSIGN_MULT(); 


                }
                break;
            case 7 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:71: ASSIGN_NOT
                {
                mASSIGN_NOT(); 


                }
                break;
            case 8 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:82: ASSIGN_PLUS
                {
                mASSIGN_PLUS(); 


                }
                break;
            case 9 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:94: ASSIGN_SUB
                {
                mASSIGN_SUB(); 


                }
                break;
            case 10 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:105: ASSIGN_XOR
                {
                mASSIGN_XOR(); 


                }
                break;
            case 11 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:116: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 12 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:124: CLASS
                {
                mCLASS(); 


                }
                break;
            case 13 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:130: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 14 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:136: DEC
                {
                mDEC(); 


                }
                break;
            case 15 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:140: DO
                {
                mDO(); 


                }
                break;
            case 16 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:143: DOT
                {
                mDOT(); 


                }
                break;
            case 17 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:147: ELSE
                {
                mELSE(); 


                }
                break;
            case 18 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:152: ELSIF
                {
                mELSIF(); 


                }
                break;
            case 19 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:158: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 20 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:164: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 21 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:171: EXTENDS
                {
                mEXTENDS(); 


                }
                break;
            case 22 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:179: FALSE
                {
                mFALSE(); 


                }
                break;
            case 23 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:185: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 24 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:191: GREATER
                {
                mGREATER(); 


                }
                break;
            case 25 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:199: GTE
                {
                mGTE(); 


                }
                break;
            case 26 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:203: IF
                {
                mIF(); 


                }
                break;
            case 27 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:206: INC
                {
                mINC(); 


                }
                break;
            case 28 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:210: INT
                {
                mINT(); 


                }
                break;
            case 29 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:214: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 30 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:223: LESS
                {
                mLESS(); 


                }
                break;
            case 31 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:228: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 32 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:235: LTE
                {
                mLTE(); 


                }
                break;
            case 33 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:239: NEW
                {
                mNEW(); 


                }
                break;
            case 34 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:243: OP_BAND
                {
                mOP_BAND(); 


                }
                break;
            case 35 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:251: OP_BNOT
                {
                mOP_BNOT(); 


                }
                break;
            case 36 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:259: OP_BOR
                {
                mOP_BOR(); 


                }
                break;
            case 37 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:266: OP_CARET
                {
                mOP_CARET(); 


                }
                break;
            case 38 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:275: OP_DIV
                {
                mOP_DIV(); 


                }
                break;
            case 39 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:282: OP_MINUS
                {
                mOP_MINUS(); 


                }
                break;
            case 40 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:291: OP_MOD
                {
                mOP_MOD(); 


                }
                break;
            case 41 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:298: OP_MULT
                {
                mOP_MULT(); 


                }
                break;
            case 42 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:306: OP_NOT
                {
                mOP_NOT(); 


                }
                break;
            case 43 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:313: OP_OR
                {
                mOP_OR(); 


                }
                break;
            case 44 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:319: OP_PLUS
                {
                mOP_PLUS(); 


                }
                break;
            case 45 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:327: PASS
                {
                mPASS(); 


                }
                break;
            case 46 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:332: PRIVATE
                {
                mPRIVATE(); 


                }
                break;
            case 47 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:340: PROTECTED
                {
                mPROTECTED(); 


                }
                break;
            case 48 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:350: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 49 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:357: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 50 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:366: RETURN
                {
                mRETURN(); 


                }
                break;
            case 51 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:373: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 52 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:380: SUPER
                {
                mSUPER(); 


                }
                break;
            case 53 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:386: THIS
                {
                mTHIS(); 


                }
                break;
            case 54 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:391: TRUE
                {
                mTRUE(); 


                }
                break;
            case 55 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:396: VOID
                {
                mVOID(); 


                }
                break;
            case 56 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:401: WHILE
                {
                mWHILE(); 


                }
                break;
            case 57 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:407: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 58 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:418: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 59 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:433: FLOAT_LITERAL
                {
                mFLOAT_LITERAL(); 


                }
                break;
            case 60 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:447: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 


                }
                break;
            case 61 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:460: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 


                }
                break;
            case 62 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:476: INDENTATION
                {
                mINDENTATION(); 


                }
                break;
            case 63 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:488: WS
                {
                mWS(); 


                }
                break;
            case 64 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:491: TOKEN
                {
                mTOKEN(); 


                }
                break;
            case 65 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:497: ERROR
                {
                mERROR(); 


                }
                break;
            case 66 :
                // C:\\Users\\komandox\\Desktop\\Mint\\Mint.g:1:503: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA7_eotS =
        "\3\uffff\1\5\2\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\2\56\1\uffff\1\60\2\uffff";
    static final String DFA7_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\4",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "139:1: FLOAT_LITERAL : ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ) | ( '.' ( '0' .. '9' )+ ) );";
        }
    }
    static final String DFA10_eotS =
        "\2\uffff\2\4\2\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\2\12\2\11\2\uffff";
    static final String DFA10_maxS =
        "\1\15\1\12\2\40\2\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\2",
            "\1\3\1\5\2\uffff\1\5\22\uffff\1\3",
            "\1\3\1\5\2\uffff\1\5\22\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 149:15: ( ( '\\r' )? '\\n' WS )*";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\1\43\1\uffff\1\45\1\50\1\52\1\55\1\uffff\1\60\1\uffff\1"+
        "\62\1\64\1\66\1\70\1\72\1\75\76\uffff";
    static final String DFA13_eofS =
        "\116\uffff";
    static final String DFA13_minS =
        "\1\41\1\75\1\uffff\1\75\1\46\1\75\1\53\1\uffff\1\55\1\uffff\6\75"+
        "\10\uffff\1\154\1\141\1\146\1\uffff\1\141\2\uffff\1\150\36\uffff"+
        "\1\163\6\uffff\1\151\3\uffff\1\145\4\uffff";
    static final String DFA13_maxS =
        "\1\176\1\75\1\uffff\4\75\1\uffff\1\75\1\uffff\5\75\1\174\10\uffff"+
        "\1\170\1\154\1\156\1\uffff\1\165\2\uffff\1\162\36\uffff\1\163\6"+
        "\uffff\1\157\3\uffff\1\151\4\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\3\4\uffff\1\16\1\uffff\1\22\6\uffff\1\40\1\41\1\42\1"+
        "\43\1\44\1\45\1\46\1\47\3\uffff\1\57\1\uffff\1\64\1\65\1\uffff\1"+
        "\70\1\71\1\2\1\1\1\5\1\4\1\6\1\10\1\7\1\12\1\11\1\14\1\15\1\13\1"+
        "\20\1\21\1\17\1\24\1\23\1\26\1\25\1\27\1\30\1\32\1\31\1\34\1\33"+
        "\1\36\1\37\1\35\1\uffff\1\52\1\53\1\54\1\55\1\56\1\60\1\uffff\1"+
        "\63\1\66\1\67\1\uffff\1\61\1\62\1\50\1\51";
    static final String DFA13_specialS =
        "\116\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\2\uffff\1\3\1\4\1\uffff\1\23\1\24\1\5\1\6\1\7\1\10"+
            "\1\11\1\12\14\uffff\1\13\1\14\1\15\34\uffff\1\21\1\uffff\1\22"+
            "\1\16\3\uffff\1\25\1\26\1\27\1\30\1\31\2\uffff\1\32\4\uffff"+
            "\1\33\1\uffff\1\34\1\uffff\1\35\1\36\1\37\1\uffff\1\40\1\41"+
            "\4\uffff\1\17\1\uffff\1\20",
            "\1\42",
            "",
            "\1\44",
            "\1\46\26\uffff\1\47",
            "\1\51",
            "\1\53\21\uffff\1\54",
            "",
            "\1\56\17\uffff\1\57",
            "",
            "\1\61",
            "\1\63",
            "\1\65",
            "\1\67",
            "\1\71",
            "\1\73\76\uffff\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76\13\uffff\1\77",
            "\1\100\12\uffff\1\101",
            "\1\102\7\uffff\1\103",
            "",
            "\1\104\20\uffff\1\105\2\uffff\1\106",
            "",
            "",
            "\1\107\11\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112\5\uffff\1\113",
            "",
            "",
            "",
            "\1\114\3\uffff\1\115",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "219:1: TOKEN : ( '!' | '!=' | '\"' | '%' | '%=' | '&&' | '&' | '&=' | '*' | '*=' | '+' | '++' | '+=' | ',' | '-' | '--' | '-=' | '.' | '/' | '/=' | '<' | '<=' | '==' | '=' | '>' | '>=' | '^' | '^=' | '|' | '|=' | '||' | '~' | '[' | ']' | '(' | ')' | 'boolean' | 'class' | 'do' | 'else' | 'elsif' | 'extends' | 'false' | 'float' | 'if' | 'int' | 'new' | 'pass' | 'private' | 'protected' | 'public' | 'return' | 'super' | 'this' | 'true' | 'void' | 'while' );";
        }
    }
    static final String DFA16_eotS =
        "\1\50\1\54\1\57\1\62\1\64\1\66\1\70\1\73\1\76\1\100\2\102\1\uffff"+
        "\1\102\1\106\1\102\1\113\1\102\1\117\1\102\1\uffff\1\124\1\uffff"+
        "\1\102\1\uffff\1\102\1\uffff\1\102\1\uffff\4\102\1\uffff\1\144\1"+
        "\146\2\51\33\uffff\1\102\1\uffff\1\102\1\uffff\1\170\2\uffff\2\102"+
        "\2\uffff\2\102\2\uffff\1\177\1\102\4\uffff\1\102\1\uffff\3\102\1"+
        "\uffff\1\102\1\uffff\5\102\2\uffff\1\146\20\uffff\2\102\1\uffff"+
        "\2\102\1\uffff\2\102\2\uffff\1\u0094\1\uffff\1\u0095\14\102\1\u00a2"+
        "\4\102\2\uffff\1\u00a7\5\102\1\u00ad\1\u00ae\1\u00af\2\102\1\u00b2"+
        "\1\uffff\1\u00b3\1\102\1\u00b5\1\u00b6\1\uffff\4\102\1\u00bb\3\uffff"+
        "\1\u00bc\1\102\2\uffff\1\102\2\uffff\2\102\1\u00c1\1\u00c2\2\uffff"+
        "\1\u00c3\1\u00c4\1\u00c5\1\102\5\uffff\1\102\1\u00c8\1\uffff";
    static final String DFA16_eofS =
        "\u00c9\uffff";
    static final String DFA16_minS =
        "\1\0\1\46\1\75\1\57\3\75\1\53\1\55\1\75\1\157\1\154\1\uffff\1\157"+
        "\1\60\1\154\1\75\1\141\1\75\1\146\1\uffff\1\75\1\uffff\1\145\1\uffff"+
        "\1\141\1\uffff\1\145\1\uffff\1\165\1\150\1\157\1\150\1\uffff\1\0"+
        "\1\56\1\60\1\12\33\uffff\1\157\1\uffff\1\141\1\uffff\1\60\2\uffff"+
        "\1\163\1\164\2\uffff\1\154\1\157\2\uffff\1\60\1\164\4\uffff\1\167"+
        "\1\uffff\1\163\1\151\1\142\1\uffff\1\164\1\uffff\1\160\1\151\1\165"+
        "\2\151\2\uffff\1\56\20\uffff\1\154\1\163\1\uffff\2\145\1\uffff\1"+
        "\163\1\141\2\uffff\1\60\1\uffff\1\60\1\163\1\166\1\164\1\154\1\165"+
        "\1\145\1\163\1\145\1\144\1\154\1\145\1\163\1\60\1\146\1\156\1\145"+
        "\1\164\2\uffff\1\60\1\141\1\145\1\151\2\162\3\60\1\145\1\141\1\60"+
        "\1\uffff\1\60\1\144\2\60\1\uffff\1\164\2\143\1\156\1\60\3\uffff"+
        "\1\60\1\156\2\uffff\1\163\2\uffff\1\145\1\164\2\60\2\uffff\3\60"+
        "\1\145\5\uffff\1\144\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\75\1\174\7\75\1\157\1\154\1\uffff\1\157\1\71\1\170\1"+
        "\75\1\154\1\75\1\156\1\uffff\1\75\1\uffff\1\145\1\uffff\1\165\1"+
        "\uffff\1\145\1\uffff\1\165\1\162\1\157\1\150\1\uffff\1\uffff\1\71"+
        "\1\172\1\12\33\uffff\1\157\1\uffff\1\141\1\uffff\1\172\2\uffff\1"+
        "\163\1\164\2\uffff\1\154\1\157\2\uffff\1\172\1\164\4\uffff\1\167"+
        "\1\uffff\1\163\1\157\1\142\1\uffff\1\164\1\uffff\1\160\1\151\1\165"+
        "\2\151\2\uffff\1\71\20\uffff\1\154\1\163\1\uffff\1\151\1\145\1\uffff"+
        "\1\163\1\141\2\uffff\1\172\1\uffff\1\172\1\163\1\166\1\164\1\154"+
        "\1\165\1\145\1\163\1\145\1\144\1\154\1\145\1\163\1\172\1\146\1\156"+
        "\1\145\1\164\2\uffff\1\172\1\141\1\145\1\151\2\162\3\172\1\145\1"+
        "\141\1\172\1\uffff\1\172\1\144\2\172\1\uffff\1\164\2\143\1\156\1"+
        "\172\3\uffff\1\172\1\156\2\uffff\1\163\2\uffff\1\145\1\164\2\172"+
        "\2\uffff\3\172\1\145\5\uffff\1\144\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\14\uffff\1\15\7\uffff\1\35\1\uffff\1\37\1\uffff\1\43\1\uffff\1"+
        "\61\1\uffff\1\63\4\uffff\1\71\4\uffff\1\76\2\77\1\101\1\1\1\2\1"+
        "\42\1\3\1\53\1\44\1\4\1\102\1\46\1\5\1\50\1\6\1\51\1\7\1\52\1\10"+
        "\1\33\1\54\1\11\1\16\1\47\1\12\1\45\1\uffff\1\71\1\uffff\1\15\1"+
        "\uffff\1\20\1\73\2\uffff\1\24\1\23\2\uffff\1\31\1\30\2\uffff\1\35"+
        "\1\40\1\36\1\37\1\uffff\1\43\3\uffff\1\61\1\uffff\1\63\5\uffff\1"+
        "\72\1\100\1\uffff\1\75\1\74\1\76\1\1\1\2\1\3\1\53\1\4\1\5\1\6\1"+
        "\7\1\10\1\33\1\11\1\16\1\12\2\uffff\1\17\2\uffff\1\24\2\uffff\1"+
        "\31\1\32\1\uffff\1\40\22\uffff\1\34\1\41\14\uffff\1\21\4\uffff\1"+
        "\55\5\uffff\1\65\1\66\1\67\2\uffff\1\14\1\22\1\uffff\1\26\1\27\4"+
        "\uffff\1\64\1\70\4\uffff\1\60\1\62\1\13\1\25\1\56\2\uffff\1\57";
    static final String DFA16_specialS =
        "\1\0\41\uffff\1\1\u00a6\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\51\1\47\1\46\2\51\1\45\22\51\1\47\1\6\1\42\2\51\1\4\1\1"+
            "\1\44\1\26\1\34\1\5\1\7\1\14\1\10\1\16\1\3\12\43\2\51\1\25\1"+
            "\20\1\22\2\51\32\41\1\24\1\51\1\32\1\11\1\41\1\51\1\41\1\12"+
            "\1\13\1\15\1\17\1\21\2\41\1\23\4\41\1\27\1\41\1\31\1\41\1\33"+
            "\1\35\1\36\1\41\1\37\1\40\3\41\1\51\1\2\1\51\1\30\uff81\51",
            "\1\52\26\uffff\1\53",
            "\1\55\76\uffff\1\56",
            "\1\61\15\uffff\1\60",
            "\1\63",
            "\1\65",
            "\1\67",
            "\1\72\21\uffff\1\71",
            "\1\75\17\uffff\1\74",
            "\1\77",
            "\1\101",
            "\1\103",
            "",
            "\1\105",
            "\12\107",
            "\1\110\13\uffff\1\111",
            "\1\112",
            "\1\114\12\uffff\1\115",
            "\1\116",
            "\1\120\7\uffff\1\121",
            "",
            "\1\123",
            "",
            "\1\126",
            "",
            "\1\130\20\uffff\1\131\2\uffff\1\132",
            "",
            "\1\134",
            "",
            "\1\136",
            "\1\137\11\uffff\1\140",
            "\1\141",
            "\1\142",
            "",
            "\12\143\1\uffff\2\143\1\uffff\ufff2\143",
            "\1\107\1\uffff\12\145",
            "\12\147\7\uffff\32\147\6\uffff\32\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "",
            "\1\167",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\174",
            "\1\175",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084\5\uffff\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\107\1\uffff\12\145",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f\3\uffff\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00b0",
            "\1\u00b1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00b4",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00bd",
            "",
            "",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00c6",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ASSIGN_BAND | ASSIGN_BOR | ASSIGN_DIV | ASSIGN_MOD | ASSIGN_MULT | ASSIGN_NOT | ASSIGN_PLUS | ASSIGN_SUB | ASSIGN_XOR | BOOLEAN | CLASS | COMMA | DEC | DO | DOT | ELSE | ELSIF | EQUAL | EQUALS | EXTENDS | FALSE | FLOAT | GREATER | GTE | IF | INC | INT | LBRACKET | LESS | LPAREN | LTE | NEW | OP_BAND | OP_BNOT | OP_BOR | OP_CARET | OP_DIV | OP_MINUS | OP_MOD | OP_MULT | OP_NOT | OP_OR | OP_PLUS | PASS | PRIVATE | PROTECTED | PUBLIC | RBRACKET | RETURN | RPAREN | SUPER | THIS | TRUE | VOID | WHILE | IDENTIFIER | STRING_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | INTEGER_LITERAL | INDENTATION | WS | TOKEN | ERROR | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='&') ) {s = 1;}

                        else if ( (LA16_0=='|') ) {s = 2;}

                        else if ( (LA16_0=='/') ) {s = 3;}

                        else if ( (LA16_0=='%') ) {s = 4;}

                        else if ( (LA16_0=='*') ) {s = 5;}

                        else if ( (LA16_0=='!') ) {s = 6;}

                        else if ( (LA16_0=='+') ) {s = 7;}

                        else if ( (LA16_0=='-') ) {s = 8;}

                        else if ( (LA16_0=='^') ) {s = 9;}

                        else if ( (LA16_0=='b') ) {s = 10;}

                        else if ( (LA16_0=='c') ) {s = 11;}

                        else if ( (LA16_0==',') ) {s = 12;}

                        else if ( (LA16_0=='d') ) {s = 13;}

                        else if ( (LA16_0=='.') ) {s = 14;}

                        else if ( (LA16_0=='e') ) {s = 15;}

                        else if ( (LA16_0=='=') ) {s = 16;}

                        else if ( (LA16_0=='f') ) {s = 17;}

                        else if ( (LA16_0=='>') ) {s = 18;}

                        else if ( (LA16_0=='i') ) {s = 19;}

                        else if ( (LA16_0=='[') ) {s = 20;}

                        else if ( (LA16_0=='<') ) {s = 21;}

                        else if ( (LA16_0=='(') ) {s = 22;}

                        else if ( (LA16_0=='n') ) {s = 23;}

                        else if ( (LA16_0=='~') ) {s = 24;}

                        else if ( (LA16_0=='p') ) {s = 25;}

                        else if ( (LA16_0==']') ) {s = 26;}

                        else if ( (LA16_0=='r') ) {s = 27;}

                        else if ( (LA16_0==')') ) {s = 28;}

                        else if ( (LA16_0=='s') ) {s = 29;}

                        else if ( (LA16_0=='t') ) {s = 30;}

                        else if ( (LA16_0=='v') ) {s = 31;}

                        else if ( (LA16_0=='w') ) {s = 32;}

                        else if ( ((LA16_0 >= 'A' && LA16_0 <= 'Z')||LA16_0=='_'||LA16_0=='a'||(LA16_0 >= 'g' && LA16_0 <= 'h')||(LA16_0 >= 'j' && LA16_0 <= 'm')||LA16_0=='o'||LA16_0=='q'||LA16_0=='u'||(LA16_0 >= 'x' && LA16_0 <= 'z')) ) {s = 33;}

                        else if ( (LA16_0=='\"') ) {s = 34;}

                        else if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {s = 35;}

                        else if ( (LA16_0=='\'') ) {s = 36;}

                        else if ( (LA16_0=='\r') ) {s = 37;}

                        else if ( (LA16_0=='\n') ) {s = 38;}

                        else if ( (LA16_0=='\t'||LA16_0==' ') ) {s = 39;}

                        else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\b')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\u001F')||(LA16_0 >= '#' && LA16_0 <= '$')||(LA16_0 >= ':' && LA16_0 <= ';')||(LA16_0 >= '?' && LA16_0 <= '@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='{'||LA16_0=='}'||(LA16_0 >= '\u007F' && LA16_0 <= '\uFFFF')) ) {s = 41;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA16_34 = input.LA(1);

                        s = -1;
                        if ( ((LA16_34 >= '\u0000' && LA16_34 <= '\t')||(LA16_34 >= '\u000B' && LA16_34 <= '\f')||(LA16_34 >= '\u000E' && LA16_34 <= '\uFFFF')) ) {s = 99;}

                        else s = 100;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}