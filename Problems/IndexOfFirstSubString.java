package problem;

class IndexOfFirstSubString {
    static int strStr(String haystack, String needle) {
	if(needle.length() == 0)
	    return 0;
	
	if(needle.length() > haystack.length())
	    return -1;
	
	int result = -1;
	int len = needle.length();
	for(int i = 0; i < haystack.length(); i++) {
	    if(i + len > haystack.length())
		break;
	    if(needle.charAt(0) == haystack.charAt(i) && needle.equals(haystack.substring(i, len + i))) {
		    result = i;
		    break;
	    }
	}
	
	return result;
    }
    public static void main(String[] args) {
	String s = "daniel raj";
	String s1 = "e1";
	int index=strStr(s, s1);
	if(index == -1) {
	    System.out.println("Empty needle.");
	}else {
        	for(int i = index; i < s.length(); i++) {
        	    System.out.print(s.charAt(i));
        	}
	}
    }

}
