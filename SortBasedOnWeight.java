package ArrayProblems;

import java.util.Arrays;

class SortBasedOnWeight {
    static int weightOf (int num) {
	int weight = 0;
	double squreRoot = Math.sqrt(num);
	if(squreRoot == (int)squreRoot)
	    weight += 5;
	if(num % 4 == 0 && num % 6 == 0)
	    weight += 4;
	if(num % 2 == 0)
	    weight += 3;
	return weight;
    }
    public static void main(String[] args) {
	
	int[] arr = {49, 36, 8, 10, 12};
	int[] weightArr = new int[arr.length];
	for(int i = 0; i < arr.length; i++) {
	    weightArr[i] = weightOf(arr[i]);
	}
	for(int i = 0; i < arr.length - 1; i++) {
	    for(int j = i + 1; j < arr.length; j++) {
		int temp;
		if(weightArr[i] < weightArr[j]){
		    temp = weightArr[i];
		    weightArr[i] = weightArr[j];
		    weightArr[j] = temp;
		    
		    temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}
	System.out.println(Arrays.toString(weightArr));
	System.out.println(Arrays.toString(arr));
    }
    
}
