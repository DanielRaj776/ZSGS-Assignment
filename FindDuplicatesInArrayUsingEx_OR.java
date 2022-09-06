package Test;

import java.util.HashSet;
import java.util.Set;

class FindDuplicatesInArrayUsingEx_OR {
    static int[] removeDuplicates (int[] numberArray) {
	int[] result;
	Set<Integer> duplicatIndex = new HashSet<>();
	for(int i = 0; i < numberArray.length; i++) {
	    if(duplicatIndex.contains(i))
		continue;
	    for(int j = i + 1; j < numberArray.length; j++) {
		if((numberArray[i] ^ numberArray[j]) == 0)
		    duplicatIndex.add(j);
	    }
	}
	result = new int[numberArray.length - duplicatIndex.size()];
	for(int i = 0, j = 0; i < numberArray.length; i++) {
	    if(duplicatIndex.contains(i))
		continue;
	    result[j++] = numberArray[i];
	}
	return result;
    }
    public static void main(String[] args) {
	
	int[] arr = {1, 1, 2, 3, 4, 1, 3, 4, 5, 6, 7, 7, 6, 1, 8, 9};
	for(int x : removeDuplicates(arr)) {
	    System.out.print(x + "  ");
	}
    }
}
