package problem;

class PlusOne {
    static int[] plusOne(int[] digits) {
	int num = 1;
	
	if(digits.length == 0)
	    return digits;
	
	for(int i = digits.length-1; i >= 0; i--) {
	    if(digits[i] + num > 9) {
		digits[i] = 0;
		num = 1;
	    }else {
		digits[i] = num + digits[i];
		num = 0;
	    }
	    if(num == 0) {
		break;
	    }else if(num == 1 && i == 0) {
		int[] newDigits = new int[digits.length + 1];
		newDigits[0] = num;
		for(int j = 0; j < digits.length; j++) {
		    newDigits[j+1] = digits[j];
		}
		return newDigits;
	    }
	}
	
	return digits;
	
    }
    public static void main(String[] args) {
	int[] nums4 = {4, 3, 2, 1};
	for(int x : plusOne(nums4)) {
	    System.out.print(x + " ");
	}
    }

}
