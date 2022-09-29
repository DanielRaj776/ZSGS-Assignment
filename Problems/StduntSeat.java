package problem;

import java.util.ArrayList;
import java.util.List;

class StduntSeat {
    static int nextBig (int[] arr, int big) {
    }
    static int minMovesToSeat(int[] seats, int[] students) {
	int position, target;
	int lastIndex = 0;
	int[] unmovedStd = new int[students.length];
	for(int i = 0; i < seats.length; i++) {
	    for(int j = 0; j < students.length; j++) {
		if(seats[i] == students[j]) {
		    unmovedStd[lastIndex++] = seats[i];
		}
	    }
	}
    }
    public static void main(String[] args) {
	
    }

}
