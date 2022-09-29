package problem;

class ShuffleString {
    static String restoreString(String s, int[] indices) {
	int len = s.length();
	char[] arr = new char[len];
	for(int i = 0; i < len; i++) {
	    arr[indices[i]] = s.charAt(i);
	}
	return new String(arr);
    }
    public static void main(String[] args) {
	String s = "codeleet";
	s.toCharArray();
	int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
	String t = restoreString(s, indices);
	System.out.println(t);
	
    }

}
