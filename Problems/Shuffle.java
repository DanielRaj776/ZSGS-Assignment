package problem;

class Shuffle {
    static  int[] shuffle (int[] nums, int n) {
	int len = nums.length;
	int[] result = new int[len];
	for(int i = 0, j = n, k = 0; i < n; i++, j++) {
	    result[k++] = nums[i];
	    result[k++] = nums[j];
	}
	return result;
    }
    public static void main(String[] args) {
	int[] arr = {2, 5, 1, 3, 4, 7};
	int[] arr1 = shuffle(arr, 3);
	for(int x : arr1)
	    System.out.print(x);
    }

}
