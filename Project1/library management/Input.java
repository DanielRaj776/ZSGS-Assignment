package libraryManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    private Scanner scanner;
    
    public Input() {
	scanner = new Scanner(System.in);
    }
    
    int startMenuInput () {
	int input = 0;
	do {
	    try {
		input = scanner.nextInt();
		scanner.nextLine();
	    } catch (InputMismatchException e) {
		scanner.nextLine();
	    }
	    if(!(input >= 1 && input <= 2))
		System.out.println("           Invalid Input");
	} while (!(input >= 1 && input <= 2));
	return input;
    }
    String passwordInput () {
	String input = "";
	try {
	    input = scanner.next();
	} catch (InputMismatchException e) {
	}
	return input;
    }
    int adminOperationsMenuInput() {
	int input = 0;
	try {
	    input = scanner.nextInt();
	    scanner.nextLine();    
	} catch (InputMismatchException e) {
	    scanner.nextLine();
	}
	return input;
    }
    int optionInput () {
	int input = 0;
	try {
	    input = scanner.nextInt();
	    scanner.nextLine();
	} catch (InputMismatchException e) {
	    scanner.nextLine();
	}
	return input;
    }
   String userNameInput () {
       String input = "";
       boolean notAllAlphabet = false;
       do {
	   notAllAlphabet = false;
	   input = scanner.nextLine();
	   for(int i = 0; i < input.length(); i++) {
	       if(!((input.charAt(i) <= 'Z' && input.charAt(i) >= 'A') || (input.charAt(i) <= 'z' && input.charAt(i) >= 'a'))) {
		   notAllAlphabet = true;
	       }
	   }
	   if(notAllAlphabet) {
	       System.out.println("           Invalid Input Use Only English Alphabets");
	       System.out.print("           ");
	   }
       } while (notAllAlphabet);
       return input;
   }
   long userPhoneNo () {
       long input = 0;
       int count = 0;
       do {
	   count = 0;
	   try {
	       input = scanner.nextLong();
	       scanner.nextLine();
	   } catch (InputMismatchException e) {
	       scanner.nextLine();
	   }
	   long temp = input;
	   while(temp != 0) {
	       count++;
	       temp /= 10;
	   }
	   if(!(count == 10)) {
	       System.out.println("           Invalid Input Enter ten Number");
	       System.out.print("           ");
	   }
       } while (!(count == 10));
       return input;
   }
   int bookPublishedYear () {
       int input = 0;
       int count = 0;
       do {
	   count = 0;
	   try {
	       input = scanner.nextInt();
	       scanner.nextLine();
	   } catch (InputMismatchException e) {
	       scanner.nextLine();
	   }
	   int temp = input;
	   while(temp != 0) {
	       count++;
	       temp /= 10;
	   }
	   if(!(count == 4)) {
	       System.out.println("           Invalid Input Enter full Year (yyyy)");
	       System.out.print("           ");
	   }
       } while (!(count == 4));
       return input;
   }
   
   
    String stringInput () {
	String input = "";
	try {
	    input = scanner.nextLine();
	} catch (InputMismatchException e) {
	}
	return input;
    }
    int integerInput () {
	int input = 0;
	boolean notNumber;
	do {
	    notNumber = false;
	    try {
		input = scanner.nextInt();
		scanner.nextLine();
	    } catch (InputMismatchException e) {
		scanner.nextLine();
		System.out.println("           Enter a Number");
		System.out.print("           ");
		notNumber = true;
	    }
	} while (notNumber);
	return input;
    }
    
    void colse () {
	scanner.close();
    }
    
}
