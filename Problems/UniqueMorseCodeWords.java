package problem;

import java.util.HashSet;
import java.util.Set;

class UniqueMorseCodeWords {
    static int uniqueMorseRepresentations(String[] words) {
	String[] morseCodeChar = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	Set<String> unique = new HashSet<>();
	for(int i = 0; i < words.length; i++) {
	    String temp = "";
	    for(int j = 0; j < words[i].length(); j++) {
		temp += morseCodeChar[words[i].charAt(j) - 'a'];
	    }
	    unique.add(temp);
	}
	return unique.size();
    }
    public static void main(String[] args) {
	String[] s = {"gin","zen","gig","msg"};
	System.out.println(uniqueMorseRepresentations(s));
    }

}
