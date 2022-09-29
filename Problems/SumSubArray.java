package problem;

class SumSubArray {
    
    static int[] subArray(int[] arr, int n, int s) {
	int sum = 0;
	int[] subarr = new int[2];
	if (n == 0) {
	    System.out.println("invalid array.");
	    return subarr;
	}
	
	for(int i = 0; i < n; i++) {
	    if(arr[i] == s) {
		subarr[0] = i + 1;
		subarr[1] = i + 1;
		return subarr;
	    }
	    for(int j = i;j < n; j++) {
		sum +=j;
		if(sum == s) {
		    subarr[0] = i + 1;
		    subarr[1] = j + 1;
		    return subarr;
		}else if(sum > s){
		    break;
		}
	    }
	}
	System.out.println("there on subarray.");
	return subarr;
    }
    public static void main(String[] args) {
	int[] arr1 = { };
	int n1 = 0,s1 = 9;
	int[] arr2 = {12};
	int n2 = 1,s2 = 12;
	int[] arr3 = { 7, 4, 9, 11, 13};
	int n3 = arr3.length,s3 = 13;
	int[] arr4 = { 7, 13, 4, 9, 11};
	int n4 = arr4.length,s4 = 13;
	int[] resultarr;
	resultarr = subArray(arr1,n1,s1);
	System.out.println("arr1 :" +resultarr[0] + " " +resultarr[1]);
	resultarr = subArray(arr2,n2,s2);
	System.out.println("arr2 :" + resultarr[0] + " " +resultarr[1]);
	resultarr = subArray(arr3,n3,s3);
	System.out.println("arr3 :" + resultarr[0] + " " +resultarr[1]);
	resultarr = subArray(arr4,n4,s4);
	System.out.println("arr4 :" + resultarr[0] + " " +resultarr[1]);
    }
}