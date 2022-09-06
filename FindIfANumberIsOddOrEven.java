package Test;

class FindIfANumberIsOddOrEven {
    static boolean isEven (int num) {
	if((num & 1) == 1)
	    return false;
	return true;
    }
    public static void main(String[] args) {
	int num = 1234;
	if(isEven(num)) {
	    System.out.println("Even");
	}else {
	    System.out.println("Odd");
	}
    }
}
