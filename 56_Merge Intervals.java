class Solution {
    public int[][] merge(int[][] intervals) {
        //Base Case
        if(intervals == null || intervals.length <= 1) {
            return intervals;
        }

        //Edge Case
        //Using ArrayList
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); //Using Lambda Expression
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for(int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if(current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            }
            else {
                current = next;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}