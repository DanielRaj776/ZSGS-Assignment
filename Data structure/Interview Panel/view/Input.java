package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Utilities.InputCheck;

public class Input {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private final String arrow = "->";
    public long numberInput ( ) {
	String inputString = "";
	try {
	    inputString = bufferedReader.readLine();
	} catch (IOException e) {
	    System.out.println("Error, Please Renter");
	}
	if(!(InputCheck.isNumber(inputString))) {
	    System.out.println("Enter A Number");
	    System.out.print(arrow);
	    inputString = String.valueOf(numberInput());
	}
	return Long.parseLong(inputString);
    }
    public String nameInput () {
	String inputString = "";
	try {
	    inputString = bufferedReader.readLine();
	} catch (IOException e) {
	    System.out.println("Error, Please Renter");
	}
	if((!InputCheck.isEnglishCharacter(inputString))) {
	    System.out.println("Only English Character And Space Are Allowed");
	    System.out.print(arrow);
	    inputString = nameInput();
	}
	return inputString;
    }
}
