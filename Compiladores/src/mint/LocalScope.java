package mint;   

import java.lang.*;

class LocalScope extends Scope {
    
    Scope parent;
    MethodScope method;

    public LocalScope(Scope parent, MethodScope method) {
        this.parent = parent;
        this.method = method;
        parent.subscopes.add(this);
    }

    public Symbol find(String id) {
        Symbol s = this.get(id);
        if ( s == null ) {
            s = parent.find(id);
        }
        return s;
    }

    public void add(String id, Symbol s) {

        Symbol old = this.find(id);

        if( old == null || old.scope instanceof ClassScope ) {
            this.put(id, s);
        }
        else {
            throw new IllegalArgumentException("symbol " + id + " already exists");
        }

    }


}