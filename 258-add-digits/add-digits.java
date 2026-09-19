class Solution {
    public int addDigits(int num) {
        while(String.valueOf(num).length() >1)
        {
            num = add(num);
        }
        return num;
    }
        private int add(int num)
        {
            int sum =0;
            while(num>0)
            {
               int x = num%10;
               sum += x;
               num = num/10; 
            }
            return sum;
        }
}