package problem;

class LengthOfLastWord {
    static int lengthOfLastWord(String s) {
	if(s.length() == 0) {
	    return 0;
	}
	int wordLength = 0;
	for(int i = s.length()-1; i >= 0; i--) {
	    if((!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) && (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) && wordLength != 0) {
		break;
	    }else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
		wordLength++;
	    }
	}
	return wordLength;
    }
    public static void main(String[] args) {
	String s = "world is ending.";
	int i = lengthOfLastWord(s);
	System.out.println(i);
    }

}
