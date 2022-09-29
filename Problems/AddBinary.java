package problem;

class AddBinary {
    static String addBinary(String a, String b) {
	if(a.length() < 1)
	    return b;
	else if(b.length() < 1)
	    return a;
	
	int chary = 0;
	String revarseSum = "";
	String sum = "";
	boolean control = true;
	for(int i = a.length()-1, j = b.length()-1; control;) {
	    if(i < 0) {
		if(b.charAt(j) == '0') {
		    if(chary == 0)
			revarseSum += '0';
		    else {
			revarseSum += '1';
			chary = 0;
		    }
		}else {
		    if(chary == 0)
			revarseSum += '1';
		    else
			revarseSum += '0';
		}
		j--;
	    }else if(j < 0) {
		if(a.charAt(i) == '0') {
		    if(chary == 0)
			revarseSum += '0';
		    else {
			revarseSum += '1';
		    	chary = 0;
		    }
		}else {
		    if(chary == 0)
			revarseSum += '1';
		    else
			revarseSum += '0';
		}
		i--;
	    }else if(a.charAt(i) == '0' && b.charAt(j) == '0') {
        	if(chary == 1) {
        	    revarseSum += '1';
        	    chary = 0;
        	}
        	else
        	    revarseSum += '0';	
        	i--;j--;
	    }else if((a.charAt(i) == '1' && b.charAt(j) == '0') || (a.charAt(i) == '0' && b.charAt(j)=='1')) {
        	if(chary == 1) {
       		    revarseSum += '0';
       		}else {
       		    revarseSum += '1';
       		}
       		i--;j--;
       	    }else if(a.charAt(i) == '1' && b.charAt(j) == '1') {
       		if(chary == 1)
       		    revarseSum += '1';
        	else {
        	    revarseSum += '0';
       		    chary = 1;
       		}
       		i--;j--;
       	    }
	    
	    if(i < 0 && j < 0 && chary == 1) {
		revarseSum += '1';
		chary = 0;
	    }
	    if(i < 0 && j < 0 && chary == 0)
		control = false;
	}
	for(int i = revarseSum.length()-1;i > -1; i--) {
	    sum = sum + revarseSum.charAt(i);
	}
	return sum;
    }
    public static void main(String[] args) {
	String[] s1 = {"0" , "1", "00","01","10","11", "000", "001", "010", "011", "100", "101", "110", "111"};
	String[] s2 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011","1100"};
	String s3;
	for(String x: s1) {
	    for(String y : s2) {
		s3 = addBinary(x, y);
		System.out.print(s3 + " / ");
	    }
	    System.out.println();
	}
	/*String s1 = "1";
	String s2 = "01";
	String s3 = addBinary(s1, s2);
	System.out.println(s3);*/
    }

}
