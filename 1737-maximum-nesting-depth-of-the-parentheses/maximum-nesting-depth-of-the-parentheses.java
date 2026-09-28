class Solution {
    public int maxDepth(String s) {
        int cnt =0; 
        int maxi = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                cnt = cnt+1;
                maxi = Math.max(maxi,cnt);
            }
            else if(ch == ')')
            {
                cnt -=1;
            }
        }
        return maxi;
    }
}