class Solution {
    public String convert(String s, int numRows) {
        //Base Case or Special Case
        if(numRows == 1 || numRows >= s.length()) {
            return s;
        }

        //Edge Case
        //Technique of currRow and goingDown Update
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        //Zigzag conversion logic
        //Firstly Initialization....
        int currRows = 0;
        boolean goingDown = false;

        for(char c: s.toCharArray()) {
            rows.get(currRows).append(c);
            
            //Checking position whether it is in top or bottom
            if(currRows == 0 || currRows == numRows - 1) {
                goingDown = !goingDown;
            }

            //updating currRows according to status of goingDown
            if(goingDown) {
                currRows = currRows + 1;
            }
            else {
                currRows = currRows - 1;
            }

        }
            //Creating result from zigzag conversion
            StringBuilder result = new StringBuilder();
            //Appending each StringBuilder from each rows
            for(StringBuilder row: rows) {
                result.append(row);
            }
            return result.toString();
    }
}