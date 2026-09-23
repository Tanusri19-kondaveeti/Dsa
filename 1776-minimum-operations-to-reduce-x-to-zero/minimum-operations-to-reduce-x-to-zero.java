class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        if(sum == x)
        {
            return nums.length;
        }
        int target = sum - x;
        int left = 0;
        int s = 0;
        int maxlength = -1;
        for(int right = 0;right< nums.length;right++)
        {
            s += nums[right];
            while(s > target && left <= right)
            {
                s -= nums[left];
                left++;
            }
            if(s == target)
            {
                maxlength= Math.max(maxlength,right-left+1);
            }
        }
            if(maxlength == -1)
            {
                return -1;
            }
            return nums.length-maxlength;
    }
}