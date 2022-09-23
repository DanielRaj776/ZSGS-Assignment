package parent_child_and_default_method;

class ChildMethodCallTest2 {

    public static void main(String[] args) {
	
	Parent2 parent = new Parent2();
	parent.setChildReferance(new Child2());
	parent.print();
	
    }

}
