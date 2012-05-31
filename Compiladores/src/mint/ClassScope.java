package mint;

class ClassScope extends Scope {

    public Symbol find(String id) {
        return this.get(id);
    }

    public void add(String id, Symbol s) {
        this.put(id, s);
    }


}