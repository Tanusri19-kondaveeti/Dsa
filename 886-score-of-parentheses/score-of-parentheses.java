class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                stack.push(0);
            }
            else if(ch == ')'){
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w+Math.max(2*v,1));
            }
        }
        return stack.pop();
    }
}