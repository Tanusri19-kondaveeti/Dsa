class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=1000;i++)
        {
            int x = k*i;
            boolean f = false;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] == x)
                {
                   f = true;
                   break;
                }
            }
            if(f==false)
            {
                return x;
            }
        }
        return -1;
    }
}