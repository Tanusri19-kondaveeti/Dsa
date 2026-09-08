class Solution {
    public int countCommas(int n) {
        int temp = n;
        int cnt =0;
        while(temp>0)
        {
            cnt++;
            temp = temp/10;
        }
        if(cnt>=4)
        {
           return (n-1000)+1; 
        }
        return 0;
    }
}