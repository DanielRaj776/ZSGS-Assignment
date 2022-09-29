package problem;

class SmallerNumberThanCurrent {
    static int[] smallerNumberThanCurrent(int[] nums) {
	
	int[] countOfSmallerNum = new int[nums.length];
	for(int i = 0; i < nums.length; i++) {
	    int count = 0;
	    for(int j = 0; j < nums.length; j++) {
		if(i == j)
		    continue;
		else if(nums[i] > nums[j])
		    count++;
	    }
	    countOfSmallerNum[i] = count;
	}
	
	return countOfSmallerNum;
    }
    public static void main(String[] args) {
	int[] arr = {1, 4, 7, -1, 8, 3, 3};
	int[] result = smallerNumberThanCurrent(arr);
	for(int x: result) {
	    System.out.print(x + " ");
	}
    }

}
