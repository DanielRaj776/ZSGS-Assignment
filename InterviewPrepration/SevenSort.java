package interviewpreparation;

import java.util.Arrays;

public class SevenSort {
    private int[] sort (int[] arr) {
	for(int i = 0, j = 0; j < arr.length;) {
	    if(i == j) {
		if(arr[i] != 7) {
		    i++;
		    j++;
		}else {
		    j++;
		}
	    }else if(arr[i] != 7) {
		i++;
	    }else if(arr[j] != 7) {
		int temp = arr[i];
		arr[i++] = arr[j];
		arr[j++] = temp;
	    }else {
		j++;
	    }
	}
	return arr;
    }
    private void getInput () {
	int[] arr = {3, 7, 3, 7, 3, 7, 3, 7};
	System.out.println(Arrays.toString(sort(arr)));
	System.out.println("Expected : " + "{3, 3 , 3 , 3, 7, 7, 7, 7}" );
    }
    public static void main(String[] args) {
	SevenSort ob = new SevenSort();
	ob.getInput();
    }

}
