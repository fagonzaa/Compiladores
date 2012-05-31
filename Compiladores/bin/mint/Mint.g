grammar Mint;

options {
    output = AST;
}



tokens {
        
        OP_NOT =  '!';
        OP_MOD =  '%';
        OP_BAND =  '&';
        LPAREN =  '(';
        RPAREN =  ')';
        OP_MULT =  '*';
        OP_PLUS =  '+';
        COMMA =  ','; 
        OP_MINUS =  '-';
        DOT =  '.';
        OP_DIV =  '/';
        LESS =  '<';
        EQUAL =  '=';
        GREATER =  '>';
        BOOLEAN = 'boolean';
        CLASS =  'class';
        DO =  'do';
        ELSE =  'else';
        ELSIF =  'elsif';
        EXTENDS =  'extends';
        FALSE =  'false';
        FLOAT =  'float';
        IF =  'if';
        INT =  'int';
        NEW =  'new';
        PASS =  'pass';
        PRIVATE =  'private';
        PROTECTED =  'protected';
        PUBLIC =  'public';
        RETURN =  'return';
        SUPER =  'super';
        THIS =  'this';
        TRUE =  'true';
        VOID =  'void';
        WHILE =  'while';
        LBRACKET =  '[';
        RBRACKET =  ']';
        OP_CARET =  '^';
        OP_BOR =  '|';
        OP_BNOT =  '~';
        OP_OR = '||';
        EQUALS = '==';
        LTE = '<=';
        ASSIGN_XOR ='^=';        
        INC ='++';
        GTE = '>=';
        ASSIGN_DIV = '/=';
        ASSIGN_SUB = '-=';
        ASSIGN_MULT = '*=';
        ASSIGN_MOD = '%=';
        DEC = '--';
        ASSIGN_BOR = '|=';
        ASSIGN_PLUS = '+=';
        ASSIGN_NOT = '!=';
        ASSIGN_BAND = '&=';
        AND = '&&';
        INDENT;
        DEDENT;
        NEWLINE;
        FIELD;
        METHOD;
        NAME; 
        PARAMS;
        BODY;
	ARGS;
	ARRAY_TYPE;
	ARRAY_ACCESS;
	ARRAY_CREATION;
	ACCESS;
	SELECTOR;
	POST;
	CTOR;
	CALL;
	BLOCK;
	FIELD_ACCESS;	
	METHOD_ACCESS;
        PROGRAM;
        CAST;
}

@parser::header { package mint; }
@parser::members {
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {

        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        
        System.out.println(String.format("error \%s : \%s \%s", e.line, e.charPositionInLine, msg));
        
        // Now do something with hdr and msg...
    }
}

@lexer::header { package mint; }
@lexer::members {
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

}



IDENTIFIER
        : ('A'..'Z' |'a'..'z' | '_' ) ('A'..'Z' |'a'..'z' |'0'..'9' | '_')*  ;              //Identificador

STRING_LITERAL 
        : '"' ~ ('"' | '\r' | '\n')*'"'     ;                    //String delimitado por comillas dobles

FLOAT_LITERAL 
        : (('0'..'9')+ '.'('0'..'9' )+ )| (('0'..'9' )+'.') | ('.'('0'..'9' )+) ;       //Número decimal

CHAR_LITERAL 
        : '\'' ( 'A'..'Z' |'a'..'z' |'0'..'9' )'\''  ;                           //Un caracter, delimitado por comillas simples

INTEGER_LITERAL 
        : ('0'..'9')+;                                    //Número entero


INDENTATION:  ('\r'?'\n' WS)* '\r'?'\n' (ws=WS)
    {
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

      }      ;


WS  : ('\t' | ' ')* { $channel=HIDDEN; };

TOKEN   :  '!'
        | '!='
        | '"'
        | '%'
        | '%='
        | '&&'
        | '&'
        | '&='
                
        | '*'
        | '*='
        | '+'
        | '++'
        | '+='
        | ','
        | '-'
        | '--'
        | '-='
        | '.'
        | '/'
        | '/='
        | '<'
        | '<='        
        | '=='
        | '='
        | '>'
        | '>='
        
        | '^'
        | '^='
        | '|'
        | '|='
        | '||'
        | '~'

        | '['
        | ']'
        | '('
        | ')'

        | 'boolean'
        | 'class'
        | 'do'
        | 'else'
        | 'elsif'
        | 'extends'
        | 'false'
        | 'float'
        | 'if'
        | 'int'
        | 'new'
        | 'pass'
        | 'private'
        | 'protected'
        | 'public'
        | 'return'
        | 'super'
        | 'this'
        | 'true'
        | 'void'
        | 'while'
        ;

ERROR	:	.;       

COMMENT	:	'//' .* '\r'? '\n' { $channel = HIDDEN; };

dedent 	: DEDENT | EOF;

newline : NEWLINE 
	 | EOF;

compilationUnit : (NEWLINE | classDeclaration)* EOF -> ^(PROGRAM classDeclaration*);

literal : INTEGER_LITERAL | FLOAT_LITERAL | CHAR_LITERAL | STRING_LITERAL | 'true' | 'false';

type : primitiveType | referenceType;

primitiveType : 'int' | 'float' | 'boolean';

referenceType : classType | arrayType;

classType : name;

arrayType : primitiveType '[' ']' -> ^(ARRAY_TYPE primitiveType)
	|	classType '[' ']' -> ^(ARRAY_TYPE classType);

name : IDENTIFIER;

modifiers : 'public' | 'protected' | 'private';

classDeclaration : (modifiers? 'class' id=IDENTIFIER superExtend? classBody) -> ^('class' $id superExtend? classBody);

superExtend : ('extends'^ classType);

classBody : INDENT classBodyDeclarations dedent -> classBodyDeclarations ;

classBodyDeclarations : (classBodyDeclaration)+ 
			| emptyStmt -> ;

classBodyDeclaration : classMemberDeclaration 
			| constructorDeclaration;

classMemberDeclaration : fieldDeclaration 
			| methodDeclaration;

fieldDeclaration : modifiers type variableDeclarators newline -> ^(FIELD modifiers type variableDeclarators)
		     | type variableDeclarators newline -> ^(FIELD PRIVATE type variableDeclarators);

variableDeclarators : variableDeclarator (',' variableDeclarator)* -> variableDeclarator+;

variableDeclarator : IDENTIFIER  ( '=' expr )? -> ^(IDENTIFIER expr?);

methodDeclaration : methodHeader block -> ^(METHOD methodHeader block);

methodHeader : modifiers  methodType methodDeclarator -> modifiers methodType methodDeclarator
		| methodType methodDeclarator -> PRIVATE methodType methodDeclarator;

methodType  :	 type | 'void';

methodDeclarator : IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^(PARAMS formalParameterList?);

formalParameterList : formalParameter (',' formalParameter)* -> formalParameter+;

formalParameter : (type^ IDENTIFIER);

constructorDeclaration :  modifiers constructorDeclarator constructorBody 
			-> ^(CTOR modifiers constructorDeclarator constructorBody)
			| constructorDeclarator constructorBody 
			-> ^(CTOR PRIVATE constructorDeclarator constructorBody);

constructorDeclarator : IDENTIFIER '(' ( formalParameterList )? ')' -> IDENTIFIER ^(PARAMS formalParameterList?);

constructorBody: 
	(INDENT ('this' | 'super') '(') => INDENT (explicitConstructorInvocation blockStmts) dedent
		-> ^(BLOCK explicitConstructorInvocation blockStmts)
	| block;

explicitConstructorInvocation : ( t='this' | t='super' ) argumentList newline -> ^(CALL $t argumentList);


block : 
	INDENT blockStmts dedent -> ^(BLOCK blockStmts);

blockStmts 
	: blockStmt ( blockStmt )* -> blockStmt+
	| emptyStmt ;

blockStmt 
	: localVariableDeclarationStmt 
	| stmt;

localVariableDeclarationStmt : type variableDeclarators newline  -> ^(FIELD type variableDeclarators);

stmt : exprStmt newline!
	| doStmt | returnStmt | ifThenStmt | whileStmt;

emptyStmt : 'pass' newline!;

exprStmt :
        expr;
/* 
        assignment 
        | preIncrementExpr 
        | preDecrementExpr 
        | (postfixExpr '++') 
        | (postfixExpr '--')  
        //| primary
        | 'new' classType argumentList;
*/
ifThenStmt : ('if' '(' expr ')' block elsifClause* elseClause? )
		-> ^('if' expr block elsifClause* elseClause?);

elsifClause
	: 'elsif'^ '('! expr ')'! block;

elseClause
	: 'else'^ block;

whileStmt : 'while'^ '('! expr ')'! block;

doStmt : 'do' block 'while' '(' expr ')' newline -> ^('do' expr block);

returnStmt : 'return'^ ( expr )? newline!;



primary 
	: literal 
	| 'this' ('.' IDENTIFIER)* arg=argumentList?
		-> { arg != null }? ^(CALL ^(NAME 'this' IDENTIFIER*) argumentList?)  // local call
		-> ^( FIELD_ACCESS 'this' IDENTIFIER)
	| '('! expr ')'! 
//	| ( 'new' ( classType | primitiveType ) '[') => arrayCreationExpr
	| 'new'^ classType argumentList
	| 'super' argumentList -> ^(CALL 'super' argumentList)
        | 'super' '.' IDENTIFIER arg=argumentList?
        	-> {arg != null}? ^(CALL ^(NAME 'super' IDENTIFIER argumentList))
        	-> ^(FIELD_ACCESS 'super' IDENTIFIER)
        | name ('.' IDENTIFIER)* args=argumentList? 
        	-> { args != null }? ^(CALL ^(NAME name IDENTIFIER*) argumentList?)
        	-> ^(FIELD_ACCESS name IDENTIFIER*)
        ;


argumentList 
        : '(' (expr ( ',' expr )* )?    ')' -> ^(ARGS expr*);

arrayCreationType
	:	primitiveType | classType ;

arrayCreationExpr 
        : 'new' arrayCreationType ('[' expr ']')* -> ^(ARRAY_CREATION arrayCreationType ^(ARGS expr+)) ;

selector
    :   '.' IDENTIFIER arg=argumentList?
    	-> { arg != null }? ^(CALL IDENTIFIER argumentList?)
    	-> ^(FIELD_ACCESS IDENTIFIER)
    |   '.' 'super' argumentList -> ^(CALL 'super' argumentList)
    |	'.' 'super' '.' IDENTIFIER arg=argumentList?
	-> {arg != null}? ^(CALL 'super' IDENTIFIER argumentList?)
	-> ^(FIELD_ACCESS 'super' IDENTIFIER)
    |   '[' expr ']' -> ^(ARRAY_ACCESS expr)
    ;

postfixExpr 
	: primary s+=selector* (op+='++' | op+='--')* 
		-> { $s != null && $op != null}? ^(POST ^(ACCESS ^(SELECTOR selector*) primary) $op*)
		-> { $s != null }? ^(ACCESS ^(SELECTOR selector*) primary)
		-> { $op != null }? ^(POST primary $op*)
		-> primary
	| arrayCreationExpr;


unaryExpr 
	: preIncrementExpr 
	| preDecrementExpr 
	| '+'! unaryExpr
	| '-'^ unaryExpr
	| unaryExprNotPlusMinus;

preIncrementExpr 
	: '++'^ unaryExpr;

preDecrementExpr 
	: '--'^ unaryExpr;

unaryExprNotPlusMinus 
        :  ( '(' type ')' ) => castExpr
	| postfixExpr 
	| '~'^ unaryExpr 
	| '!'^ unaryExpr 
	;

castExpr : '(' type ')' unaryExpr -> ^(CAST type unaryExpr);

multiplicativeExpr : (unaryExpr) (( '*' | '/' | '%')^ unaryExpr)*;

additiveExpr : (multiplicativeExpr) (( '+' | '-' )^ multiplicativeExpr)*;

relationalExpr : (additiveExpr) (( '<' | '>' | '<=' | '>=' )^ additiveExpr)*;

equalityExpr : (relationalExpr) (('==' | '!=')^ relationalExpr)*;

andExpr : (equalityExpr) ('&'^ equalityExpr)*;

exclusiveOrExpr : (andExpr) ('^'^ andExpr)*;

inclusiveOrExpr : (exclusiveOrExpr) ('|'^ exclusiveOrExpr)*;

conditionalAndExpr : (inclusiveOrExpr) ('&&'^ inclusiveOrExpr)*;

conditionalOrExpr : (conditionalAndExpr) ('||'^ conditionalAndExpr)*;

conditionalExpr : conditionalOrExpr;


assignmentExpr 
        : conditionalExpr (assignmentOperator^ assignmentExpr)?;
        //| (leftHandSide assignmentOperator) => leftHandSide assignmentOperator assignmentExpr;


leftHandSide 
        : primary;

assignmentOperator : '=' | '*=' | '/=' | '%=' | '+='  | '-=' | '&=' | '^=' | '|=';

expr : 
        assignmentExpr;