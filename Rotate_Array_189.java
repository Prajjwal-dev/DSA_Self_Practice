class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //Base Case
        if(n <= 1) {
            return;
        }

        //Case:rotation has no effect
        k = k % n;
        if(k == 0) {
            return;
        }

        int i =0;
        int[] b = new int[n];
        for(int j = k; j < n; j++) {
            b[j] = nums[i];
            i++;
        }

        i = n - k;
        for(int j = 0; j < k; j ++) {
            b[j] = nums[i];
            i++;
        }

        Arrays.fill(nums, 0);
        i = 0;
        for(int j = 0; j < n; j++) {
            nums[j] = b[i];
            i++;
        }
    }
}