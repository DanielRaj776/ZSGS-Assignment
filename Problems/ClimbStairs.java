package problem;

class ClimbStairs {
    static long stepCount (int num, int one, int two) {
	int removedNum;
	int divider;
	long result = 1;
	long fact = 1;
	if(one > two) {
	    removedNum = one;
	    divider = two;
	}
	else {
	    removedNum = two;
	    divider = one;
	}
	
	for(int i = removedNum + 1; i <= num; i ++) {
	    result *= i;
	}
	for(int i = divider; i > 0; i--) {
	    fact *= i;
	}
	
	result /= fact;
	
	return result;
    }
    
    static int climbstairs(int n) {
	int twosteps = 0;
	int onesteps = n;
	int steps = n;
	
	int sum = 0;
	
	for(int i = 0; i < (n / 2) + 1; i++) {
	    sum = (int)(sum + stepCount(steps, onesteps, twosteps));
	    twosteps++;
	    onesteps -= 2;
	    steps--;
	    
	}
	
	return sum;
    }
    
    public static void main(String[] args) {
	
	int a = climbstairs(35);
	System.out.println(a);
    }

}
