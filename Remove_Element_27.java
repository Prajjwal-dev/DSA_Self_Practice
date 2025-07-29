import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        if(k <= 0) {
            return k;
        }
        Vector<Integer> nums1 = new Vector<>();
        for(int i = 0; i < k; i++) {
            if(nums[i] != val) {
                nums1.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
        }
        int j = 0;
        for(int num: nums1) {
            nums[j] = num; 
            j++;
        }
        k = nums1.size();
        return k;
    }
}