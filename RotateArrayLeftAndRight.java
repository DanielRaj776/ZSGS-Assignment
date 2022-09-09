package ArrayProblems;

import java.util.Arrays;

class RotateArrayLeftAndRight {
    static void leftRotate (int[] arr, int numberOfPosition) {
	for(int i = 0; i < numberOfPosition; i++) {
	    int temp = arr[0];
	    for(int j = 1; j < arr.length; j++) {
		arr[j - 1] = arr[j];
	    }
	    arr[arr.length - 1] = temp;
	}
    }
    static void rightRotate (int[] arr, int numbeOfPosition) {
	for(int i = 0; i < numbeOfPosition; i++) {
	    int temp = arr[arr.length - 1];
	    for(int j = arr.length - 1; j > 0; j--) {
		arr[j] = arr[j - 1];
	    }
	    arr[0] = temp;
	}
    }
    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6};
	rightRotate(arr, 1);
	System.out.println(Arrays.toString(arr));
	
    }

}
