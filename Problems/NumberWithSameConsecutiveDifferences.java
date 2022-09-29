package problem;

class NumberWithSameConsecutiveDifferences {
    static int[] numsSameConsecDiff(int n, int k) {
	
	if(n < 2)
	    return new int[] {};
	else if(k / 10 != 0)
	    return new int[] {};
	
	int temp, preverce;
	
	if(k == 0) {
	    int[] nums = new int[9];
	    for(int i = 0; i < nums.length; i++) {
		temp = 0;
		for(int j = 0; j < n; j++) {
		    temp *= 10;
		    temp += i+1;
		}
		nums[i] = temp;
	    }
	    return nums;
	}
	int length = ((10 - k) * 2) - 1;
	int[] nums = new int[length];
	for(int i = 0; i < length;) {
	    for(int first = k, second = 0; first < 10; first++, second++) {
		temp = 0;
		preverce = first;
		if(second == 0) {
		    for(int j = 0; j < n; j++) {
			temp *= 10;
			temp += preverce;
			preverce = preverce == first ? second : first;
		    }
		    nums[i++] = temp; 
		}else {
		    for(int j = 0; j < n; j++) {
			temp *= 10;
			temp += preverce;
			preverce = preverce == first ? second : first;
		    }
		    nums[i++] = temp;
		    temp = 0;
		    preverce = second;
		    for(int j = 0; j < n; j++) {
			temp *= 10;
			temp += preverce;
			preverce = preverce == first ? second : first;
		    }
		    nums[i++] = temp;
		}
	    }
	}
	return nums;
    }
    public static void main(String[] args) {
	
    }

}
