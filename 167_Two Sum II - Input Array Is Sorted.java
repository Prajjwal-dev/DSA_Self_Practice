class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //Edge Case
    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < numbers.length; i++) {
        int complement = target - numbers[i];
        if(map.containsKey(complement)) {
            return new int[] {map.get(complement), i + 1};
        }
        
        map.put(numbers[i], i + 1);
    }

    //If it leads here, it means we couldnt find two sum so Base Case
    return new int[] {};
    }
}