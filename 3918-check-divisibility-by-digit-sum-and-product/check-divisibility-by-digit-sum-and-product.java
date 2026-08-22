class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int pro =1;
        int y = n;
        while(n>0)
        {
            int x = n%10;
            sum += x;
            pro *= x;
            n = n/10;
        }
        int s = pro+sum;
        if(y%s == 0)
        {
            return true;
        }
        return false;
    }
}