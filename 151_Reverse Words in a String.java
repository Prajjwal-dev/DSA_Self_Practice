class Solution {
    public String reverseWords(String s) {
        //Base Case
        if(s.length() <= 0) {
            return "";
        }

        //Edge Case
        //Technique of splitting and trimming
        //Remove Trailing Space
        s = s.trim();
        //Splits words from string s
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if(i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}