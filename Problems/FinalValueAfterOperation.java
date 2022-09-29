package problem;

class FinalValueAfterOperation {
    static int finalValue (String[] operations) {
	int x = 0;
	for(String a: operations) {
	    if(a.equals("x++") || a.equals("++x") || a.equals("++X") || a.equals("X++")) {
		x++;
	    }else {
		x--;
	    }
	}
	return x;
    }
    public static void main(String[] args) {
	String[] s = {"--X","X++","X++"};
	int a = finalValue(s);
	System.out.println(a);
    }

}
