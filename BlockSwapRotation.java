package ArrayProblems;

import java.util.Arrays;

class BlockSwapRotation {
    static void swap (int[] arr, int firstSubArrStartIndex, int secondSubArrStartIndex, int lengthOfSubArrays) {
	for(int i = 0; i < lengthOfSubArrays; i++) {
	    int temp = arr[firstSubArrStartIndex + i];
	    arr[firstSubArrStartIndex + i] = arr[secondSubArrStartIndex + i];
	    arr[secondSubArrStartIndex + i] = temp;
	}
    }
    static void blockSwapRotation (int[] arr, int numOfRotation) {
	int length = arr.length;
	int firstSubArrEndIndex = numOfRotation;
	int secondSubArrStartIndex = length - numOfRotation;
	
	while(firstSubArrEndIndex != secondSubArrStartIndex) {
	    if(firstSubArrEndIndex < secondSubArrStartIndex) {
		swap(arr, numOfRotation - firstSubArrEndIndex, secondSubArrStartIndex + numOfRotation - firstSubArrEndIndex, firstSubArrEndIndex);
		secondSubArrStartIndex -= firstSubArrEndIndex;
	    }else {
		swap(arr, numOfRotation - firstSubArrEndIndex, numOfRotation, secondSubArrStartIndex);
		firstSubArrEndIndex -= secondSubArrStartIndex;
	    }
	}
	
	swap (arr, numOfRotation - firstSubArrEndIndex, numOfRotation, firstSubArrEndIndex);
    }
    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	blockSwapRotation(arr, 6);
	System.out.println(Arrays.toString(arr));
    }

}
