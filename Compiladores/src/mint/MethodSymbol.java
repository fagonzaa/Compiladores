package mint;

import java.util.List;
import java.util.ArrayList;

public class MethodSymbol extends Symbol {

    MethodScope methodScope;

    public MethodSymbol(String id, Visibility v, Type t, Scope s, MethodScope methodScope) {
        super(id, v, t, s);
        this.methodScope = methodScope;
    }

}