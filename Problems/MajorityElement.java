package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MajorityElement {
    static List<Integer> majorityElement(int[] nums){
	List<Integer> list = new ArrayList<>();
	Map<Integer, Integer> map = new HashMap<>();
	for(int i = 0; i < nums.length; i++) {
	    if(map.containsKey(nums[i])) {
		map.put(nums[i], map.get(nums[i]) + 1);
	    }else {
		map.put(nums[i], 1);
	    }
	}
	for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
	    if(entry.getValue() > nums.length / 3 )
		list.add(entry.getKey());
	}
	return list;
    }
    public static void main(String[] args) {
	int[] in = {3, 3, 3, 3, 4, 4, 4, 1, 1, 2};
	List<Integer> list = majorityElement(in);
	for(Integer i : list) {
	    System.out.println(i);
	}
    }

}
