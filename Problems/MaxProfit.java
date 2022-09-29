package problem;

class MaxProfit {
    static int maxProfit (int[] prices) {
	if(prices.length < 2) {
	    return 0;
	}
	int small = 0;
	int large = -1;
	int profit = 0;
	
	for(int i = 1; i < prices.length; i++) {
	    if(prices[i] < prices[small]) {
		small = i;
		large = -1;
	    }else if(large == -1) {
		large = i;
		if(profit < prices[large] - prices[small]) {
		    profit = prices[large] - prices[small];
		}
	    }else if(prices[large] < prices[i]) {
		large = i;
		if(profit < prices[large] - prices[small]) {
		    profit = prices[large] - prices[small];
		}
	    }
	    
	}
	
	return profit;
    }
    public static void main(String[] args) {
	int[] a = {7, 4, 1, 2};
	int result = maxProfit(a);
	
	System.out.println(result);
    }

}
