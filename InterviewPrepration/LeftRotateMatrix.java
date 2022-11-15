package interviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateMatrix {
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the length size of matrix");
	int size = scanner.nextInt();
	int[][] matrix = new int[size][size];
	for(int i = 0; i < size; i++) {
	    for(int j = 0; j < size; j++) {
		System.out.printf("Enter %d row %d element\n", (i + 1), (j + 1));
		matrix[i][j] = scanner.nextInt();
	    }
	}
	System.out.println(Arrays.deepToString(reftRotate(matrix)));
	scanner.close();
    }
    private int[][] reftRotate (int[][] matrix){
	int temp = 0;
	for(int i = 0; i < matrix.length; i++) {
	    for(int j = i; j < matrix.length; j++) {
		if(i == j)
		    continue;
		temp = matrix[i][j];
		matrix[i][j] = matrix[j][i];
		matrix[j][i] = temp;
	    }
	}
	for(int i = 0, j = matrix.length - 1; i < j; i++, j--) {
	    int[] row = matrix[i];
	    matrix[i] = matrix[j];
	    matrix[j] = row;
	}
	return matrix;
    }
    public static void main(String[] args) {
	LeftRotateMatrix ob = new LeftRotateMatrix();
	ob.getInput();
    }
}
