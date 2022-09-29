package problem;

class CountingWordsWithTheGivenPrifix {
    static int prefixCount(String[] words, String pref) {
	int count = 0;
	for(String s : words) {
	    if(s.length() < pref.length())
		continue;
	    if(pref.equals(s.substring(0, pref.length())))
		count++;
	}
	return count;
    }
    public static void main(String[] args) {
	
    }

}
