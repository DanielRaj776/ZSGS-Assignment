package problem;

class ReverseWords {
    static String reverseWords(String s) {
        String reversedSentence = "";
    	s = s.trim();
    	for(int i = s.length() - 1, j = s.length() - 1; i >= 0; ) {
    	    if(s.charAt(i) == ' ' && i == j) {
    		i--;
    		j--;
    	    }else if(i == 0 || s.charAt(i - 1) == ' '){
    		reversedSentence += s.substring(i, j + 1) + " ";
    		i--;
    		j = i;
    	    }else {
    		i--;
    	    }
    	}
    	reversedSentence = reversedSentence.trim();
    	return reversedSentence;
    }
    public static void main(String[] args) {
    	String s = "i love      java           ";
    	System.out.println(reverseWords(s));
    }
}
