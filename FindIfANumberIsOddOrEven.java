package Test;

class FindIfANumberIsOddOrEven {
    static boolean isEven (int num) {
	String binary = Integer.toBinaryString(num);
	if(binary.charAt(binary.length() - 1) == '0') {
	    return true;
	}else {
	    return false;
	}
    }
    public static void main(String[] args) {
	int num = -10;
	if(isEven(num)) {
	    System.out.println("Even");
	}else {
	    System.out.println("Odd");
	}
	
    }

}
