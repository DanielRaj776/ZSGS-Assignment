package problem;

class MaxProfit2 {
    
    static int maxProfit (int[] prices) {
	int profit = 0;
	if(prices.length < 2) {
	    return 0;
	}
	
	
	for(int i = 0; i < prices.length-1; i++) {
	    if(prices[i+1] > prices[i]) {
		profit += (prices[i+1] -prices[i]);
	    }
	}
	return profit;
    }
    
    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	int result = maxProfit(arr);
	System.out.println(result);
    }

}
