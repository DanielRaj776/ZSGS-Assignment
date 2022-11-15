package interviewpreparation;

import java.util.Scanner;

public class LongestPrefix {
    private String findLongestCommonPrefix (String[] arr) {
	String result = "";
	int longestPosibleLength = 0;
	for(String x: arr) {
	    if(x.length() > longestPosibleLength)
		longestPosibleLength = x.length();
	}
	boolean flag = true;
	for(int i = 0; i < longestPosibleLength; i++) {
	    char ch = arr[0].charAt(i);
	    for(int j = 1; j < arr.length; j++) {
		if(ch != arr[j].charAt(i)) {
		    flag = false;
		    break;
		}
	    }
	    if(flag) {
		result += ch;
	    }else {
		break;
	    }
	}
	return result;
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of string in the array");
	int num = scanner.nextInt();
	String[] arr = new String[num];
	for(int i = 0; i < num; i++) {
	    System.out.printf("Enter %d String\n", i + 1);
	    arr[i] = scanner.next();
	}
	System.out.println(findLongestCommonPrefix(arr));
	scanner.close();
    }
    public static void main(String[] args) {
	LongestPrefix ob = new LongestPrefix();
	ob.getInput();
    }
}
