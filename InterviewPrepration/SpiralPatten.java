package interviewpreparation;

import java.util.Scanner;

public class SpiralPatten {
    private void print (int[][] matrix, int n) {
	int elementSize = 0;
	int nSqr = n + n;
	while (nSqr != 0){
	   elementSize++;
	    nSqr /= 10;
	}
	elementSize++;
	for(int[] row : matrix) {
	    for(int x : row) {
		System.out.printf("%" + elementSize + "d", x);
	    }
	    System.out.println();
	}
    }
    private void spiralPattern (int n) {
	int[][] matrix = new int[n][n];
	int[][] diroctions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
	int numberOfCelles = n;
	int count = 0;
	boolean flag = false;
	int diroction = 0;
	for(int i = 0, row = 0, col = 0; i < n * n; i++) {
	    matrix[row][col] = i + 1;
	    row += diroctions[diroction][0];
	    col += diroctions[diroction][1];
	    count++;
	    if(count == numberOfCelles) {
		count = 0;
		row -= diroctions[diroction][0];
		col -= diroctions[diroction][1];
		if(diroction == 3)
		    diroction = 0 ;
		else
		    diroction++;
		row += diroctions[diroction][0];
		col += diroctions[diroction][1];
		flag = !flag;
		if(flag)
		    numberOfCelles--;
	    }
	}
	print(matrix, n);
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter n");
	int n = scanner.nextInt();
	spiralPattern(n);
	scanner.close();
    }
    public static void main(String[] args) {
	SpiralPatten ob = new SpiralPatten();
	ob.getInput();
    }

}
