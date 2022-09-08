package ArrayProblems;

import java.util.Arrays;

class MatrixMultiplication {
    static int multiplyElements (int[] arr1, int[] arr2) {
	int result = 0;
	for(int i = 0; i < arr1.length; i++) {
	    result += arr1[i] * arr2[i];
	}
	return result;
    }
    static int[][] multiply (int[][] matrix1, int[][] matrix2) {
	if(matrix1[0].length == matrix2.length || matrix1.length == matrix2[0].length) {
	    if(matrix1.length == matrix2[0].length) {
		int[][] temp = matrix1;
		matrix1 = matrix2;
		matrix2 = temp;
	    }
	}else{
	    return new int[][] {};
	}
	int[][] product = new int[matrix1.length][matrix2[0].length];
	for(int row = 0; row < product.length; row++) {
	    for(int column = 0; column < product[0].length; column++) {
		int[] temp1 = new int[matrix2.length];
		int[] temp2 = new int[matrix2.length];
		for(int i = 0; i < matrix2.length; i++) {
		    temp1[i] = matrix1[row][i];
		    temp2[i] = matrix2[i][column];
		}
		product[row][column] = multiplyElements(temp1, temp2);
	    }
	}
	return product;
    }
    public static void main(String[] args) {
	int[][] matrix1 = {{1, 2}, {3, 4}};
	int[][] matrix2 = {{5, 6, 7}, {8, 9, 10}};
	System.out.println(Arrays.deepToString(multiply(matrix1, matrix2)));
    }

}
