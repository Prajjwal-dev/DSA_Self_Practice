class Solution {
    public int longestConsecutive(int[] nums) {
        //Base Case
        if(nums.length == 0) {
            return 0;
        }

        //Edge Case
        //Using Array List
        Arrays.sort(nums);
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        //Using logest and current streak pointer to track longest consecutive sequence
        int longest = 1, currentStreak = 1;

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) == list.get(i - 1) + 1) {
                currentStreak++;
                longest = Math.max(longest, currentStreak);
            }
            else {
                currentStreak = 1;
            }
        }

        return longest;
        
    }
}