class Solution {
    public int smallestNumber(int n, int t) {
        int n1 = n;
        int pro = 1;
        while(n1>0)
        {
            int x = n1%10;
            pro *= x;
            if(pro == 0 || pro%t == 0)
            {
                return n;
            }
            n1 = n1/10;
        }
       while(!check(n,t))
       {
        ++n;
       }
       return n;
    }
    private boolean check(int num,int t)
    {
        int product = 1;
        while(num>0)
        {
            product *= num%10;
            num /= 10;
            if(product == 0)
            {
            break;
            }
        }
        return product %t==0;
    }
}