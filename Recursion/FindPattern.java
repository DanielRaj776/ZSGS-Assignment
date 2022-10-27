package Recirsion;

import java.util.LinkedList;
import java.util.List;

public class FindPattern {
    
    public List<Integer> findPattern (String txt, String pat, int index) {
	List<Integer> result = new LinkedList<>();
	boolean flag = false;
	int len = pat.length();
	boolean[] arr = new boolean[len];
	if(index + len == txt.length())
	    flag = true;
	for(int i = index; i < index + len; i++) {
	    char ch = txt.charAt(i);
	    for(int j = 0; j < len; j++) {
		if(arr[j])
		    continue;
		if(ch == pat.charAt(j)) {
		    arr[j] = true;
		    break;
		}
	    }
	}
	boolean temp = true;
	for(boolean x : arr) {
	    temp &= x;
	}
	if(temp)
	    result.add(index);
	if(flag)
	    return result;
	result.addAll(findPattern(txt, pat, index + 1));
	return result;
    }
    
    public static void main(String[] args) {
	String txt = "AAABABAA";
	String pat = "AABA";
	FindPattern ob = new FindPattern();
	List<Integer> result = ob.findPattern(txt, pat, 0);
	for(int x : result) {
	    System.out.println("Found at index : " + x);
	}
    }

}
