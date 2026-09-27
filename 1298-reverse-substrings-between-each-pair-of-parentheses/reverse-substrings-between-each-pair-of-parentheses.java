class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        int x =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                st.push(i);
            }
            else if(s.charAt(i) == ')')
            {
                x = st.pop();
                reverseString(x+1,i-1,sb);
            }
        }
        for(int t=0;t<sb.length();t++)
        {
            char ch = sb.charAt(t);
            if(ch != '(' && ch != ')')
            {
                result.append(ch);
            }
        }
        return String.valueOf(result);
    }
    private void reverseString(int x , int y,StringBuilder sb)
    {
            while(x<y)
            {
            char temp = sb.charAt(x);
            sb.setCharAt(x, sb.charAt(y));
            sb.setCharAt(y, temp);
                x++;
                y--;
            }
    }
}