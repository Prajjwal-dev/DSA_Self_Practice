class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //Base Case
        int n1 = gas.length, n2 = cost.length;
        if(n1 <= 0 || n2 <= 0) {
            return -1;
        }

        //Edge Case
        //Greedy Approach for solution
        int totalGas = 0;
        int tank = 0;
        int start = 0;

        for(int i = 0; i < n1; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            tank += diff;

            //Check for reseting start index and tank here
            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        
        //Check for posssibility of circuit
        if(totalGas >= 0) {
            return start;
        }
        else {
            return -1;
        }
    }
}