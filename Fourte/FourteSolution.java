package fourte;

import java.util.Scanner;

class FourteSolution {
    private static char[] operators = {'+', '-', '*', '/'};
    private static int[] operatorsIndex = {0, 0, 0};
    private static int method = 0;
    private static double[][] operants;
    private static double target;
    
    static void setOperants (double[] op) {
	operants = new double[][] { {op[0], op[1], op[2], op[3]}, {op[0], op[1], op[3], op[2]}, {op[0], op[2], op[1], op[3]}, {op[0], op[2], op[3], op[1]}, {op[0], op[3], op[1], op[2]}, {op[0], op[3], op[2], op[1]},
							    {op[1], op[0], op[2], op[3]}, {op[1], op[0], op[3], op[2]}, {op[1], op[2], op[0], op[3]}, {op[1], op[2], op[3], op[0]}, {op[1], op[3], op[0], op[2]}, {op[1], op[3], op[2], op[0]},
							    {op[2], op[0], op[1], op[3]}, {op[2], op[0], op[3], op[1]}, {op[2], op[1], op[0], op[3]}, {op[2], op[1], op[3], op[0]}, {op[2], op[3], op[0], op[1]}, {op[2], op[3], op[1], op[0]},
							    {op[3], op[0], op[1], op[2]}, {op[3], op[0], op[2], op[1]}, {op[3], op[1], op[0], op[2]}, {op[3], op[1], op[2], op[0]}, {op[3], op[2], op[0], op[1]}, {op[3], op[2], op[1], op[0]}};
    }
    static int solution () {
	int index = 0;
	for(double[] op : operants) {
	    for(int i = 0; i < 64; i++) {
		method = 0;
		double result1 = operation(op[0], op[1], operatorsIndex[0]);
		double result2 = operation(op[2], op[3], operatorsIndex[2]);
		double finelResult = operation(result1, result2, operatorsIndex[1]);
		if(finelResult == target)
		    return index;
		method = 1;
		finelResult = operation(op[0], op[1], operatorsIndex[0]);
		finelResult = operation(finelResult, op[2], operatorsIndex[1]);
		finelResult = operation(finelResult, op[3], operatorsIndex[2]);
		if(finelResult == target)
		    return index;
		if(operatorsIndex[2] < 3) {
		    operatorsIndex[2] = operatorsIndex[2] + 1;
		}else {
		    operatorsIndex[2] = 0;
		    if(operatorsIndex[1] < 3) {
			operatorsIndex[1] = operatorsIndex[1] + 1;
		    }else {
			operatorsIndex[1] = 0;
			if(operatorsIndex[0] < 3) {
			    operatorsIndex[0] = operatorsIndex[0] + 1;
			}else {
			    operatorsIndex[0] = 0;
			}
		    }
		}
	    }
	    index++;
	}
	return -1;
    }
    static double operation(double val1, double val2, int index) {
	double result = 0;
	switch(operators[index]){
	case '+':
	    result = val1 + val2;
	    break;
	case '-' :
	    result = val1 - val2;
	    break;
	case '*':
	    result = val1 * val2;
	    break;
	case '/':
	    result = val1 / val2;
	}
	return result;
    }
    public static void main(String[] args) {
	double[] num = new double[4];
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Four Numbers");
	System.out.println("first number");
	num[0] = in.nextInt();
	System.out.println("second number");
	num[1] = in.nextInt();
	System.out.println("third number");
	num[2] = in.nextInt();
	System.out.println("fourth number");
	num[3] = in.nextInt();
	setOperants(num);
	System.out.println("Enter the Target value");
	target = in.nextDouble();
	in.close();
	int operantPosition = solution();
	if(operantPosition == -1) {
	    System.out.println("There is no solutions.");
	}else if(method == 0){
	    double[] temp = operants[operantPosition];
	    System.out.printf("(%.0f %c %.0f) %c (%.0f %c %.0f)\n", temp[0], operators[operatorsIndex[0]], temp[1], operators[operatorsIndex[1]], temp[2], operators[operatorsIndex[2]], temp[3]);
	}else if(method == 1) {
	    double[] temp = operants[operantPosition];
	    System.out.printf("((%.0f %c %.0f) %c %.0f) %c %.0f\n", temp[0], operators[operatorsIndex[0]], temp[1], operators[operatorsIndex[1]], temp[2], operators[operatorsIndex[2]], temp[3]);
	}
    }
}
