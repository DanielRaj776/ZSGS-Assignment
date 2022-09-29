package problem;

class ValidPalindrome {
    static String removeString(String s) {
	String temp = "";
	for(int i = 0; i < s.length(); i++) {
	    if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
		temp += s.charAt(i);
	    }
	}
	return temp;
    }
   static boolean isPalindrome(String s) {
       boolean test = true;
	String temp = removeString(s);
	temp = temp.toLowerCase();
	
	for(int i = 0, j = temp.length()-1; i < temp.length()/2; i++, j--) {
	    if(temp.charAt(i) != temp.charAt(j)) {
		test = false;
		break;
	    }
	}
	
	return test;
    }
    public static void main(String[] args) {
	boolean b = isPalindrome("A man, a plan, a canal: Panama");
	System.out.println(b);
    }

}
