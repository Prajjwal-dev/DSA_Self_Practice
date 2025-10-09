class Solution {
    public int maxPoints(int[][] points) {
        //Base Case
        if(points.length <= 2) {
            return points.length;
        }

        //Edge Case
        int max = 0;
        
        for(int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeMap = new HashMap<>();
            int duplicates = 0, localMax = 0;
            
            for(int j = i + 1; j <points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if(dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }

                //reducing dy/ dx to the lowest point
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;

                //normalize slope operation
                String slope = dx + "/" + dy;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                localMax = Math.max(localMax, slopeMap.get(slope));
            }

            max = Math.max(max, localMax + duplicates + 1);
        }
        return max;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}