class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Base Case 
        if(s.length() <= 0) {
            return 0;
        }

        //Edge Case
        //Sliding WIndow Approach and Hash Set Method
        Set<Character> seen = new HashSet<>();
        int left = 0, best = 0;
        for(int right = 0; right < s.length(); right++) {
           char c = s.charAt(right);
           while(seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
           }
           seen.add(c);
           best = Math.max(best, right - left + 1);
        }
        return best;
    }
}