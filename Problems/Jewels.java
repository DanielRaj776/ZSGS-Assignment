package problem;

class Jewels {
    static int numJewelsInStone(String jewels, String stones) {
	if(jewels.length() == 0 || stones.length() == 0)
	    return 0;
	
	char[] jew = new char[jewels.length()];
	int count = 0;
	for(int i =0; i < jewels.length(); i++) {
	    jew[i] = jewels.charAt(i); 
	}
	for(int i = 0; i < jew.length;i++) {
	    for(int j = 0; j < stones.length(); j++) {
		if(jew[i] == stones.charAt(j))
		    count++;
	    }
	}
	return count;
    }
    public static void main(String[] args) {
	String stone = "aAAabbbBb";
	String jewel = "aA";
	System.out.println(numJewelsInStone(jewel, stone));
    }

}
