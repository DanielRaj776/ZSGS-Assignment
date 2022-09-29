package problem;

import java.util.HashMap;
import java.util.Map;

class Anagram {
    
    static boolean isAnagram (String s, String t) {
	if(s.length() != t.length())
	    return false;
	
	Map<Character, Integer> hashmap = new HashMap<>();
	
	for(int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if(hashmap.containsKey(ch)){
		int val = hashmap.get(ch);
		hashmap.put(ch, val + 1);
	    }else {
		hashmap.put(ch, 1);
	    }
	}
	
	for(int i = 0; i < t.length(); i++) {
	    char ch = t.charAt(i);
	    if(!hashmap.containsKey(ch))
		return false;
	    else {
		int val = hashmap.get(ch) - 1;
		if(val == 0)
		    hashmap.remove(ch);
		else
		    hashmap.put(ch, val);
	    }
	}
	return true;
    }
    public static void main(String[] args) {
	String s = "daniel";
	String t = "aielde";
	boolean result = isAnagram(s, t);
	System.out.println(result);
	
    }

}
