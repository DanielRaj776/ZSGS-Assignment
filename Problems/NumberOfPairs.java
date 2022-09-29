package problem;

import java.util.HashSet;
import java.util.Set;

class NumberOfPairs {
    static int[] numberOfPairs(int[] nums) {
	int pair = 0, reminder = 0;
	Set<Integer> newSet = new HashSet<>();
	for(int i = 0; i < nums.length; i++) {
	    if(newSet.contains(nums[i])) {
		newSet.remove(nums[i]);
		pair++;
	    }else {
		newSet.add(nums[i]);
	    }
	}
	reminder = newSet.size();
	return new int[] {pair, reminder};
    }
    public static void main(String[] args) {
	
	int[] pair = { 1, 1, 2, 1, 2, 3, 3, 4};
	int[] result = numberOfPairs(pair);
	for(int i = 0; i < 2; i++)
	    System.out.print(result[i] + "   ");
    }

}
