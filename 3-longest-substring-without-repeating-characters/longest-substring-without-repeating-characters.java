class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] frq = new int[256];
       int left = 0;
       int maxi =0;
       for(int right=0;right<s.length();right++)
       {
            frq[s.charAt(right)]++;
            while(frq[s.charAt(right)]>1)
            {
                frq[s.charAt(left)]--;
                left++;
            }
                maxi = Math.max(maxi,right-left+1);
       }
       return maxi; 
    }
}