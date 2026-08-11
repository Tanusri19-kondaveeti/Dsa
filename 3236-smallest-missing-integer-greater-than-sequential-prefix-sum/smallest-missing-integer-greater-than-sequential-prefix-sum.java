class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        if(nums.length == 1)
        {
            return nums[0]+1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i == nums.length-1)
            {
                if(nums[i] - nums[i-1] == 1)
                {
                    sum += nums[i];
                }
            }
            if(i != nums.length-1)
            {
            if(nums[i+1]-nums[i] == 1)
            {
                sum += nums[i];
            }
            else
            {
                sum += nums[i];
                break;
            }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        while(set.contains(sum))
        {
            sum++;
        }
        return sum;
    }
}