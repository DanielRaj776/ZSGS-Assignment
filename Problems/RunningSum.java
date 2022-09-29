package problem;

class RunningSum {
    static int[] runningSum(int[] nums) {
	int sum = 0;
	int len = nums.length;
	
	if(len == 0)
	    return nums;
	
	int[] newNum = new int[len];
	for(int i = 0; i < len; i++) {
	    newNum[i] = nums[i] + sum;
	    sum += nums[i];
	}
	return newNum;
    }
    public static void main(String[] args) {
	int[] arr = {1, 1, 1, 1, 1};
	
	int[] arr1 = runningSum(arr);
	for(int x : arr1)
	    System.out.print(x + " ");
    }

}
