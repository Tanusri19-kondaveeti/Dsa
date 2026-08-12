class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        int n =0;
        for(int i=0;i<words.length;i++)
        {
            String s = words[i];
            cnt =0;
            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                if(!allowed.contains(String.valueOf(ch)))
                {
                    break;
                }
                else{
                    cnt++;
                }
            }
            if(cnt == s.length())
            {
                n++;
            }
        }
        return n;
    }
}