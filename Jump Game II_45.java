class Solution {
    public int jump(int[] nums) {
        //Base Case
        int n = nums.length;
        if(n <= 1) {
            return 0;
        }
        
        //Edge Case(i.e. Greedy Approach)
        int jumps = 0, farthest = 0, currentEnd = 0;

        for(int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            //Checking currentEnd for counting jump
            if(i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}