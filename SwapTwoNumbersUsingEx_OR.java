package Test;

class SwapTwoNumbersUsingEx_OR {

    public static void main(String[] args) {
	int num1 = 12;
	int num2 = 35;
	System.out.println("Before Swap : num1 and num2 \n" + num1 + "	" + num2);
	num1 = num1 ^ num2;
	num2 = num1 ^ num2;
	num1 = num1 ^ num2;
	System.out.println("After Swap : num1 and num2 \n" + num1 + "	" + num2);
    }

}
