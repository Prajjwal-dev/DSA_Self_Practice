class Solution {
    public String intToRoman(int num) {
        //Base Case
        if(num <= 0) {
            return "";
        }

        //Edge Case
        //Using TreeMap for sorting in descending order
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        //Putting all key-value pairs
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");


        StringBuilder sb = new StringBuilder();
        for(int key: map.keySet()) {
            while(num >= key) {
                num -= key;
                sb.append(map.get(key));
            }
        }

        return sb.toString();
    }
}