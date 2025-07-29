class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        int temp = 0;
        for(int i = 0; i < m + n - 1; i++) {
            for(j = 0; j < m + n - i - 1; j++) {
                if(nums1[j] > nums1[j + 1]) {
                temp = nums1[j];
                nums1[j] = nums1[j + 1];
                nums1[j + 1] = temp;
                }
            }
        }
    }
}