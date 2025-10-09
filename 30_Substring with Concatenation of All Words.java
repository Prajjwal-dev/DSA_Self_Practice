class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        //Base Case
        List<Integer> ans = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return ans;
        }
        
        //Edge Case
        //Using Sliding Window and Offset Method
        int n = s.length();
        int L = words[0].length();  // length of one word
        int K = words.length;       // number of words
        int W = L * K;              // total window size

        // Build frequency map of words
        Map<String, Integer> target = new HashMap<>();
        for (String w : words) {
            target.put(w, target.getOrDefault(w, 0) + 1);
        }

        // Try every offset
        for (int offset = 0; offset < L; offset++) {
            int left = offset, right = offset, count = 0;
            Map<String, Integer> seen = new HashMap<>();

            while (right + L <= n) {
                String word = s.substring(right, right + L);
                right += L;

                if (target.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // If a word is seen too many times, shrink from left
                    while (seen.get(word) > target.get(word)) {
                        String leftWord = s.substring(left, left + L);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += L;
                        count--;
                    }

                    // If all words matched
                    if (count == K) {
                        ans.add(left);
                    }
                } else {
                    // reset window
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return ans;
    }
}
