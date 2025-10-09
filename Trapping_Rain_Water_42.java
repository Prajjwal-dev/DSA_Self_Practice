class Solution {
    public int trap(int[] height) {
       int n = height.length;
       //Base Case
       if(n <= 0) {
        return 0;
       }

       //Edge Case
       //For Calculation of Left Max of height
       //Here Exmaple is of histogram
       //Initialization first
        int[] max_left = new int[n];
        int[] max_right = new int[n];

        max_left[0] = height[0];
        for(int i = 1; i < n; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i]);
        }

        //For calculation fo Right Max of height
        max_right[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i]);
        }

        //For calculation of trapped rain
        int trapped = 0;
        for(int i = 0; i < n; i++) {
            trapped += Math.min(max_left[i], max_right[i]) - height[i];
        }

        return trapped;

    }
}