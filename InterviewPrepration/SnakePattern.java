package interviewpreparation;

import java.util.Scanner;

public class SnakePattern {
    private void printSnakePattern (int num) {
	int elementSize = 0;
	int numSqr = num * num;
	while (numSqr != 0) {
	    elementSize++;
	    numSqr /= 10;
	}
	elementSize++;
	String space = "";
	for(int i = 0; i < elementSize; i++) {
	    space += " ";
	}
	boolean falg = true;
	int spaceCount = num - 1;
	int number = 0;
	for(int i = 0; i < num; i++) {
	    for(int j = 0; j < spaceCount; j++) {
		System.out.print(space);
	    }
	    for(int j = 0; j < num; j++) {
		if(falg) {
		    System.out.printf("%" + elementSize + "d", number + j + 1);
		}else {
		    System.out.printf("%" + elementSize + "d", number + num - j);
		}
	    }
	    System.out.println();
	    spaceCount--;
	    falg = !falg;
	    number += num;
	}
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input");
	System.out.print("->");
	int num = scanner.nextInt();
	printSnakePattern(num);
	scanner.close();
    }
    
    public static void main(String[] args) {
	SnakePattern ob = new SnakePattern();
	ob.getInput();
    }

}
