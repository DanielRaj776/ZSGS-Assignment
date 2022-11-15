package interviewpreparation;

import java.util.Scanner;

public class EncryptString {
    private String encrypt (String s1, String s2) {
	String result = "";
	if(s1.length() != s2.length()) {
	    return result;
	}
	for(int i = 0; i < s1.length(); i++) {
	    int temp = s1.charAt(i) + s2.charAt(i) - ('a' - 1);
	    if(temp > 'z') {
		temp -= 'z';
		temp += ('a' - 1);
	    }
	    result += (char)temp;
	}
	return result;
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first string");
	String s1 = scanner.next();
	System.out.println("Enter the second string");
	String s2 = scanner.next();
	System.out.println(encrypt(s1, s2));
	scanner.close();
    }
    public static void main(String[] args) {
	EncryptString ob = new EncryptString();
	ob.getInput();
    }

}
