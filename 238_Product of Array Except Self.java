class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n <= 0) {
            return nums;
        }

        //Edge Case
        //for prefix calculation
        int[] result = new int[n];and 
        result[0] = 1;

        for(int i = 1; i < n; i++) {
            result[i] = nums[i - 1];
            result[i] = result[i] * result[i - 1];
        }

        //for suffix calculation
        int suffix = 1;

        for(int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}