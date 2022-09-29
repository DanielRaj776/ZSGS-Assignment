package problem;

class MaximumProductDiffrenceBitweenTowPairs {
    static int[] smallAndBig(int[] nums) {
	int small = 0;
	int big = 0;
	for(int i = 1; i < nums.length; i++) {
	    if(nums[big] < nums[i])
		big = i;
	    else if (nums[small] > nums[i])
		small = i;
	}
	return new int[] {small, big};
    }
    static int nextSmall (int[] nums, int small) {
	int nextSmall = 0;
	boolean assiend = true;
	for(int i = 0; i < nums.length; i++) {
	    if(assiend) {
		if(i != small) {
        		nextSmall = i;
        		assiend = false;
		}
	    }else {
		if(nums[nextSmall] > nums[i] && i != small)
		    nextSmall = i;
	    }
	}
	return nextSmall;
    }
    static int nextBig(int[] nums, int big) {
	int nextBig = 0;
	boolean assiend = true;
	for(int i = 0 ; i < nums.length; i++) {
	    if(assiend) {
		if(big != i) {
		    nextBig = i;
		    assiend = false;
		}
	    }else {
		if(nums[nextBig] < nums[i] && i != big)
		    nextBig = i;
	    }
	}
	return nextBig;
    }
    static int maxProductDifference(int[] nums) {
	int a, b, c, d;
	int[] temp = smallAndBig(nums);
	a = temp[1];
	c = temp[0];
	b = nextBig(nums, a);
	d = nextSmall(nums, c);
	return ((nums[a] * nums[b]) - (nums[c] * nums[d]));
    }
    public static void main(String[] args) {
	
	int[] a = { 5,6,2,7,4};
	System.out.println(maxProductDifference(a));
	
    }

}
