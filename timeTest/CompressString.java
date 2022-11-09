package interviewprograms;

public class CompressString {
    private String compress (String s) {
	if(s.length() < 1)
	    return s;
	String result = "";
	int count = 1;
	for(int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if(i == s.length() - 1 || ch != s.charAt(i + 1)) {
		if(count == 1) {
		    result += "" + ch;
		}else {
		    result += "" + ch + count;
		    count = 1;
		}
	    }else {
		count++;
	    }
	}
	return result;
    }
    public static void main(String[] args) {
	CompressString ob = new CompressString();
	System.out.println(ob.compress("aaabbcdd"));
    }

}
