package interviewpreparation;

import java.util.Scanner;

public class RemovePalindrome {
    private boolean isPalindrome (String s) {
	int len = s.length() / 2;
	for(int i = 0, j = s.length() - 1; i < len; i++, j--){
	    char ch1 = s.charAt(i);
	    char ch2 = s.charAt(j);
	    if(!(ch1 == ch2 || (ch1 + 32) == ch2 || (ch1 - 32) == ch2))
		return false;
	}
	return true;
    }
    
    private String remove (String s) {
	String result = "";
	s.trim();
	if(s.length() == 0)
	    return result;
	String[] arr = s.split(" ");
	for(String x: arr) {
	    if(!isPalindrome(x))
		result += x + " ";
	}
	return result;
    }
    
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the sentence");
	String sentence = scanner.nextLine();
	System.out.println(remove(sentence));
	scanner.close();
    }
    public static void main(String[] args) {
	RemovePalindrome ob = new RemovePalindrome();
	ob.getInput();
    }

}
