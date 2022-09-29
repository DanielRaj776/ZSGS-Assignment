package problem;

import java.util.ArrayList;
import java.util.List;

class SetMatrixZero {
    static List<Integer[]> findZeros(int[][] matrix){
	List<Integer[]> index = new ArrayList<>();
	for(int i = 0; i < matrix.length; i++) {
	    for(int j = 0; j < matrix[i].length; j++) {
		if(matrix[i][j] == 0)
		    index.add(new Integer[] {i, j});
	    }
	}
	return index;
    }
    static void setRowZero(int[][] matrix, int row) {
	for(int i = 0; i < matrix[row].length; i++) {
	    matrix[row][i] = 0;
	}
    }
    static void setColumnZero (int[][] matrix, int column) {
	for(int i = 0; i < matrix.length; i++) {
	    matrix[i][column] = 0;
	}
    }
    static void setZeros (int[][] matrix) {
	List<Integer[]> index = findZeros(matrix);
	for(int i = 0; i < index.size(); i++) {
	    Integer[] temp = index.get(i);
	    setRowZero(matrix, temp[0]);
	    setColumnZero(matrix, temp[1]);
	}
    }
    public static void main(String[] args) {
	int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
	setZeros(matrix);
	for(int x[]: matrix) {
	    for(int y: x) {
		System.out.print("   " + y);
	    }
	    System.out.println();
	}
    }

}
