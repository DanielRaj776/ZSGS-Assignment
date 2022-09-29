package problem;

class ZigzagConversion {
    static void blanckSpace (int num) {
	for(int i = 0; i < num; i++)
	    System.out.print(" ");
    }
   static String convert(String s, int numRows) {
	int firstIndexIncrement = ((numRows - 1) * 2) < 1 ? 1 : (numRows - 1) * 2;
	int secondIndexIncrement = 0;
	//int firstBlanckSpace = (numRows - 2) < 0 ? 0 : numRows - 2;
 	//int secondBlanckSpace = 0;
	String result = ""; 
	for(int i = 1; i <= numRows; i++) {
	    if(i == 1 || i == numRows) {
		firstIndexIncrement = (i == 1) ? firstIndexIncrement : secondIndexIncrement;
		//firstBlanckSpace = (i == 1) ? firstBlanckSpace : secondBlanckSpace;
		for(int j = i - 1; j < s.length(); j = j + firstIndexIncrement) {
		    result += s.charAt(j);
		    //System.out.print(s.charAt(j));
		   // blanckSpace(firstBlanckSpace);
		}
		//firstBlanckSpace--;
	    }else {
		for(int j = i - 1, numOfLetterPriented = 0; j <s.length(); j += (numOfLetterPriented % 2 == 1) ? firstIndexIncrement : secondIndexIncrement) {
		    result += s.charAt(j);
		   // System.out.print(s.charAt(j));
		    //blanckSpace((numOfLetterPriented % 2 == 0) ? firstBlanckSpace : secondBlanckSpace);
		    numOfLetterPriented++;
		}
		//firstBlanckSpace--;
		//secondBlanckSpace++;
	    }
	    firstIndexIncrement -= 2;
	    secondIndexIncrement += 2;
	   // System.out.println();
	}
	return result;
    }
    public static void main(String[] args) {
	String s = "pinapple";
	System.out.println(convert(s, 3));
    }

}
