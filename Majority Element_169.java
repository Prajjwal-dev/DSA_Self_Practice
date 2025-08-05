class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
            int majorityElement = nums[0];
            int gt = 0;
            for(Integer key: map.keySet()) {
                if(map.get(key) > gt) {
                    gt = map.get(key);
                    majorityElement = key;
                }
            }
        return majorityElement;
    }
}