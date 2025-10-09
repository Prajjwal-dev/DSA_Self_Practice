class Solution {
    public int romanToInt(String s) {
        //Base case
        if(s.length() <= 0) {
            return 0;
        }
        //Edge Case
        //Using Hashmap for managing symbols and values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //Edge Case
        //Initialization
        int prev = 0, total = 0, current = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            current = map.get(s.charAt(i));
            if(current < prev) {
                total -= current;
            }
            else {
                total += current;
            }
            prev = current;
        }
        
        return total;
    }
}