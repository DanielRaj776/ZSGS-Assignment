package problem;

class StringToInteger {
    static int myAtoi (String s) {
	if(s.length() < 1)
	        return 0;
	
    long num = 0;
    int len = -1;
    String numString = "";
    int sign = 0;
    int numEncountered = 0;
	
    for(int i = 0; i < s.length(); i++) {
        if((int)s.charAt(i) < '0' || s.charAt(i) > '9'){
        if((s.charAt(i) == ' ' || s.charAt(i) == '-' || s.charAt(i) == '+') && numEncountered == 0){
            if(s.charAt(i) == '-')
                sign = 1;
            continue;
        }
        break;
        }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            numString = numString + s.charAt(i);
            len++;
            numEncountered = 1;
        }
    }

    for(int i = 0; i < numString.length(); i++) {
        long temp = 1;
        for(int j = 0; j < len; j++) {
            temp *= 10;
        }
        len--;
        temp *= numString.charAt(i)-(int)'0';
        num += temp;
    }

    if(sign == 1)
        num *= -1;

    while(num < (Math.pow(2,31)*-1) || num > (Math.pow(2,31)-1)){
        if(sign == 1)
            return (int)(Math.pow(2,31)*-1);
        else
            return (int)(Math.pow(2, 31) -1);
    }

    return (int)num;
    }
    public static void main(String[] args) {
	
	String s = "-1234567766565";
	int n = myAtoi(s);
	System.out.println(n);
	
    }

}
