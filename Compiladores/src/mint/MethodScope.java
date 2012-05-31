package mint;

import java.util.Hashtable;

class MethodScope extends Scope {
    
    ClassScope parent;
    Hashtable<String, Symbol> parameters;

    public int counterLocal = 1;
    public int counterTemp = 1;
    public int numberLocal = 1;
    
    // NUEVO
    public int counterIf = 0;
    
    public ClassScope getClassScope() {
        return parent;
    }

    public MethodScope(ClassScope parent) {
        this.parameters = new Hashtable<String, Symbol>();
        this.parent = parent;
    }

    @Override
    public Symbol find(String id) {
        Symbol s = parameters.get(id);
        if ( s == null ) {
            s = this.get(id);
        }

        if ( s == null ) {
            s = parent.get(id);
        }
        return s;
    }

    public void add(String id, Symbol s) {
        this.put(id, s);
        counterLocal++;
        counterTemp++;
    }

    public void addParameter(String id, Symbol s)
    {
        this.parameters.put(id, s);
    }

    public void ResetCounterTemp(){
    	counterTemp = numberLocal + 1;
    }
    
    public int getCounterTemp(){
       	return counterTemp++;
    }

    // NUEVO
    public void ResetCounterIf(){
    	counterIf = 0;
    }

    // NUEVO
    public int getCounterIf(){
       	return counterIf++;
    }

}