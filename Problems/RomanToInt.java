package problem;

class RomanToInt {
    static int toInt (String s) {
	int length = s.length();
	int num = 0;
	if(length == 0) {
	    return num;
	}
	
	for(int i = 0; i < length; i++) {
	    
	    if(i == length - 1) {
		if(s.charAt(i) == 'M')
		    num += 1000;
		else if(s.charAt(i) == 'D')
		    num += 500;
		else if(s.charAt(i) == 'C')
		    num += 100;
		else if(s.charAt(i) == 'L')
		    num += 50;
		else if(s.charAt(i) == 'X')
		    num += 10;
		else if(s.charAt(i) == 'V')
		    num += 5;
		else if(s.charAt(i) == 'I')
		    num += 1;
	    }else if(s.charAt(i) == 'M') {
		num += 1000;
	    }else if(s.charAt(i) == 'D') {
		num += 500;
	    }else if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
		num += 900;
		i++;
	    }else if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
		num += 400;
		i++;
	    }else if(s.charAt(i) == 'C') {
		num += 100;
	    }else if(s.charAt(i) == 'L') {
		num += 50;
	    }else if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
		num += 90;
		i++;
	    }else if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
		num += 40;
		i++;
	    }else if(s.charAt(i) == 'X') {
		num += 10;
	    }else if(s.charAt(i) == 'V') {
		num += 5;
	    }else if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
		num += 9;
		i++;
	    }else if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
		num += 4;
		i++;
	    }else if(s.charAt(i) == 'I') {
		num += 1;
	    }
	}
	
	return num;
    }
    public static void main(String[] args) {
	String s = "CD";
	int num = toInt(s);
	
	System.out.println("number : " + num);
    }

}
