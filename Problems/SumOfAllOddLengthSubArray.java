package problem;

class SumOfAllOddLengthSubArray {
    static int sumOddLengthSubarrays(int[] arr) {
	int len = arr.length;
	int sum = 0;
	for(int i = 1; i <= len; i += 2) {
	    for(int j = 0; j + i <= len; j++) {
		for(int k = j; k < j + i; k++) {
		    sum += arr[k];
		}
	    }
	}
	return sum;
    }
    public static void main(String[] args) {
	int[] arr = {10,11,12};
	System.out.println(sumOddLengthSubarrays(arr));
    }

}
