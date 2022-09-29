package problem;

class PrefixString {
    
    static String commenPrefixString(String[] strs) {
	if(strs.length == 0)
	    return "";
	
	String first = strs[0];
	int index = 0;
	
	while(true) {
	    for(String x: strs) {
		if(index >= first.length() || index >=  x.length() || first.charAt(index) != x.charAt(index)) {
		    return first.substring(0, index);
		}
	    }
	    index++;
	}
    }
    
    public static void main(String[] args) {
	String[] s = {"Love", "Lost", "Long"};
	String re= commenPrefixString(s);
	System.out.println(re);
    }

}
