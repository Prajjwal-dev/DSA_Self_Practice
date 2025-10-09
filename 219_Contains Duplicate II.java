class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Base Case
        if(nums.length == 0) {
            return false;
        }

        //Edge Case
        //Using HashMap and current Pointer method
        //Question done by myself in short period of time
        Map<Integer, Integer> duplicate = new HashMap<>();
        int current = 0;

        for(int i = 0; i < nums.length; i++) {
            if(duplicate.containsKey(nums[i])) {
                current = duplicate.get(nums[i]);

                if(Math.abs(current - i) <= k) {
                    return true;
                }
            }

            ////Tracking index of nums
            duplicate.put(nums[i], i);
        }

        return false;
    }
}