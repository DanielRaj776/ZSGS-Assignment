package problem;

class RemoveDuplicateInSortedArray {
    
    static void swap (int[] arr, int i, int k) {
	int temp;
	for(int j = i; j < k; j++) {
	    temp = arr[j + 1];
	    arr[j + 1] = arr[j];
	    arr[j] = temp;
	}
    }
    static int removeDuplicate(int[] arr) {
	int k, i;
	for(i = 0, k = arr.length-1; i < k; i ++) {
	    if(arr[i] == arr[i + 1]) {
		swap(arr, i + 1, k);
		k--;
		i--;
	    }
	}
	return k;
    }
    public static void main(String[] args) {
	int[] arr1 = {11, 11, 11, 11, 11, 11};
	System.out.println("before removeing duplicates.");
	for(int x: arr1) {
	    System.out.print(x + " ");
	}
	int index = removeDuplicate(arr1);
	
	System.out.println();
	System.out.println("after removeing duplicates.");
	for(int x: arr1) {
	    System.out.print(x + " ");
	}
	
	System.out.println();
	System.out.println("only the relavent data.");
	for(int i = 0; i <= index; i++) {
	    System.out.print(arr1[i] + " ");
	}
	
    }

}
