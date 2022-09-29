package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ThreeSum {
    static int[] sort (int one, int two, int three) {
	    int[] arr = new int[3];
	    if(one <= two) {
		if(one <= three) {
		    arr[0] = one;
		    if(two <= three) {
			arr[1] = two;
			arr[2] = three;
		    }else {
			arr[1] = three;
			arr[2] = two;
		    }
		}else {
		    arr[0] = three;
		    arr[1] = one;
		    arr[2] = two;
		}
	    }else {
		if(two <= three) {
		    arr[0] = two;
		    if(one <= three) {
			arr[1] = one;
			arr[2] = three;
		    }else {
			arr[1] = three;
			arr[2] = one;
		    }
		}else {
		    arr[0] = three;
		    arr[1] = two;
		    arr[2] = one;
		}
	    }
	    return arr;
	}
    static List<List<Integer>> threeSum(int[] nums){
	List<List<Integer>> listOfThreeSum = new ArrayList<List<Integer>>();
        int first, second, third;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])) {
        	hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }else {
        	hashMap.put(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            first = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if(hashMap.containsKey(0 - (nums[i] + nums[j]))) {
                    third = 0 - (nums[i] + nums[j]);
                    int count = hashMap.get(third);
                    if(third == first && third == second && count == 2) {
                	continue;
                    }else if(third == first && count == 1) {
                	continue;
                    }else if(third == second && count == 1) {
                	continue;
                    }
                    int[] arr = sort(first, second, third);
                    List<Integer> temp = new ArrayList<>(Arrays.asList(arr[0], arr[1], arr[2]));
                    if(!listOfThreeSum.contains(temp))
                                listOfThreeSum.add(temp);
                }
            }
        }
        return listOfThreeSum;
    }
    
    public static void main(String[] args) {
	List<List<Integer>> result = threeSum(new int[] {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
	System.out.println(result);
    }

}
