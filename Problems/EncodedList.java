package problem;

class EncodedList {
    static int length (int[] nums) {
	int length = 0;
	for(int i = 0; i < nums.length; i += 2) {
	    length += nums[i];
	}
	return length;
    }
    static int[] decompressRLElist(int[] nums) {
	int len = length(nums);
	int[] nums2 = new int[len];
	int index = 0;
	for(int i = 0; i < nums.length; i += 2) {
	    for(int j = 0; j < nums[i]; j++) {
		nums2[index] = nums[i + 1];
		index++;
	    }
	}
	return nums2;
    }
    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	int[] arr2 = decompressRLElist(arr);
	for(int x : arr2) {
	    System.out.print(x + " ");
	}
    }

}
