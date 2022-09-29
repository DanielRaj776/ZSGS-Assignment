package problem;

class ArrayCyclicalRotation {
    
    public static void main(String[] args) {
	int[] arr = {14, 17, 29, 37, 43, 99};
	int temp = arr[arr.length-1];
	
	for(int i = arr.length-2; i >= 0; i--) {
	    arr[i+1] = arr[i];
	}
	arr[0] = temp;
	
	for(int value: arr) {
	    System.out.print(value);
	    System.out.print("\t");
	}
	
    }

}
