class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1) {
            return 0;
        }

        int a = prices[0];
        int prev_profit = 0, next_profit = 0;
        for(int i = 1; i < n; i++) {
            next_profit = prices[i] - a;
            if(next_profit > prev_profit) {
                prev_profit = next_profit;
            }

            if(prices[i] < a) {
                a = prices[i];
            }
        }

        return prev_profit;
    }
}