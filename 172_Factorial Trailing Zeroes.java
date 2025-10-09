class Solution {
    public int trailingZeroes(int n) {
        //Base Case
        if(n <= 0) {
            return 0;
        }

        //Edge Case
        int cnt = 0;

        while(n > 0) {
            n = n / 5;
            cnt = cnt + n;
        }

        return cnt;
    }
}