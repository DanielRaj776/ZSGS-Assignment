package problem;

class RemoveElement {
    static int removeElement(int[] nums, int val) {
	int i = 0;
	int temp;
	for(int j = 0; j < nums.length;) {
	    if(nums[i] == val && nums[j] == val) {
		j++;
	    }else  if(i == j){
		j++;
		i++;
	    }else if(nums[i] != val) {
		i++;
	    }else if(nums[i] == val && nums[j] != val) {
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
		i++;
	    }
	}
	return i;
    }
    public static void main(String[] args) {
	int[] arr = {2, 2, 3, 1, 4, 5, 7, 2, 4, 6, 9, 10, 2, 3};
	int num = 2;
	int result = removeElement(arr, num);
	
	for(int i =0; i < result ; i ++) {
	    System.out.print(" " + arr[i]);
	}
	System.out.println();
	for(int x: arr) {
	    System.out.print(" " + x);
	}
    }

}
