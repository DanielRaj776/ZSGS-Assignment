package problem;

class GreatestCommenDivicer {
    static int[] greatestAndSmallest (int[] nums) {
	int small , great;
	small = great = nums[0];
	for(int i = 1; i < nums.length; i++) {
	    if(small > nums[i]) {
		small = nums[i];
	    }else if(great  < nums[i]) {
		great = nums[i];
	    }
	}
	return new int[] {great, small};
    }
    static int findGCD(int[] nums) {
	int result;
        int[] gAndS = greatestAndSmallest(nums);
        while(true){
            if(gAndS[0] % gAndS[1] == 0)
                return gAndS[1];
            result = gAndS[0] % gAndS[1];
            gAndS[0] = gAndS[1];
            gAndS[1] = result;
        }
    }
    public static void main(String[] args) {
	int[] nums = {2, 2, 7};
	int result = findGCD(nums);
	System.out.println(result);
    }

}
