class Solution {
    public int[] sortedSquares(int[] nums) {
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         nums[i] = nums[i]*nums[i];
    //     }
    //     Arrays.sort(nums);
    // return nums;
        int ans[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        for(int k = ans.length-1;k>=0;k--)
        {
            if(Math.abs(nums[i]) < Math.abs(nums[j]))
            {
                ans[k] = nums[j]*nums[j];
                j--;
            }
            else{
                ans[k] = nums[i]*nums[i];
                i++;
            }
        }
        return ans;
    }
}