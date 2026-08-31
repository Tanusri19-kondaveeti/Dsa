class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=1)
        {
            return 1;
        }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxI =0;
    int minI =0;
    for(int i=0;i<nums.length;i++)
    {
        if(max < nums[i])
        {
            max = nums[i];
            maxI = i;
        }
        if(min > nums[i])
        {
            min = nums[i];
            minI = i;
        }
    }
        int x = Math.max(minI,maxI);
        int y = Math.min(minI,maxI);
        int deleteleft = x+1;
        int deleteright = nums.length-y;
        int deleteboth = (y+1)+(nums.length-x);
        return Math.min(deleteboth,Math.min(deleteleft,deleteright));
    }
}