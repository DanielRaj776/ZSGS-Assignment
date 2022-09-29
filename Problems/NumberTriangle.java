package problem;

class NumberTriangle {
    public static void main(String[] args) {
	int input = 18;
	int temp = input;
	int diget = 2;
	
	for( ; ; ) {
	    if(temp < 10)
		break;
	    diget++;
	    temp  /= 10;
	}
	System.out.println(diget);
	int gap = diget-1;
	int fspace = ((input -1) * diget) + ((input-1) * gap) +1 ;
	
	for(int i = 1; i <= input; i++) {
	    for(int sp = fspace;sp >0; sp--) {
		for(int g = gap; g > 0; g--) {    
		    System.out.print(" ");
		}
	    }
	    for (int j = 1; j <= i; j++) {
		System.out.print(j + " ");	
	    }
	    System.out.println();
	    fspace -= 3;
	}
	
    }

}
