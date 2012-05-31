
package mint;

import java.util.Hashtable;

import org.antlr.runtime.tree.Tree;

import mint.ClassScope;
import mint.Scope;

public class ScopeManager {

	Hashtable<String, Scope> scopes;
	ClassScope currentClassScope = null;
	MethodScope currentMethodScope = null;
	
	Symbol currentClassSymbol = null;
	MethodSymbol currentMethodSymbol = null;
	
	
	public ScopeManager(){
		this.scopes = new Hashtable<String, Scope>();
	}
	
	
	public boolean isField(String name){
		Symbol symbol = currentClassScope.get(name);
    	
    	if(symbol != null && symbol.getClass() != MethodSymbol.class){
    		return true;
    	}
    	return false;
	}
	
	public boolean isLocal(String name){
		Symbol symbol = currentMethodScope.get(name);
    	
    	if(symbol != null){
    		return true;
    	}
    	return false;
	}
	
	public boolean isMethod(String name){
		Symbol symbol = currentClassScope.get(name);
    	
    	if(symbol != null && symbol.getClass() == MethodSymbol.class){
    		return true;
    	}
    	return false;
	}
	
	
	
	
	public String getPathField(String name){
		return currentClassSymbol.id + "/" + name;
	}
	
	public String getPathMethod(String name){
		return currentClassSymbol.id + "/" + name;
	}
	
	public void addClass(Tree node){
		currentClassScope = new ClassScope();
		currentClassSymbol = new Symbol(node.getChild(0).getText(), Visibility.PUBLIC, Type.Reference, currentClassScope);
		scopes.put(node.getChild(0).getText(), currentClassScope);
	}
	
	public void loadClass(Tree node){
		
	}
	
	public void addMethod(Tree node){
		Visibility visibility = Visibility.PUBLIC;
    	
    	if(node.getChild(0).getType() == MintLexer.PRIVATE){
    		visibility = Visibility.PRIVATE;
    	}
    	else if(node.getChild(0).getType() == MintLexer.PROTECTED){
    		visibility = Visibility.PROTECTED;
    	}
    	
    	MethodScope scope = new MethodScope(currentClassScope);
    	MethodSymbol symbol = new MethodSymbol(node.getChild(2).getText(), visibility, getType(node.getChild(1)), scope, scope);
    	 
    	currentClassScope.add(node.getChild(2).getText(), symbol);
    	 
    	currentMethodScope = scope;
    	currentMethodSymbol = symbol;
	}
	
	
	public void loadMethod(Tree node){
		
		Symbol symbol = currentClassScope.get(node.getChild(2).getText());
    	
    	if(symbol != null && symbol.getClass() == MethodSymbol.class){
        	currentMethodSymbol = (MethodSymbol)symbol;
        	currentMethodScope = currentMethodSymbol.methodScope;
    	}
	}


	public LocalSymbol addLocal(Tree node){
		
		
		Tree nodeType = null;
		String name = "";
		
		if(node.getType() == MintLexer.FIELD){
			nodeType = node.getChild(0);
			name = node.getChild(1).getText();
		}
		else{
			nodeType = node;
			name = node.getChild(0).getText();
		}
		
    	LocalSymbol symbol = new LocalSymbol(name, getType(nodeType), currentMethodScope, currentMethodScope.counterLocal);
    	 
    	currentMethodScope.add(name, symbol);
    	
    	return symbol;
	}
	
	public void removeMethod(Tree node){
		currentMethodScope = null;
	}
	
	public void addField(Tree node){
		Visibility visibility = Visibility.PUBLIC;
    	
    	if(node.getChild(0).getType() == MintLexer.PRIVATE){
    		visibility = Visibility.PRIVATE;
    	}
    	else if(node.getChild(0).getType() == MintLexer.PROTECTED){
    		visibility = Visibility.PROTECTED;
    	}
    	
    	Symbol symbol = new Symbol(node.getChild(2).getText(), visibility, getType(node.getChild(1)), currentClassScope);
    	 
    	currentClassScope.add(node.getChild(2).getText(), symbol);
	}
	
	
	public Type getType(Tree node){
    	
    	Type dataType = null;
    	
    	switch(node.getType()){
    		case MintLexer.INT:
    		case MintLexer.INTEGER_LITERAL:
    			dataType = Type.Int;
    			break;
    			
    		case MintLexer.FLOAT:
    		case MintLexer.FLOAT_LITERAL:
    			dataType = Type.Float;
    			break;
    			
    		case MintLexer.CHAR_LITERAL:
    			dataType = Type.Int;
    			break;
    		
    		case MintLexer.STRING_LITERAL:
    			dataType = Type.String;
    			break;
    			
    		case MintLexer.BOOLEAN:
    			dataType = Type.Boolean;
    			break;
    			
    		case MintLexer.VOID:
    			dataType = Type.Void;
    			break;
    			
    		case MintLexer.ARRAY_TYPE:
    			dataType = getType(node.getChild(0));
    			dataType.isArray(true);
    			break;
    			
    		default:
    			if(node.getText().equalsIgnoreCase("string")){
    				dataType = Type.String;
    			}
    			else if(node.getText().equalsIgnoreCase("Object")){
    				dataType = Type.Reference;
    				dataType.setReferenceName(node.getText());
    			}
    			else{
    				dataType = Type.Reference;
    				dataType.setReferenceName(node.getText());
    			}
    			break;
    	}
    	
    	return dataType;
    }
	
	public Symbol getField(String name){
		
		Symbol symbol = currentClassScope.get(name);
    	
    	if(symbol != null && symbol.getClass() != MethodSymbol.class){
    		return symbol;
    	}
    	return null;
	}
	
	public MethodSymbol getMethod(String name){
		
		Symbol symbol = currentClassScope.get(name);
    	
    	if(symbol != null && symbol.getClass() == MethodSymbol.class){
    		return (MethodSymbol)symbol;
    	}
    	return null;
	}
	
	public LocalSymbol getLocal(String name){
		Symbol symbol = currentMethodScope.get(name);
    	
    	if(symbol != null){
    		return (LocalSymbol)symbol;
    	}
    	return null;
	}
	
}
