package problem;

class LargestLocalVaribalInMatrix {
    static int[][] largestLocal(int[][] grid){
	int len = grid.length-2;
	int largest;
	int[][] maxLocal = new int[len][len];
	for(int i = 0; i < len; i++) {
	    for(int j = 0; j < len; j++) {
		largest = 0;
		for(int k = i; k < i+3; k++) {
		    for(int l = j; l < j + 3; l++) {
			if(largest < grid[k][l])
			    largest = grid[k][l];
		    }
		}
		maxLocal[i][j] = largest;
	    }
	}
	return maxLocal;
    }
    public static void main(String[] args) {
	int[][] arr = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
	int[][] result = largestLocal(arr);
	for(int[] x : result) {
	    for(int y : x) {
		System.out.print(y + "	");
	    }
	    System.out.println();
	}
    }

}
