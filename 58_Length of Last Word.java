class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        
        //Remove Trailing space at the end if found
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        //Finding length of last substring of given string by iterating upto space not found as trailing space at end if it is then already been gone
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}