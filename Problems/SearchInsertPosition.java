package problem;

class SearchInsertPosition {
    static int searchInsert( int[] nums, int target) {
	int start = 0;
	int end = nums.length-1;
	int index = nums.length / 2;
	
	if(nums[nums.length-1] < target)
	    return nums.length;
	else if (nums[0] > target)
	    return 0;
	else if(nums[0] == target)
	    return 0;
	else if(nums[nums.length-1]== target)
	    return nums.length-1;
	
	do {
	    if (nums[index] > target) {
		end = index;
		index = (start + end) / 2;
	    } else if(nums[index] < target) {
		start = index;
		index = (start + end) / 2;
	    } else if(nums[index] == target) {
		return index;
	    }
	} while (end - start != 1);
	return end;
    }
    public static void main(String[] args) {
	int[] arr = { 1, 3, 6, 7, 9, 11, 32, 76, 98, 100, 102, 107, 127, 132, 400, 405, 408, 500, 550, 757, 758, 759, 760, 761, 762};
	int target = 90;
	int len = arr.length;
	System.out.println(len);
	int result = searchInsert(arr, target);
	System.out.println(result);
    }

}
