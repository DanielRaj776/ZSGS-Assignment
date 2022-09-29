package problem;

class ExcelSeetCollemNumber {
    static int titleToNumber (String columnTitle) {
	int position = 0;
	int excelNum = 0;
	
	for(int i = columnTitle.length()-1; i > -1; i--) {
	    char  ch = columnTitle.charAt(i);
	    int num = (ch - 'A') + 1;
	    excelNum += num * Math.pow(26,position);
	    position++;
	}
	
	return excelNum;
    }
    public static void main(String[] args) {
	
	int i = titleToNumber("AAAA");
	System.out.println(i);
	
    }

}
