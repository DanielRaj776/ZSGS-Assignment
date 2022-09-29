package problem;

class Decode {
    static int[] decode(int[] encoded, int first) {
	int len = encoded.length;
	if(len == 0)
	    return encoded;
	
	int[] arr = new int[len + 1];
	arr[0] = first;
	for(int i = 1; i < arr.length; i++) {
	    arr[i] = arr[i - 1] ^ encoded[i - 1];
	}
	return arr;
    }
    public static void main(String[] args) {
	int[] encode = {1, 2, 3};
	int[] arr = decode(encode, 1);
	for(int x : arr) {
	    System.out.print(x + " ");
	}
	
    }

}
