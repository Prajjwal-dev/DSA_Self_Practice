class Solution {
    public boolean isHappy(int n) {
        //Base case
        if(n == 1) {
            return true;
        }

        //Edge case
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1; //this works as to return boolean value ot check (n == 1)
    }

    //Helper function to get next value from n for checkign happy number
    private int getNext(int n) {
        int total = 0;

        while(n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n /= 10;
        }
        return total;
    }
}