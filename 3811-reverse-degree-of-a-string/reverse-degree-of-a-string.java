class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++)
        {
            int x = Math.abs(s.charAt(i)-'a'-26);
            if(i ==0)
            {
                sum += x;
            }
            else{
                sum += x*(i+1);
            }
        }
        return sum;
    }
}