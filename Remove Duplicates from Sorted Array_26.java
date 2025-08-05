import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        // Count frequencies using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            map.put(nums[i], map.get(nums[i]) + 1);
        } else {
            map.put(nums[i], 1);
        }
        }

        // Extract keys and sort them (to maintain order)
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        // Write back sorted unique keys into nums
        int i = 0;
        for (int key : keys) {
            nums[i++] = key;
        }

        // Return the count of unique elements
        return i;
    }
}