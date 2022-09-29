package problem;

class MaxNumOfWordsInSentens {
    static int mostWordsFound(String[] sentences) {
	if(sentences.length == 0)
	    return 0;
	int len , maxlen = 0;
	for(int i = 0; i < sentences.length; i++) {
	    len = 1;
        	for(int j = 0; j < sentences[i].length(); j++) {
        	    if(sentences[i].charAt(j) == ' ')
        		len++;
        	}
	if(len > maxlen)
	    maxlen = len;
	}
	return maxlen;
    }
    public static void main(String[] args) {
	String[] s = {"one up on a time", "world is ending", "this is great thank you"};
	int max = mostWordsFound(s);
	System.out.println(max);
    }

}
