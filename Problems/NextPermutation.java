package problem;

import java.util.Arrays;

class NextPermutation {
    static void nextPermutation(int[] nums) {
	boolean FoundPosition = false;
	boolean setSwitchPosition = false;
	int i = nums.length - 1;
	int j = nums.length - 1;
	int sortingStrat = 0;
	int sortingEnd = nums.length - 1;
	int switchPosition;
	while( i > 0) {
	    if(nums[i] > nums[i - 1]) {
		FoundPosition = true;
		i--;
	    	break;
	    }else
		i--;
	}
	switchPosition = i + 1;
	if(FoundPosition) {
	    while(j > i) {
		if(nums[j] > nums[i] && nums[j] <= nums[switchPosition]) {
		    if(!setSwitchPosition && nums[j] == nums[switchPosition]) {
			switchPosition = j;
			setSwitchPosition = true;
		    }else if(nums[j] < nums[switchPosition]) {
			switchPosition = j;
			setSwitchPosition = true;
		    }
		}
		j--;
	    }
	    int temp = nums[switchPosition];
	    nums[switchPosition] = nums[i];
	    nums[i] = temp;
	    sortingStrat = i + 1;
	}
	while(sortingStrat < sortingEnd) {
	    int temp = nums[sortingEnd];
	    nums[sortingEnd] = nums[sortingStrat];
	    nums[sortingStrat] = temp;
	    sortingStrat++;
	    sortingEnd--;
	}
    }
    public static void main(String[] args) {
	int[] arr = {3,4,1,4,3,3};
	nextPermutation(arr);
	System.out.println(Arrays.toString(arr));
    }

}
