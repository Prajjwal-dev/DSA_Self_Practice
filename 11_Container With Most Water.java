class Solution {
    public int maxArea(int[] height) {
        //Base Case
        if(height.length <= 0) {
            return 0;
        }

        //Edge Case
        //Using Two Pointer and Shorter line approach
        int i = 0, j = height.length - 1;
        int max = 0;
        while(i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, area);

            //Finding shorter line :)
            if(height[i] < height[j]) {
                i++;
            } 
            else {
                j--;
            }
        }

        return max;
    }
}