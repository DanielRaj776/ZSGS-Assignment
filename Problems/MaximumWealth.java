package problem;

class MaximumWealth {
    static int maximumWealth(int[][] accounts) {
	int wealthMax = 0;
	for(int i = 0; i < accounts.length; i++) {
	    int wealth = 0;
	    for(int j = 0; j < accounts[i].length; j++) {
		wealth += accounts[i][j];
	    }
	    if(wealth > wealthMax)
		wealthMax = wealth;
	}
	return wealthMax;
    }
    public static void main(String[] args) {
	int[][] arr = {{1, 2, 3}, {3, 2, 1}};
	int a = maximumWealth(arr);
	System.out.println(a);
    }

}
