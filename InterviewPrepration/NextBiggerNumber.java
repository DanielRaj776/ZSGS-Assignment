package interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NextBiggerNumber {
    private int[] createLookupArr (int[] arr) {
	Set<Integer> treeSet = new TreeSet<>();
	for(int x : arr) {
	    treeSet.add(x);
	}
	int[] result = new int[treeSet.size()];
	int index = 0;
	for(Integer x : treeSet) {
	    result[index++] = x;
	}
	return result;
    }
    private int[] findNextBiggerNumber (int[] arr) {
	int[] result = new int[arr.length];
	int[] lookupArr = createLookupArr(arr);
	for(int i = 0; i < arr.length; i++) {
	    int index = Arrays.binarySearch(lookupArr, arr[i]);
	    result[i] = lookupArr[(index == lookupArr.length - 1) ? index : index + 1];
	}
	return result;
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter array length");
	int length = scanner.nextInt();
	int[] arr = new int[length];
	for(int i = 0; i < length; i++) {
	    System.out.printf("Enter %d element\n", i + 1);
	    arr[i] = scanner.nextInt();
	}
	System.out.println(Arrays.toString(findNextBiggerNumber(arr)));
	scanner.close();
    }
    public static void main(String[] args) {
	NextBiggerNumber ob = new NextBiggerNumber();
	ob.getInput();
    }

}
