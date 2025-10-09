class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        //Base Case
        if(n <= 0) {
            return 0;
        }

        //Edge case
        //For H-index
        int h = 0;
        Arrays.sort(citations);
        
        for(int i= 0; i < n / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[n - 1 - i];
            citations[n - 1 - i] = temp;
        }
        
        for(int i = 0; i < n; i++) {
            if(citations[i] >= i + 1) {
                h++;
            }
        }
        return h;
    }
}