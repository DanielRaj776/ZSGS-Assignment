package problem;

class LongestPolindrome {
    static String longestPolindrome(String s) {
	String result = "";
	int length = 0;
	
	if(s.length() <= 1)
	    return s;
	
	for(int i = 0; i< s.length()-1; i++) {
	    for(int j = i + 1; j < s.length(); j++) {
		if(s.charAt(i) == s.charAt(j)) {
		    String sub = s.substring(i, j + 1);
		    boolean test = true;
		    for(int a = 0, b = sub.length()-1; a < sub.length()/2; a++, b--){
			if(sub.charAt(a) != sub.charAt(b)) {
			    test = false;
			}
		    }
		    
		    if(test) {
			if(length < sub.length()) {
			    length = sub.length();
			    result = sub;
			}
		    }
		}
	    }
	}
	
	if(result.length() == 0)
	    result = result + s.charAt(0);
	return result;
    }
    public static void main(String[] args) {
	
	String s = "aad";
	System.out.println(longestPolindrome(s));
	
    }

}
