package mint;

public class Symbol {

    String id;
    Visibility visibility;
    Type type;
    Scope scope;

    public Symbol(String id, Visibility v, Type t, Scope s) {
        this.id = id;
        this.visibility = v;
        this.type = t;
        this.scope = s;   
    }

}
