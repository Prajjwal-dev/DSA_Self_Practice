class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        //Base Case
        if(n <= 0) {
            return 0;
        }

        //Edge Case
        //Greedy Approach for this solution

        //Creating candies array for result
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        
        //Left to right calculation
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        //Right to Left Calculation
        for(int i = n - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        //Sum candies array to get result here
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += candies[i];
        }

        return sum;
    }
}