package problem;

class Palindrome {
    static boolean oddLength(int num,int len) {
	int[] arr1 = new int[len/2];
	int[] arr2 = new int[len/2];
	boolean result = true;
	
	for(int i = 0; i <= len/2; i++) {
	    if(i == len/2)
		num /= 10;
	    else {
		arr1[i] =num % 10;
		num /= 10;
	    }
	}
	
	for(int i = 0; i < len/2; i++) {
	    arr2[i] = num %10;
	    num /= 10;
	}
	
	for(int i = 0, j = arr2.length-1;i < arr1.length; i++, j--) {
	    if(arr1[i] != arr2[j]) {
		result = false;
		break;
	    }
	}
	
	return result;
    }
    
    static boolean evenLength(int num, int len) {
	int[] arr1 = new int[len/2];
	int[] arr2 = new int[len/2];
	boolean result = true;
	
	for(int i = 0; i < len/2; i++) {
	    arr1[i] = num % 10;
	    num /= 10;
	}
	for(int i = 0; i < len/2; i++) {
	    arr2[i] = num %10;
	    num /= 10;
	}
	
	for(int i = 0, j = arr2.length-1;i < len/2; i++, j--) {
	    if(arr1[i] != arr2[j]) {
		result = false;
		break;
	    }
	}
	
	return result;
    }
    
    static boolean isPalindrome (int num) {
	boolean result;
	int temp = num;
	int length = 0;
	
	while(true) {
	    temp /= 10;
	    length++;
	    if(temp == 0)
		break;
	}
	
	if(length%2 == 0) {
	    result = evenLength(num, length);
	}else {
	    result = oddLength(num, length);
	}
	
	return result;
    }
    public static void main(String[] args) {
	int a = 1234321;
	int b = 456904569;
	int c = 456909654;
	int d = 1122332211;
	int f = 55;
	
	System.out.println("is a palindrome : " + isPalindrome(a));
	System.out.println("is b palindrome : " + isPalindrome(b));
	System.out.println("is c palindrome : " + isPalindrome(c));
	System.out.println("is d palindrome : " + isPalindrome(d));
	System.out.println("is f palindrome : " + isPalindrome(f));
    }

}
