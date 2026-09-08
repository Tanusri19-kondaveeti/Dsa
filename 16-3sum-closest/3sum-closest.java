class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int[] diff = new int[(nums.length)*3];
        int sum = 0;
        int dif = Integer.MAX_VALUE;
        int x;
        int ans =0;
        int z =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    sum = nums[i]+nums[j]+nums[k];
                    x = Math.abs(target-sum);
                    if(x < dif)
                    {
                      ans = sum;
                      dif = x;  
                    }
                }
            }
        }
        return ans;
    }
}