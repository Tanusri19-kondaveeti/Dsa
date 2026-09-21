class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for(int i=0;i<nums.length;i++)
        {
            esum += nums[i];
            while(nums[i] > 0)
            {
                int x = nums[i]%10;
                dsum += x;
                nums[i] = nums[i]/10;
            }
        }
        return Math.abs(esum - dsum);
    }
}