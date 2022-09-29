package problem;

class ReverseInteger {
    static int reverse(int x) {
	long reversedInteger = 0;
	while(x != 0) {
	    reversedInteger *= 10;
	    reversedInteger += x % 10;
	    x /= 10;
	    if(reversedInteger > Integer.MAX_VALUE || reversedInteger  < Integer.MIN_VALUE)
		return 0;
	}
	return (int)reversedInteger;
    }
    public static void main(String[] args) {
	System.out.println(reverse(123456789));
    }

}
