package problem;

class IntToRoman {
    
    static String toRoman(int num) {
	final char F1000 = 'M';
	final char F500 = 'D';
	final char F100 = 'C';
	final char F50 = 'L';
	final char F10 = 'X';
	final char F5 = 'V';
	final char F1 = 'I';
	String roman = "";
	
	if(num  < 1 || num > 3999	) {
	    return "In valid number.";
	}
	
	while(true) {
	    if(num < 1) {
		return roman;
	    }else if(num >= 1000) {
		roman = roman + F1000;
		num -= 1000;
	    }else if(num >= 900){
		roman = roman + F100 + F1000;
		num -= 900;
	    }else if(num >= 500) {
		roman = roman + F500;
		num -= 500;
	    }else if(num >= 400) {
		roman = roman + F100 + F500;
		num -= 400;
	    }else if(num >= 100) {
		roman = roman + F100;
		num -= 100;
	    }else if(num >= 90 ) {
		roman = roman + F10 + F100;
		num -= 90;
	    }else if(num >= 50) {
		roman = roman + F50;
		num -= 50;
	    }else if(num >= 40) {
		roman = roman + F10 + F50;
		num -= 40;
	    }else if(num >= 10) {
		roman = roman + F10;
		num -= 10;
	    }else if(num == 9) {
		roman = roman + F1 + F10;
		num -= 9;
	    }else if(num >= 5) {
		roman = roman + F5;
		num -= 5;
	    }else if(num == 4	) {
		roman = roman + F1 + F5;
		num -= 4;
	    }else if(num >= 1) {
		roman = roman + F1;
		num -= 1;
	    }
	}
    }
    
    public static void main(String[] args) {
	int num = 43;
	String result = toRoman(num);
	System.out.println(result);
    }

}
