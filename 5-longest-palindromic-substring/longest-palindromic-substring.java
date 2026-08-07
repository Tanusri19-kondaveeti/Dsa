class Solution {
    public String longestPalindrome(String s) {
        if(s.length() ==0 || s.length()<2)
        {
            return s;
        }
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++)
        {
            int p1 = check(s,i,i);  //odd

            int p2 = check(s,i,i+1);  //even

            int maxi = Math.max(p1,p2);
            if(maxi > end-start+1)
            {
                start = i - (maxi-1)/2;
                end = i+maxi/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int check(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}