class Solution {
    public int[] plusOne(int[] digits) {
        //Base Case
        int n = digits.length;
        if(n < 0) {
            return digits;
        }

        //Edge Case
        //Using new array method
        for(int i = n - 1; i >= 0; i--) {
            digits[i]++;

            //If there is no carry
            if(digits[i] < 10) {
                return digits;
            }

            //If there is carry we put 0
            digits[i] = 0;
        }

        //if it has reached here then it had carry with all 9's in array
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}