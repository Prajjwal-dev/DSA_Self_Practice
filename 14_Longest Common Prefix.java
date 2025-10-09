class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Base Case
        if(strs.length <= 0) {
            return "";
        }

        //Edge Case
        //Using Shrinking Prefix method
        //Horizontal Scanning Method
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}