package problem;

class Sqrt {
    static int mySqrt(int x) {
	if(x < 2)
	    return x;
	else if(x > 1 && x < 4)
	    return 1;
	
	int squreroot = 2;
	
	while(true) {
	    if((squreroot)*(squreroot) >= x) {
		if((squreroot)*(squreroot) == x)
		    return squreroot;
		else
		    return squreroot-1;
	    }
	    squreroot++;
	}
    }
    public static void main(String[] args) {
	System.out.println(mySqrt(90));
    }

}
