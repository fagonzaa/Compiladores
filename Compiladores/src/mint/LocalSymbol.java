package mint;

import java.util.List;
import java.util.ArrayList;

public class LocalSymbol extends Symbol {

    MethodScope methodScope;
    int number = 0;
    

    public LocalSymbol(String id, Type t, MethodScope methodScope, int number) {
        super(id, Visibility.PUBLIC, t, methodScope);
        this.methodScope = methodScope;
        this.number = number;
    }

}