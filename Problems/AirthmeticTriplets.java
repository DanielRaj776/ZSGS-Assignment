package problem;

class AirthmeticTriplets {

    static int arithmeticTriplets(int[] nums, int diff) {
	int len = nums.length;
	int count = 0;
	for(int i = 0; i < len - 2; i++) {
	    boolean firstChack = false, secondChack = false;
	    for(int j = i + 1; j < len - 1; j++) {
		if(nums[j] - nums[i] == diff)
		    firstChack= true;
		if(firstChack) {
        		for(int k = j + 1; k < len; k++) {
        		    if(nums[k] - nums[j] == diff)
        			secondChack = true;
        		    if(secondChack) {
        			count++;
        			break;
        		    }
        		}
		}
		if(firstChack)
		    break;
	    }
	}
	return count;
    }
    
    public static void main(String[] args) {
	
	int[] arr = {0,1,4,6,7,10};
	int result = arithmeticTriplets(arr, 3);
	System.out.println(result);
    }

}
