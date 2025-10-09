class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Base Case
        if(nums.length <= 0) {
            return 0;
        }

        //Edge Case
        //Using Sliding Window Approach
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        //Iterative Minimum Finding Approach
        for(int end = 0; end < n; end++) {
            sum += nums[end];

            //Checking if sum meets target
            while(sum >= target) {
                min = Math.min(min, end - start + 1);
                sum -= nums[start];
                start++;
            }

        }
            //Check if min was never updated
            if(min == Integer.MAX_VALUE) {
                return 0;
            }
            
            return min;
    }
}