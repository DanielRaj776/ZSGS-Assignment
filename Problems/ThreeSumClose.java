package problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ThreeSumClose {
    static int threeSumClosest(int[] nums, int target) {
	Map< Integer, Integer> map = new HashMap<>();
	Set<Integer> set = new HashSet<>();
	for(int x: nums)
 	    set.add(x);
	for(int x : nums) {
	    if(map.containsKey(x))
		map.put(x, map.get(x) + 1);
	    else
		map.put(x, 1);
	}
	Iterator<Integer> it = set.iterator();
	int near = 0;
	boolean nearNotSet = true;
	int sum = 0;
	while(it.hasNext()) {
	    Integer first = it.next();
	    Iterator<Integer> it1 = set.iterator();
	    while(it1.hasNext()) {
		Integer second = it1.next();
		if(first.equals(second) && map.get(first) == 1)
		    continue;
		Iterator<Integer> it2 = set.iterator();
		while(it2.hasNext()) {
		    Integer third = it2.next();
		    if(third.equals(first) && third.equals(second) && map.get(third) == 2) {
			continue;
		    }else if(third.equals(second) && map.get(third) == 1) {
			continue;
		    }else if(third.equals(first) && map.get(third) == 1) {
			continue;
		    }
		    if(nearNotSet) {
			near = Math.abs(target - (first + second + third));
			sum = first + second + third;
			nearNotSet = false;
		    }else if(near > Math.abs(target - (first + second + third))){
			sum = first + second + third;
			near = Math.abs(target - (first + second + third));
		    }
		}
	    }
	}
	return sum;
    }
    public static void main(String[] args) {
	int[] arr = {4,0,5,-5,3,3,0,-4,-5};
	System.out.println(threeSumClosest(arr, -2));
    }

}
