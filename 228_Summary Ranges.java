class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        //Base Case
        if(nums.length == 0) {
            return list;
        }

        //Edge Case
        int i = 0, start = 0, end = 0, n = nums.length;

        while(i < n) {
            start = nums[i];

            while(i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            end = nums[i];

            //FOrmatting Range
            if(start == end) {
                list.add(String.valueOf(start));
            }
            else {
                list.add(start + "->" + end);
            }

            i++;
        }

        return list;
    }
}