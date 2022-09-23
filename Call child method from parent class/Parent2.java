package parent_child_and_default_method;

class Parent2 {
    private Child2 childReferance;
    
    void setChildReferance(Child2 ch) {
	childReferance = ch;
    }
    void print() {
	childReferance.println();
    }
}
