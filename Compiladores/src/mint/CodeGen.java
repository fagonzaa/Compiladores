

package mint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.CommonTree;

class CodeGen
{
	CommonTree root;
	ScopeManager scopes;

	boolean indent = false;

	PrintWriter pw= null;
	
	public CodeGen(CommonTree compilationUnit)
	{
		this.root = compilationUnit;
		this.scopes = new ScopeManager();
		
		
	}

	public void emit(String code)
	{
		String tab = "";

		if(indent)
			tab = "    ";

		pw.println(tab + code);
		System.out.println(tab + code);
	}    


	public String getParams(Tree paramsNode){

		String code = "";

		for( int i = 0; i < paramsNode.getChildCount(); i++) {
			code += getDataType(paramsNode.getChild(i));
			scopes.addLocal(paramsNode.getChild(i));
		}

		return code;
	}

	public void start() throws Exception
	{
		if(this.root.getType() == MintLexer.CLASS) {
			generateClass(this.root);
		}
		else {
			for( int i = 0; i < root.getChildCount(); i++ ) {

				Tree classNode = root.getChild(i);

				if( classNode.getType() == MintLexer.CLASS )
				{
					infoClassDectect(classNode);
					try {
						pw = new PrintWriter(new File(scopes.currentClassSymbol.id + ".j"));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					generateClass(classNode);
				}
				else
				{
					System.out.println(String.format("node type: %s", classNode.getType()));
					throw new Exception("error: non node class in compilationUnit");
				}
			}
		}
		
		pw.close();
	}

	public void generateClass(Tree classNode) {

		String name = classNode.getChild(0).getText();
		emit(".class public " + name);

		scopes.loadClass(classNode);

		int ichildrenDeclaration = 1;

		if(classNode.getChildCount() > 1 && classNode.getChild(1).getType() == MintLexer.EXTENDS){
			emit(".super " + classNode.getChild(1).getChild(0));
			ichildrenDeclaration++;
		}
		else{
			emit(".super java/lang/Object");
		}

		boolean isField = false;
		boolean isConstruct = false;

		for( int j = ichildrenDeclaration; j < classNode.getChildCount(); j++)
		{
			Tree member = classNode.getChild(j);
			switch(member.getType())
			{
			case MintLexer.FIELD:
				if(!isField){
					isField = true;
					emit("");
				}
				generateField(member);

				break;

			case MintLexer.METHOD:

				emit("");

				if(classNode.getChild(0).getText().equals(member.getChild(2).getText())){
					isConstruct = true;
					generateConstructor(member);
				}
				else{
					generateMethod(member);
				}
				break;
			case MintLexer.CTOR:

				emit("");

				isConstruct = true;
				generateConstructor(member);
				break;

			default:
				break;
			}
		}

		if(!isConstruct){
			generateDefaultConstructor();
		}
	}

	public void generateMethod(Tree node)
	{
		String code = "";

		String modifier;
		String name;

		modifier = node.getChild(0).getText().toLowerCase();
		name = node.getChild(2).getText();

		code = ".method " + modifier + " ";

		if(name.equals("readyGo")){
			code += "static main";
		}
		else{
			code += name;
		}

		scopes.loadMethod(node);

		code += "(";

		if(node.getChild(3).getType() == MintLexer.PARAMS){
			code += getParams(node.getChild(3));
		}    

		code += ")" + getDataType(node.getChild(1));
		emit(code);

		indent = true;

		emit(".limit locals 100");
		emit(".limit stack 100");

		generateStatements(node.getChild(4));

		indent = false;

		emit(".end method");
	}


	public void generateConstructor(Tree node)
	{
		String code = "";

		String modifier;

		modifier = node.getChild(0).getText().toLowerCase();

		code = ".method " + modifier + " ";
		code += "<init>";        
		code += "(";

		if(node.getChild(3).getType() == MintLexer.PARAMS){
			code += getParams(node.getChild(3));
		}    

		code += ")" + getDataType(node.getChild(1));
		emit(code);

		scopes.addMethod(node);

		emit(".limit locals 100");
		emit(".limit stack 100");

		generateStatements(node.getChild(3));

		scopes.removeMethod(node);

		emit(".end method");
	}

	public void generateDefaultConstructor(){

		emit(".method public <init>()V");
		emit("    aload_0");
		emit("    invokespecial java/lang/Object/<init>()V");
		emit("    return");
		emit(".end method");
	}

	public void generateStatements(Tree node)
	{
		for( int j = 0; j < node.getChildCount(); j++)
		{
			Tree member = node.getChild(j);
			switch(member.getType())
			{
			// **************************/
			//	      FIELD
			// **************************
			case MintLexer.FIELD:  // int a = 0   
				generateFieldLocal(member);
				break;

				// **************************/
				//	      INCREMENT / DECREMENT
				// **************************
			case MintLexer.POST:  // a++, a--  
				generatePost(member);
				break;
			case MintLexer.INC:  // ++a
				generateIncDec(member);
				break;
			case MintLexer.DEC:  // --a
				generateIncDec(member);
				break;


				// **************************/
				//	      ASSIGN
				// **************************
			case MintLexer.EQUAL:  // a = 1
			case MintLexer.ASSIGN_BAND:  // a &= 1  
			case MintLexer.ASSIGN_BOR:  // a |= 0  
			case MintLexer.ASSIGN_DIV:  // a /= 0  
			case MintLexer.ASSIGN_MOD:  // a %= 0 
			case MintLexer.ASSIGN_MULT:  // a *= 0  
			case MintLexer.ASSIGN_NOT:  // a != 0 
			case MintLexer.ASSIGN_PLUS:  // a += 0 
			case MintLexer.ASSIGN_SUB:  // a -= 0 
			case MintLexer.ASSIGN_XOR:  // a ^= 0
				generateAssign(member);
				break; 


				// **************************/
				//	      CONTROL
				// **************************
			case MintLexer.IF: 
				generateIf(member);
				break;

			case MintLexer.WHILE:
				generateWhile(member);
				break;

			case MintLexer.DO:
				break;


				// **************************/
				//	      ACCESS
				// **************************
			case MintLexer.ACCESS: // ( new MyClass() ).call("Hola.Compilador") 
				break;

			case MintLexer.CALL:  // metodo()

				if(member.getChild(0).getChildCount() == 1 && member.getChild(0).getChild(0).getText().equals("shout")){
					generateShoutCall(member);
				}
				else{
					generateMethodCall(member);
				}
				break;

			case MintLexer.RETURN:  // return 0
				generateReturn(member);
				break;

			default:
				break;
			}
		}

		//emit("<statements>");
	}

	public void generateField(Tree node)
	{
		String code = "";

		String modifier;
		String name;
		String type;

		modifier = node.getChild(0).getText().toLowerCase();
		name = node.getChild(2).getText();
		type = getDataType(node.getChild(1));

		code = ".field " + modifier + " " + name + " " + type;

		if(node.getChild(2).getChildCount() == 1){
			code += " = " + node.getChild(2).getChild(0).getText();
		}

		emit(code);

		scopes.addField(node);
	}


	public void generateFieldLocal(Tree node)
	{
		String text = node.getChild(0).getText();
		if(text.equalsIgnoreCase("ARRAY_TYPE"))
		{
			generateArray(node);
		}
		else
		{
			LocalSymbol symbol = scopes.addLocal(node);

			if(node.getChild(1).getChildCount() > 0){
				generateExpression(node.getChild(1).getChild(0));
				emit(symbol.type.getTypeJasmin().toLowerCase() + "load " + symbol.number);
			}
		}

	}

	

	private void generateArray(Tree node) {

		int arraySize ;
		String arrayType = node.getChild(0).getChild(0).getText();
		String arrayName = node.getChild(1).getText();
		//		emit("arrayName: "+arrayName +", type1: "+arrayType);

		if(node.getChild(1).getChildCount()>0)
		{

			arraySize = Integer.parseInt(node.getChild(1).getChild(0).getChild(1).getChild(0).getText());
			String arrayType2 = node.getChild(1).getChild(0).getChild(0).getText();
			//			emit("Size: "+arraySize+", type2: "+arrayType2);
			
			if(arrayType.equalsIgnoreCase("int")
					|| arrayType.equalsIgnoreCase("float")
					|| arrayType.equalsIgnoreCase("boolean")
					)
			{

				emit("iconst_"+arraySize);
				emit("newarray "+arrayType);
				int number = 0;
				///////////// REVISAR /////////////////

				if( scopes.isLocal(arrayName))
				{
					number = ((LocalSymbol)scopes.getLocal(arrayName)).number;				
				}
				///////////////////////////
				emit("astore_"+ number );
			}
			else
			{
				emit("ldc "+arraySize);
				emit("anewarray "+arrayType);
			}
		}

	}

	public Symbol generateFieldAccess(Tree node){

		Symbol s = null;

		int nNames = node.getChildCount();

		String name = node.getChild( nNames - 1 ).getText();
		String type = "";

		if(nNames == 1 && scopes.isLocal(name)){
			LocalSymbol symbol = scopes.getLocal(name);
			s = symbol;

			type = symbol.type.getTypeJasmin();

			String s2 = type.toLowerCase();
			
			if(s2.startsWith("a"))
				s2 = "a";
				
			emit(s2 + "load " + symbol.number); 
		}
		else if(scopes.isField(name)){

			int sName = 0;

			if(node.getChild(0).getText().equals("this")){
				sName = 1;
			}

			emit("iload 0");

			for(int i=sName; i < nNames - 1; ++i){
				String name2 = node.getChild( i ).getText();
				emit("getfield " + scopes.getPathField(name2) + " L" + scopes.currentClassSymbol.id);
			}

			Symbol symbol = scopes.getField(name);
			s = symbol;
			type = symbol.type.getTypeJasmin();
			emit("getfield " + scopes.getPathField(name) + " " + type);
		}


		return s;    	
	}

	public Symbol generateFieldAccessPut(Tree node){

		Symbol s = null;

		int nNames = node.getChildCount();

		String name = node.getChild( nNames - 1 ).getText();
		String type = "";

		if(nNames == 1 && scopes.isLocal(name)){
			LocalSymbol symbol = scopes.getLocal(name);
			s = symbol;

			type = symbol.type.getTypeJasmin();

			emit(type.toLowerCase() + "store " + symbol.number); 
		}
		else if(scopes.isField(name)){

			int sName = 0;

			if(node.getChild(0).getText().equals("this")){
				sName = 1;
			}

			emit("iload 0");

			for(int i=sName; i < nNames - 1; ++i){
				String name2 = node.getChild( i ).getText();
				emit("putfield " + scopes.getPathField(name2) + " L" + scopes.currentClassSymbol.id);
			}

			Symbol symbol = scopes.getField(name);
			s = symbol;
			type = symbol.type.getTypeJasmin();
			emit("putfield " + scopes.getPathField(name) + " " + type);
		}


		return s;    	
	}

	public void generatePost(Tree node)
	{
		Symbol field = generateFieldAccess(node.getChild(0));

		String type = field.type.getTypeJasmin().toLowerCase();

		String inc = "";

		if(node.getChild(1).getType() == MintLexer.INC){ // ++
			inc = "1";
		}
		else{ // DEC --
			inc = "-1";
		}

		if(field.getClass() == LocalSymbol.class){
			int temp = scopes.currentMethodScope.getCounterTemp();
			//emit(type + "load " + ((LocalSymbol)field).number);
			
			
			if(type.startsWith("l"))
				type = "a";
				
			emit(type + "store " + temp);
			emit("iinc " + ((LocalSymbol)field).number + " " + inc);
			emit(type + "load " + temp);
		}
		else{
			emit("putfield " + scopes.getPathField(field.id) + " " + type.toUpperCase());
		}

	}

	public void generateIncDec(Tree node)
	{
		Symbol field = generateFieldAccess(node.getChild(0));

		String type = field.type.getTypeJasmin().toLowerCase();

		String inc = "";

		if(node.getType() == MintLexer.INC){ // ++
			inc = "1";
		}
		else{ // DEC --
			inc = "-1";
		}

		if(field.getClass() == LocalSymbol.class){
			emit("iinc " + ((LocalSymbol)field).number + " " + inc);
			emit(type + "store " + ((LocalSymbol)field).number);
		}
		else{
			emit("putfield " + scopes.getPathField(field.id) + " " + type.toUpperCase());
		}
	}


	public void generateCallAccess(Tree node){

		int nNames = node.getChildCount();
		int sName = 0;

		if(node.getChild(0).getText().equals("this")){
			sName = 1;
		}

		emit("iload 0");

		for(int i=sName; i < nNames - 1; ++i){
			String name2 = node.getChild( i ).getText();
			emit("getfield " + scopes.getPathField(name2) + " L" + scopes.currentClassSymbol.id);
		}   	
	}

	public void generateMethodCall(Tree node)
	{   
		generateCallAccess(node.getChild(0));

		int nNames = node.getChild(0).getChildCount();
		String name = node.getChild(0).getChild( nNames - 1 ).getText();

		String params = getParamsCall(node.getChild(1));
		emit("invokevirtual " + scopes.getPathMethod(name) + "(" + params + ")" + scopes.getMethod(name).type.getTypeJasmin());
	}

	public void generateShoutCall(Tree node)
	{   
		emit("getstatic java/lang/System/out Ljava/io/PrintStream;");

		int nNames = node.getChildCount();

		String params = getParamsCall(node.getChild(1));
		emit("invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V ;");
	}

	public String getParamsCall(Tree paramsNode){

		String code = "";

		int[] iparams = new int[paramsNode.getChildCount()];
		Type[] tparams = new Type[paramsNode.getChildCount()];

		for( int i = 0; i < paramsNode.getChildCount(); i++) {
			//emit("ldc " + paramsNode.getChild(i).getText());

			Type type1 = generateExpression(paramsNode.getChild(i));
			int temp1 = scopes.currentMethodScope.getCounterTemp();
			emit(type1.getTypeJasmin().toLowerCase() + "store " + temp1);

			iparams[i] = temp1;
			tparams[i] = type1;

			code += type1.getTypeJasmin();
		}

		for( int i = 0; i < paramsNode.getChildCount(); i++) {
			
			String s = tparams[i].getTypeJasmin().toLowerCase();
			
			if(s.startsWith("l"))
				s = "a";
				
			emit(s + "load " + iparams[i]);
		}


		return code;
	}


	public void generateReturn(Tree node)
	{ 
		Type type = scopes.currentMethodSymbol.type;
		String typeName = type.getTypeJasmin().toLowerCase();

		if(type == Type.Void){
			typeName = "";
		}

		if(node.getChildCount() > 0){
			scopes.currentMethodScope.ResetCounterTemp();
			generateExpression(node.getChild(0));
		}

		emit(typeName + "return");
	}


	public Type generateExpression(Tree node){

		return generateExpression(node, 0, 0);
	}
	
	public Type generateExpression(Tree node, int n1, int n2){
		Type type = Type.Int;

		switch(node.getType()){

		// **************************/
		//	      Operadores aritm\E9ticos y binarios
		// **************************
		case MintLexer.OP_PLUS:
		case MintLexer.OP_BAND:
		case MintLexer.OP_BNOT:
		case MintLexer.OP_BOR:
		case MintLexer.OP_CARET:
		case MintLexer.OP_DIV:
		case MintLexer.OP_MINUS:
		case MintLexer.OP_MOD:
		case MintLexer.OP_MULT:
			type = generateOpExpression(node);
			break;

			// **************************/
			//	      Operadores booleanos
			// **************************
		case MintLexer.OP_NOT:
		case MintLexer.OP_OR:
		case MintLexer.AND:
			type = generateOpExpression2(node, n1, n2);
			break;

			// **************************/
			//	      Operadores relacionales
			// **************************
		case MintLexer.LESS:  // <
		case MintLexer.GREATER:  // >
		case MintLexer.EQUALS:  // ==
		case MintLexer.LTE:  // <=
		case MintLexer.GTE:  // >=
		case MintLexer.ASSIGN_NOT:  // !=
			type = generateOpExpression(node);
			break; 

			// **************************/
			//	      INCREMENT / DECREMENT
			// **************************
		case MintLexer.POST:  // a++, a--  
			generatePost(node);
			break;
		case MintLexer.INC:  // ++a
			generateIncDec(node);
			break;
		case MintLexer.DEC:  // --a
			generateIncDec(node);
			break;

			// **************************/
			//	      Literales
			// **************************	
		case MintLexer.CHAR_LITERAL:
			emit("ldc " + node.getText());

			break;
		case MintLexer.FLOAT_LITERAL:
			emit("ldc " + node.getText());
			type = Type.Float;
			break;
		case MintLexer.INTEGER_LITERAL:
			emit("ldc " + node.getText());
			type = Type.Int;
			break;
		case MintLexer.STRING_LITERAL:
			emit("ldc " + node.getText());
			type = Type.String;
			break;

			// **************************/
			//	      Otros
			// **************************
		case MintLexer.FIELD_ACCESS:
			generateFieldAccess(node);
			break;
		case MintLexer.CAST:
			generateCast(node);
			break;	
		case MintLexer.CALL:
			generateMethodCall(node);
			break;	

		}

		return type;
	}

	public Type generateOpExpression(Tree node)
	{
		Type type1 = generateExpression(node.getChild(0));
		int temp1 = scopes.currentMethodScope.getCounterTemp();
		emit(type1.getTypeJasmin().toLowerCase() + "store " + temp1);

		Type type2 = null;
		int temp2 = 0;
		Type type3 = type1;

		if(node.getChildCount() > 1){
			type2 = generateExpression(node.getChild(1));
			temp2 = scopes.currentMethodScope.getCounterTemp();
			emit(type2.getTypeJasmin().toLowerCase() + "store " + temp2);

			if(type1 != type2){
				if(type1 == Type.Float || type2 == Type.Float){
					type3 = Type.Float;
				}
			}
		}

		String s = type1.getTypeJasmin().toLowerCase();
		
		if(s.startsWith("l"))
			s = "a";
		
		emit(s + "load " + temp1);

		if(node.getChildCount() > 1){
			String s2 = type2.getTypeJasmin().toLowerCase();
			
			if(s.startsWith("l"))
				s2 = "a";
			
			emit(s2 + "load " + temp2);
		}

		switch(node.getType()){

		// **************************/
		//	      Operadores
		// **************************
		case MintLexer.OP_BAND: // a & b
			emit("iand"); 
			break;
		case MintLexer.OP_BNOT: // ~a
			emit(type3.getTypeJasmin().toLowerCase() + "neg"); 
			break;
		case MintLexer.OP_BOR: // a | b
			emit("ior"); 
			break;
		case MintLexer.OP_CARET: // a ^ b
			emit("ixor");
			break;
		case MintLexer.OP_DIV: // a / b
			emit(type3.getTypeJasmin().toLowerCase() + "div"); 
			break;
		case MintLexer.OP_MINUS: // a - b
			emit(type3.getTypeJasmin().toLowerCase() + "sub"); 
			break;
		case MintLexer.OP_MOD: // a % b
			emit(type3.getTypeJasmin().toLowerCase() + "rem"); 
			break;
		case MintLexer.OP_MULT: // a * b
			emit(type3.getTypeJasmin().toLowerCase() + "mul"); 
			break;
		case MintLexer.OP_PLUS: // a + b
			emit(type3.getTypeJasmin().toLowerCase() + "add"); 
			break;


		case MintLexer.AND: // a && b
			break;
		case MintLexer.OP_NOT: // !a
			break;
		case MintLexer.OP_OR: // a || b
			break;
		}

		return type3;
	}
	
	public Type generateOpExpression2(Tree node, int n1, int n2)
	{
		Type type1 = Type.Int;
		
		String label;
		String end_label;
		String condition;
		
		Type type2;
		String label2;
		String condition2;
		
		int if1;
		int if2;
		
		switch(node.getType()){

		case MintLexer.AND: // a && b
			if1 =  scopes.currentMethodScope.getCounterIf();
			if2 = scopes.currentMethodScope.getCounterIf();
			
			type1 = generateExpression(node.getChild(0), if1, if2);
			label = "IF_" + scopes.currentMethodSymbol.id + "_" + if1;
			end_label = "END_" + "IF_" + scopes.currentMethodSymbol.id + "_" + n2;
			condition = getCondition(node.getChild(0));
			
			emit(condition + " " + label);
			emit("goto " + end_label);
			emit(label + ":");
			
			
			type2 = generateExpression(node.getChild(1));
			label2 = "IF_" + scopes.currentMethodSymbol.id + "_" + if2;
			condition2 = getCondition(node.getChild(1));
			emit(condition2 + " " + label2);
			emit("goto " + end_label);
			emit(label2 + ":");
			
			
			break;
		case MintLexer.OP_NOT: // !a
			
			break;
		case MintLexer.OP_OR: // a || b
			if1 =  scopes.currentMethodScope.getCounterIf();
			if2 = scopes.currentMethodScope.getCounterIf();
			
			type1 = generateExpression(node.getChild(0), 0, if1);
			label = "IF_" + scopes.currentMethodSymbol.id + "_" + if1;
			end_label = "END_" + "IF_" + scopes.currentMethodSymbol.id + "_" + n2;
			condition = getCondition(node.getChild(0));
			
			emit(condition + " " + label);
			
			type2 = generateExpression(node.getChild(1));
			condition2 = getCondition(node.getChild(1));
			emit(condition2 + " " + label);
			emit("goto " + end_label);
			emit(label + ":");
			break;
		}

		return type1;
	}
	
	private void generateCast(Tree node) {    	
    	String newType = getDataType(node.getChild(0)).toLowerCase();

    	String oldType = "";
    	{    	
    		Type type1 = generateExpression(node.getChild(1));
    		int temp1 = scopes.currentMethodScope.getCounterTemp();
    		oldType = type1.getTypeJasmin().toLowerCase();
    		emit(oldType + "store " + temp1);
    		
    		emit(oldType+"2"+newType);

    		
    	}		
	}

	public void generateAssign(Tree node){

		Type type1 = generateExpression(node.getChild(1));
		int temp1 = scopes.currentMethodScope.getCounterTemp();

		if(node.getType() != MintLexer.EQUAL){
			String s = type1.getTypeJasmin().toLowerCase();
			
			if(s.startsWith("l"))
				s = "a";
			
			
			emit(type1.getTypeJasmin().toLowerCase() + "store " + temp1);
			generateFieldAccess(node.getChild(0));
			
			emit(s + "load " + temp1);
		}


		switch(node.getType())
		{                 
		// **************************/
		//	      ASSIGN
		// **************************    		
		case MintLexer.EQUAL:  // a = 1
		{
			String text = node.getChild(1).getText();
			if(text.equalsIgnoreCase("ARRAY_CREATION"))
			{
				generateArrayCreation(node);
			}
			else if(text.equalsIgnoreCase("new"))
				generateArrayAccess(node);
			break;
		}case MintLexer.ASSIGN_BAND:  // a &= 1 
			emit("iand"); 
			break;
		case MintLexer.ASSIGN_BOR:  // a |= 0 
			emit("ior"); 
			break;
		case MintLexer.ASSIGN_DIV:  // a /= 0 
			emit(type1.getTypeJasmin().toLowerCase() + "div"); 
			break;
		case MintLexer.ASSIGN_MOD:  // a %= 0  
			emit(type1.getTypeJasmin().toLowerCase() + "rem"); 
			break;
		case MintLexer.ASSIGN_MULT:  // a *= 0 
			emit(type1.getTypeJasmin().toLowerCase() + "mul"); 
			break;
		case MintLexer.ASSIGN_NOT:  // a != 0   
			break;
		case MintLexer.ASSIGN_PLUS:  // a += 0  
			emit(type1.getTypeJasmin().toLowerCase() + "add"); 
			break;
		case MintLexer.ASSIGN_SUB:  // a -= 0 
			emit(type1.getTypeJasmin().toLowerCase() + "sub"); 
			break;
		case MintLexer.ASSIGN_XOR:  // a = 0
			emit("ixor");
			break; 

		}

		generateFieldAccessPut(node.getChild(0));
	}

	
	private void generateArrayAccess(Tree node) {
		String arrayType = node.getChild(1).getChild(0).getText();
		Tree param;
		if(node.getChild(1).getChild(1).getChildCount()>0)
		{
			param = node.getChild(1).getChild(1);
			emit("New");
		}
		else
		{
			emit("Sin Param");
		}
		
		
	}

	private void generateArrayCreation(Tree node) {
		// TODO Auto-generated method stub

		emit("--->");
		String arrayName = node.getChild(0).getChild(0).getText();
		int arraySize = Integer.parseInt(node.getChild(1).getChild(1).getChild(0).getText());
		String arrayType2 = node.getChild(1).getChild(0).getText();
		emit("arrayName: "+arrayName );
		emit("Size: "+arraySize+", type2: "+arrayType2);
		emit("<{--");

	}

	public void generateWhile(Tree node) {
		int counterIf1 = scopes.currentMethodScope.getCounterIf();
		String label = "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf1;
		
		emit(label + ":");
		generateIf(node);
		emit("goto " + label);
	}
	
	public void generateIf(Tree node) {
		// TODO Auto-generated method stub
		Tree opNode = node.getChild(0);
		
		int counterIf1 = scopes.currentMethodScope.getCounterIf();
		int counterIf2 = scopes.currentMethodScope.getCounterIf();
		int counterIf3 = scopes.currentMethodScope.getCounterIf();
		
		generateOpCondition(opNode, counterIf1, counterIf2);
		
		String label = "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf1;
		String label2 = "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf2;
		String end_label = "END_" + "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf3;
		String condition = getCondition(opNode);

		if(!condition.equals("AND") && !condition.equals("OR") && !condition.equals("NOT")){
			emit(condition + " " + label);
			emit("goto " + label2);
		}

		emit(label + ":");
		generateStatements(node.getChild(1));
		emit(end_label + ":");
		emit(label2 + ":");
		

		for(int i=2; i<node.getChildCount(); ++i){
			Tree nodeIf = node.getChild(i);

			if(nodeIf.getType() == MintParser.ELSIF){
				int counterIf1_2 = scopes.currentMethodScope.getCounterIf();
				int counterIf2_2 = scopes.currentMethodScope.getCounterIf();
				
				String label_2 = "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf1_2;
				String label2_2 = "IF_" + scopes.currentMethodSymbol.id + "_" + counterIf2_2;
				
				Tree opNode2 = nodeIf.getChild(0);
				generateOpCondition(opNode2, counterIf1_2, counterIf2_2);
				String condition2 = getCondition(opNode2);

				if(!condition.equals("AND") && !condition.equals("OR") && !condition.equals("NOT")){
					emit(condition2 + " " + label_2);
					emit("goto " + label2_2);
				}
				emit(label_2 + ":");
				generateStatements(nodeIf.getChild(1));
				emit("goto " + end_label);
				emit(label2_2 + ":");
			}
			else if(nodeIf.getType() == MintParser.ELSE){
				generateStatements(nodeIf.getChild(0));
				emit("goto " + end_label);
			}
		}
		emit(end_label + ":");
	}

	public String getCondition(Tree node){

		String condition = "";
		switch(node.getType())
		{             		
		case MintLexer.LESS:  // <
			condition = "if_icmplt";
			break;
		case MintLexer.GREATER:  // >
			condition = "if_icmpgt";
			break;
		case MintLexer.EQUALS:  // ==
			condition = "if_icmpeq";
			break; 
		case MintLexer.LTE:  // <=
			condition = "if_icmple";
			break; 
		case MintLexer.GTE:  // >=
			condition = "if_icmpge"; 
			break; 
		case MintLexer.ASSIGN_NOT:  // !=
			condition = "if_icmpne";
			break; 


		case MintLexer.OP_OR:  // ||
			condition = "OR";
			break; 
		case MintLexer.AND:  // &&
			condition = "AND";
			break; 
		case MintLexer.OP_NOT:  // !
			condition = "NOT";
			break; 

		default:
			condition = "ifne";
			break;
		}

		return condition;
	}

	public void generateOpCondition(Tree node, int n1, int n2) {

		emit("**** CONDITION ***");
		generateExpression(node, n1, n2);
		emit("**** END CONDITION ***");
	}








	public void infoClassDectect(Tree t) {
		if ( t != null ) {    

			scopes.addClass(t);

			for ( int i = 0; i < t.getChildCount(); i++ ) {

				Tree member = t.getChild(i);
				switch(member.getType())
				{
				case MintLexer.METHOD:
					scopes.addMethod(member);
					infoMethodDectect(member);
					scopes.removeMethod(member);
					break;
				}
			}
		}
	}

	public void infoMethodDectect(Tree t) {
		if ( t != null ) {  

			for ( int i = 0; i < t.getChildCount(); i++ ) {

				Tree member = t.getChild(i);
				switch(member.getType())
				{
				case MintLexer.FIELD:  
					scopes.currentMethodScope.numberLocal++;
					break;
				case MintLexer.PARAMS: 
					for ( int j = 0; j < member.getChildCount(); j++ ) {
						scopes.currentMethodScope.numberLocal++;
					}
					break;
				default:
					infoMethodDectect(member);
					break;
				}
			}
		}
	}


	public String getDataType(Tree node){

		String dataType = "";

		switch(node.getType()){
		case MintLexer.INT:
		case MintLexer.INTEGER_LITERAL:
			dataType = "I";
			break;

		case MintLexer.FLOAT:
		case MintLexer.FLOAT_LITERAL:
			dataType = "F";
			break;

		case MintLexer.CHAR_LITERAL:
			dataType = "C";
			break;

		case MintLexer.STRING_LITERAL:
			dataType = "Ljava/lang/String;";
			break;

		case MintLexer.BOOLEAN:
			dataType = "Z";
			break;

		case MintLexer.VOID:
			dataType = "V";
			break;

		case MintLexer.ARRAY_TYPE:
			dataType = "[" + getDataType(node.getChild(0));
			break;

		default:
			if(node.getText().equalsIgnoreCase("string")){
				dataType = "Ljava/lang/String;";
			}
			else if(node.getText().equalsIgnoreCase("Object")){
				dataType = "Ljava/lang/Object;";
			}
			else{
				dataType = "L"+node.getText();
			}
			break;
		}

		return dataType;
	}

}