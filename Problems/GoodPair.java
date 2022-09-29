package problem;

class GoodPair {
    static int numIdenticalPair(int[] nums) {
	if(nums.length < 2)
	    return 0;
	
	int count = 0;
	for(int i = 0; i < nums.length; i++) {
	    for(int j = i+1 ; j < nums.length; j++) {
		if(nums[i] == nums[j])
		    count++;
	    }
	}
	return count;
    }
    public static void main(String[] args) {
	int[] a = {1, 1, 1, 1};
	int result = numIdenticalPair(a);
	System.out.println(result);
    }

}