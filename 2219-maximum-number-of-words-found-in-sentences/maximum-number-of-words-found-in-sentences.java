class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++)
        {
            int cnt =0;
            String s = sentences[i];
            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                if(ch == ' ')
                {
                   cnt++;
                   max = Math.max(cnt,max);
                }
            }
            
        }
        return max+1;
    }
}