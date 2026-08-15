class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int zero = 0;
        int zpro = 1;
        int pro = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                zero++;
            }
            else{
                zpro *= nums[i];
            }
            pro *= nums[i];
        }
        if(zero >=2)
        {
            return ans;
        }
        for(int i=0;i<ans.length;i++)
        {
            if(nums[i] == 0)
            {
                ans[i] = zpro;
            }
            else 
            {
                ans[i] = pro/nums[i];
            }
        }
        return ans;
    }
}