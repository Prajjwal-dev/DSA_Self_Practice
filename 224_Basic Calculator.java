import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int num = 0;
        int sign = 1; //+1 for positive and -1 for negative

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); //Build number
            } else if(ch == '+') {
                result += sign * num;
                sign = 1;
                num = 0;
            } else if(ch == '-') {
                result += sign * num;
                sign = -1;
                num = 0;
            } else if(ch == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            } else if(ch == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
            else if(ch == ' ') {
                continue;
            }
        }

        result += sign * num;
        return result;
    }
}