class Solution {
    public boolean isPalindrome(int x) {
        //Done by myself in very short period of time
        if(x < 0) {
            return false;
        }
        int temp = x, rem = 0, rev = 0;

        while(temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if(rev == x) {
            return true;
        }
        else {
            return false;
        }
    }
}