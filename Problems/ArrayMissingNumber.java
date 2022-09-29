package problem;

class ArrayMissingNumber {
    static int findMissingNum(int[] arr,int n) {
	boolean test;
	for(int i = 1; i <= n; i++) {
	    test = true;
	    for(int j = 0; j < n-1; j++) {
		if(i == arr[j]) {
		    test = false;
		    break;
		}
	    }
	    if(test)
	    return i;
	}
	return 0;
    }
    public static void main(String[] args) {
	int[] arr1 = {1, 4, 3, 5, 2, 6, 7, 9};
	int result = findMissingNum(arr1, arr1.length+1);
	System.out.println("Missing number : " + result);
    }

}
