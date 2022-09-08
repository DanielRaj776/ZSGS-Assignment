package ArrayProblems;

import java.util.Arrays;

class SortArrayInEvenBigOddSmallForm {
    static int[] evenBigOddSmallSort (int[] arr) {
	Arrays.sort(arr);
	int[] result = new int[arr.length];
	int midIndex = arr.length / 2;
	if(arr.length % 2 == 0)
	    midIndex--;
	for(int i = midIndex, j = midIndex + 1, k = 0; i >= 0 || j < result.length;) {
	    if(i >= 0)
		result[k++] = arr[i--];
	    if(j < result.length)
		result[k++] = arr[j++];
	}
	
	return result;
    }
    public static void main(String[] args) {
	
	int[] arr = {1, 2, 1, 4, 5, 6, 8};
	System.out.println(Arrays.toString(evenBigOddSmallSort(arr)));
	
    }

}
