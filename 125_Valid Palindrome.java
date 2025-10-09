class Solution {
    public boolean isPalindrome(String s) {
        //Base Case
        if(s.length() <= 0) {
            return false;
        }

        //Edge Case
        //Using Two Pointer Approach
        int left = 0, right = s.length() - 1;
        while(left < right) {
            //Skip non-alphanumeric  character
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            //if character doent match with left and right pointer, then directly return false
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        //This phrase is palindrome
        return true;
    }
}