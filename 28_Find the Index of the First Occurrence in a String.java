class Solution {
    public int strStr(String haystack, String needle) {
        //Base Case
        if(haystack.length() <= 0) {
            return -1;
        }

        if(needle.length() <= 0) {
            return -1;
        }

        //Edge Case
        //Find first occurence of string using indexOf
        int index = haystack.indexOf(needle);
        return index;
    }
}