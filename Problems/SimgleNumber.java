package problem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SimgleNumber {
    
    int singleNumber(int[] nums) {
	Set<Integer>  set = new HashSet<>();
	for(int x : nums) {
	    if(set.contains(x)) {
		set.remove(x);
	    }else {
		set.add(x);
	    }
	}
	Iterator<Integer> it = set.iterator();
	return it.next();
    }
    
    public static void main(String[] args) {
	
	
	
    }

}
