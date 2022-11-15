package interviewpreparation;

import java.util.Scanner;

public class BetweenTwoNumbers {
    private void betweenXAndY (int[] arr, int x, int y) {
	for(int a : arr) {
	    if(a > x && a < y)
		System.out.print(a + " ");
	}
    }
    private void getInput () {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter n");
	int n = scanner.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
	    System.out.printf("Enter %d value\n", i + 1);
	    arr[i] = scanner.nextInt();
	}
	System.out.println("Enter x value");
	int x = scanner.nextInt();
	System.out.println("Enter y value");
	int y = scanner.nextInt();
	betweenXAndY(arr, x, y);
	scanner.close();
    }
    public static void main(String[] args) {
	BetweenTwoNumbers ob = new BetweenTwoNumbers();
	ob.getInput();
    }

}
