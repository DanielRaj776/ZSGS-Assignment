package problem;

class ValidParentheses {
    static boolean isValid (String s) {
	if(s.length()%2 != 0)
	    return false;
	else if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
	    return false;
	else if(s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '[' || s.charAt(s.length()-1) == '{'){
	    return false;
	}
	
	char[] stack = new char[s.length()/2];
	int tos = -1;
	boolean test = true;
	
	for(int i = 0; i < s.length(); i++) {
	    if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
		tos++;
		if(tos >= stack.length)
		    return false;
		stack[tos] = s.charAt(i);
	    }else {
		if(stack[tos] == '(' && s.charAt(i) == ')') {
		    tos--;
		}else if(stack[tos] == '[' && s.charAt(i) == ']') {
		    tos--;
		}else if(stack[tos] == '{' && s.charAt(i) == '}') {
		    tos--;
		}else {
		    test = false;
		    break;
		}    
	    }
	}
	
	return test;
    }
    public static void main(String[] args) {
	String s1 = "(){}[](";
	String s2 = "{[]}";
	String s3 = "[";
	System.out.println(isValid(s1));
	System.out.println(isValid(s2));
	System.out.println(isValid(s3));
	
    }

}
