class Solution {
    public boolean isSubsequence(String s, String t) {
        //Base Case
        if(s.length() <= 0) {
            return true;
        }

        if(t.length() <= 0) {
            return false;
        }

        //Edge Case
        int count = s.length(), i = 0;
        for(int j = 0; j < t.length() && i < s.length(); j++) {
            if(s.charAt(i) == t.charAt(j)) {
                count--;
                i++;
            }
        }

        if(count != 0) {
            return false;
        }
        return true;
    }
}