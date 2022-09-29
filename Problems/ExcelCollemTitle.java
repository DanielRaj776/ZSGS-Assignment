package problem;

class ExcelCollemTitle {
    static String numTo26B (int columnNumber) {
	if(columnNumber == 0)
	    return "";
	
	int reminder;
	String reTitle = "";
	String title = "";
	do {
	    char A = 'A';
	    if(columnNumber % 26 == 0) {
		reminder = 26;
	    	columnNumber = (columnNumber / 26) -1;
	    }else {
		reminder = columnNumber % 26;
		columnNumber = columnNumber / 26;
	    }
	    
	    A += (reminder - 1);
	    reTitle += A;
	}while(columnNumber > 0);
	
	for(int i = reTitle.length()-1; i > -1; i--) {
	    title += reTitle.charAt(i);
	}
	    return title;
    }
    public static void main(String[] args) {
	    System.out.print(numTo26B(716) + " ");
    }

}
