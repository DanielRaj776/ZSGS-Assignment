package Test;

class NestedIfDemo {
    static String[] greads (double[] mark) {
	//University Grading System in India
	String[] gread = new String[mark.length];
	for(int i = 0; i < mark.length; i++) {
	    if(mark[i] >= 0 && mark[i] <= 100) {		//Invalid values
		if(mark[i] >=  37) {					//Pass block
		    if(mark[i] < 47)
			gread[i] = "P";
		    else if(mark[i] < 57)
			gread[i] = "C";
		    else if(mark[i] < 67)
			gread[i] = "B";
		    else if(mark[i] < 77)
			gread[i] = "B+";
		    else if(mark[i] < 87)
			gread[i] = "A";
		    else if(mark[i] < 97)
			gread[i] = "A+";
		    else 
			gread[i] = "O";
		    
		}else {								//Fail block
		    gread[i] = "F";
		}
	    }else {
		gread[i] = "ab";
	    }
	}
	return gread;
    }
    public static void main(String[] args) {
	double[] mark = {90.5, 93, 45, 63, 20};
	for(String x : greads(mark))
	    System.out.print(x + "	");
	System.out.println();
	for(double x : mark)
	    System.out.print(x + "	");
    }

}
