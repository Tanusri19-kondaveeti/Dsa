class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        int n = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                cnt++;
            }
            else if(ch == ')' && cnt>0)
            {
                cnt--;
            }
            else{
                n++;
            }
        }
        return n+cnt;
    }
}