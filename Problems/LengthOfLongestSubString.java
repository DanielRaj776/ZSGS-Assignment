package problem;

class LengthOfLongestSubString {
    static int lenghtOfLongestSubString(String s) {
	int start;
	int end;
	int length = 0;
	
	if(s.length() == 1)
	    return 1;
	
	for(start= 0,end = 1; end <= s.length(); end ++) {
	    for(int index = start; index < end; index++) {
		if(end == s.length()) {
		    if(end - start> length)
			length = end - start ;
		}else if(s.charAt(index) == s.charAt(end)) {
		    if(end - start > length) {
			length = end - start;
		    }
		    start = index + 1;
		}
	    }
	}
	
	return length;
    }
    public static void main(String[] args) {
	
	String s = "a";
	int result = lenghtOfLongestSubString(s);
	
	System.out.println(result);
	
    }

}
