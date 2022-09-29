package problem;

class OddCells {
    static void  incrimentRows(int[][] arr, int index) {
	for(int i = 0; i < arr[0].length; i++) {
	    arr[index][i] += 1;
	}
    }
    static void incrimentColmn (int[][] arr, int index) {
	for(int i = 0; i < arr.length; i++) {
	    arr[i][index] += 1;
	}
    }
    static int oddCells(int m, int n, int[][] indices) {
	int[][] arr = new int[m][n];
	for(int i = 0; i < indices.length; i++) {
	    incrimentRows(arr, indices[i][0]);
	    incrimentColmn(arr, indices[i][1]);
	}
	int oddCount = 0;
	for(int i = 0; i < arr.length; i++) {
	    for(int j = 0; j < arr[i].length; j++) {
		if(arr[i][j] % 2 != 0)
		    oddCount++;
	    }
	}
	return oddCount;
    }
    public static void main(String[] args) {
	int[][] arr = {{0, 0}, {1, 1}};
	System.out.println(oddCells(2, 2, arr));
    }

}
