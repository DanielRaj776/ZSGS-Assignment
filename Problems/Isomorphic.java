package problem;

import java.util.HashMap;
import java.util.Map;

class Isomorphic {
    static boolean isIsomorphic (String s, String t) {
	if(s.length() != t.length())
	    return false;
	
	Map<Character, Character> charMap = new HashMap<>();
	Map<Character, Character> charMap1 = new HashMap<>();
	
	for(int i = 0; i < s.length(); i++) {
	    final char ch1 = s.charAt(i);
	    final char ch2 = t.charAt(i);
	    
	    if(charMap.containsKey(ch1) && charMap1.containsKey(ch2)) {
		if(ch1 != charMap1.get(ch2))
		    return false;
		
		if(charMap.get(ch1) != ch2)
		    return false;
	    }else if(charMap.containsKey(ch1) ^ charMap1.containsKey(ch2)){
		return false;
	    }else {
	    
		charMap.put(ch1, ch2);
		charMap1.put(ch2, ch1);
	    }
	}
	
	return true;
    }
    public static void main(String[] args) {
	String s = "e mk r";
	String t = "daniel";
	System.out.println(isIsomorphic(s, t));
    }

}
