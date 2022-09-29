package problem;

class ArrayMiniMaxElement {
    static void miniMax (int[] arr,int n) {
	int mini = 0;
	int max = 0;
	if(n == 0) {
	    System.out.println("not valid array.");
	    return;
	}else if (n == 1) {
	    System.out.println("minimum " + arr[0]);
	    System.out.println("maximum " + arr[0]);
	}
	
	if(arr[0] < arr[1]) {
	    mini = arr[0];
	    max = arr[1];
	}else {
	    mini = arr[1];
	    max = arr[0];
	}
	
	for(int i = 2;i < n;i++) {
	    if(arr[i] < mini) {
		mini = arr[i];
	    }else if (arr[i] > max) {
		max = arr[i];
	    }
	}
	System.out.println("minimum " + mini);
	System.out.println("maximum " + max);
    }
    public static void main(String[] args) {
	int[] arr = {14, 17, 29, 37, 43, 9};
	int n = arr.length;
	miniMax(arr, n);
	}
    }

