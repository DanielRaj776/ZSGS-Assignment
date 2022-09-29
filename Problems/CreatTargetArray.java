package problem;

import java.util.ArrayList;
import java.util.List;

class CreatTargetArray {
    static int[] createTargetArray(int[] nums, int[] index) {
	int len = nums.length;
	List<Integer> list = new ArrayList<>(len);
	for(int i = 0; i < len; i++) {
	    list.add(index[i], nums[i]);
	}
	int[] target = new int[len];
	for(int i = 0; i < list.size(); i++) {
	    target[i] = list.get(i);
	}
	return target;
    }
    public static void main(String[] args) {
	int[] nums = {0, 1, 2, 3, 4};
	int[] index = {0,1 , 2, 2, 1};
	int[] target = createTargetArray(nums, index);
	for(int x: target) {
	    System.out.print(x + " ");
	}
    }

}
