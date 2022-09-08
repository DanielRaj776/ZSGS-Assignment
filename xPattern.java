package ArrayProblems;

import java.util.Scanner;

class xPattern {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a word.");
	String input = in.next();
	if(input.length() % 2 == 0) {
	    System.out.print("O");
	}else {
	    int innerSpace = input.length() - 2;
	    boolean crossedMidpoint = false;
	    int outerSpace = 0;
	    String blanckSpace = " ";
	    for(int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
		if(i == j) {
		    for(int k = 0; k < outerSpace; k++)
			System.out.print(blanckSpace);
		    System.out.print(input.charAt(i));
		    crossedMidpoint = true;
		}else {
		    for(int k = 0; k < outerSpace; k++)
			System.out.print(blanckSpace);
		    System.out.print(i < j ? input.charAt(i) : input.charAt(j));
		    for(int k = 0; k < innerSpace; k++)
			System.out.print(blanckSpace);
		    System.out.print(i < j ? input.charAt(j) : input.charAt(i));
		}
		System.out.println();
		if(crossedMidpoint) {
		    innerSpace += 2;
		    outerSpace--;
		}else {
		    innerSpace -= 2;
		    outerSpace++;
		}
	    }
	}
	in.close();
    }

}
