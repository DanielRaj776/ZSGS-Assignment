package parent_child_and_default_method;

interface Relationship {
    void println();
}
abstract class Parent implements Relationship{
    void print() {
	println();
    }
}
class Child extends Parent {
    @Override
    public void println() {
	System.out.println("child");
    }
}
class ChildMethodCallTest3 {
    public static void main(String[] args) {
	Parent parent = new Child();
	parent.print();
    }
}
