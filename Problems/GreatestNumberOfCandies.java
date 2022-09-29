package problem;

import java.util.ArrayList;
import java.util.List;

class GreatestNumberOfCandies {
    static int greatest (int[] arr) {
	int big = 0;
	for(int i = 0; i < arr.length; i++) {
	    if(arr[i] > big)
		big = arr[i];
	}
	return big;
    }
    
    static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
	int len = candies.length;
	List<Boolean> list = new ArrayList<>(len);
	int greatest = greatest(candies);
	for(int i = 0; i < len; i++) {
	    if((candies[i] + extraCandies) >= greatest) {
		list.add(i, true);
	    }else {
		list.add(i, false);
	    }
	}
	return list;
    }
    
    public static void main(String[] args) {
	int[] arr = { 2, 3, 5, 1, 3, 1};
	List<Boolean> list = kidsWithCandies(arr, 3);
	for(Boolean x : list) {
	    System.out.print(x + " ");
	}
    }

}
