package interviewpreparation;

import java.util.Scanner;

public class RailSeat {
    private String findSeatPsition (int seatNumber) {
	int totalNumberOfSeats = 72;
	String result = "";
	if(seatNumber > 0 && seatNumber <= totalNumberOfSeats) {
	    int temp = seatNumber % 8;
	    if(temp > 0 && temp < 7) {
		temp = temp % 3;
		switch (temp) {
		case 0:
		    result += "Upper berth";
		    break;
		case 1:
		    result += "Lower berth";
		    break;
		case 2:
		    result += "Middle berth";
		    break;
		}
	    }else {
		if(temp == 0) {
		    result += "Side upper berth";
		}else {
		    result += "Side lower berth";
		}
	    }
	}else {
	    result += "Invalid seat number";
	}
	return result;
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter seat number");
	System.out.println(findSeatPsition(scanner.nextInt()));
	scanner.close();
    }
    public static void main(String[] args) {
	RailSeat ob = new RailSeat();
	ob.getInput();
    }
}
