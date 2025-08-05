class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //Base Case
        if(n <= 1) {
            return 0;
        }

        //Edge Case
        int a = prices[0];
        int profit = 0;
        for(int i = 0; i < n; i++) {
            if(prices[i] > a) {
                profit += prices[i] - a;
            }

            a = prices[i];
        }
        return profit;
    }
}