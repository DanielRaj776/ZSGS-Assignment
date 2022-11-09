package interviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class FrequencySort {
    private int[] sort (int[] arr) {
	Map<Integer, Integer> hashMap = new HashMap<>();
	for(int x: arr) {
	    hashMap.put(x,hashMap.getOrDefault(x, 0) + 1);
	}
	Map<Integer, TreeSet<Integer>> treeMap = new TreeMap<>();
	for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
	    int key = entry.getValue();
	    int value = entry.getKey();
	    if(treeMap.containsKey(key)) {
		TreeSet<Integer> temp = treeMap.get(key);
		temp.add(value);
		treeMap.put(key, temp);
	    }else {
		TreeSet<Integer> temp = new TreeSet<>();
		temp.add(value);
		treeMap.put(key, temp);
	    }
	}
	int index = arr.length;
	for(Map.Entry<Integer, TreeSet<Integer>> entry : treeMap.entrySet()) {
	    int key = entry.getKey();
	    index -= entry.getValue().size() * key;
	    int tempindex = index;
	    for(Integer x : entry.getValue()) {
		for(int i = 0; i < entry.getKey(); i++) {
		    arr[tempindex++] = x;
		}
	    }
	}
	return arr;
    }
    private void getInput () {
	int[] arr = {4, 6, 8, 2, 5, 7, 9};
	System.out.println(Arrays.toString(sort(arr)));
	System.out.println("{2, 4, 5, 6, 7, 8, 9}");
    }
    public static void main(String[] args) {
	FrequencySort ob = new FrequencySort();
	ob.getInput();
    }

}
