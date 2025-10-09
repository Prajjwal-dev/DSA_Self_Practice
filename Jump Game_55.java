class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        //Base Case
        if(n <= 1) {
            return true;
        }

        //Edge Case
        int max_reach = 0;
        for(int i = 0; i < n; i++) {
            if(i > max_reach) {
                return false;
            }

            max_reach = Math.max(max_reach, i + nums[i]);
        }
        return true;
    }
}