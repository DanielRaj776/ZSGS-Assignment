package interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TotalNumberOfDates {
    private void printInvalid() {
	System.out.println("Invalid input");
    }

    private boolean isLeap(int year) {
	if (year % 4 == 0) {
	    if (year % 100 == 0 && year % 400 == 0) {
		return true;
	    } else if (year % 100 == 0) {
		return false;
	    } else {
		return true;
	    }
	} else {
	    return false;
	}
    }

    private int findNumberOfDatesBetween(Integer[] date1, Integer[] date2) {
	if (Arrays.deepEquals(date1, date2))
	    return 0;
	if (date1[2] > date2[2]) {
	    printInvalid();
	    return -1;
	} else if (date1[2] == date2[2] && date1[1] > date2[1]) {
	    printInvalid();
	    return -1;
	} else if (date1[2] == date2[2] && date1[1] == date2[1] && date1[0] > date2[0]) {
	    printInvalid();
	    return -1;
	}

	int[][] month = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
		{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
	int year[] = { 365, 366 };
	int numberOfDays = 0;
	numberOfDays += date1[0];

	int index = 0;
	if (isLeap(date1[2]))
	    index = 1;
	for (int i = 0; i < date1[1] - 1; i++) {
	    numberOfDays += month[index][i];
	}
	numberOfDays = year[index] - numberOfDays;
	if (isLeap(date2[2])) {
	    index = 1;
	} else {
	    index = 0;
	}
	int temp = date2[0];
	for (int i = 0; i < date2[1] - 1; i++) {
	    temp += month[index][i];
	}
	numberOfDays += date1[2].intValue() != date2[2].intValue() ? temp : (year[index] - temp) * -1;
	for (int i = date1[2] + 1; i < date2[2]; i++) {
	    if (isLeap(i)) {
		numberOfDays += year[1];
	    } else {
		numberOfDays += year[0];
	    }
	}
	return numberOfDays;
    }

    private Integer[] toIntArr(String date) {
	String[] dateSArr = date.split(":");
	Integer[] dateIArr = new Integer[dateSArr.length];
	for (int i = 0; i < dateSArr.length; i++) {
	    dateIArr[i] = Integer.parseInt(dateSArr[i]);
	}
	return dateIArr;
    }

    private void getInput() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first date (dd:mm:yyyy)");
	String date1 = scanner.next();
	System.out.println("Enter the second date (dd:mm:yyyy");
	String date2 = scanner.next();
	System.out.println(findNumberOfDatesBetween(toIntArr(date1), toIntArr(date2)));
	scanner.close();
    }

    public static void main(String[] args) {
	TotalNumberOfDates ob = new TotalNumberOfDates();
	ob.getInput();
    }

}
