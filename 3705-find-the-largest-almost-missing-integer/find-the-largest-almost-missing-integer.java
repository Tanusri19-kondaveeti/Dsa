class Solution {
    public int largestInteger(int[] nums, int k) {
        int left = nums[0];
        int right = nums[nums.length-1];
        int lc =0;
        int rc =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        if(k == 1)
        {
            for(int i=0;i<nums.length;i++)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            int ans = -1;
            for(int x:map.keySet())
            {
                if(map.get(x) == 1)
                {
                    ans = Math.max(ans,x);
                }
            }
            return ans;
        }
        else if(k == nums.length)
        {
            int ans = -1;
            for(int x:nums)
            {
                ans = Math.max(ans,x);
            }
            return ans;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == left)
            {
                lc++;
            }
            else if(nums[i] == right)
            {
                rc++;
            }
        }
        if(lc == 1 && rc ==1)
        {
            return Math.max(left,right);
        }
        else if(rc == 1)
        {
            return right;
        }
        else if(lc == 1)
        {
            return left;
        }
        // if(lc>rc)
        // {
        //     return right;
        // }
        // else if(lc<rc)
        // {
        //     return left;
        // }
        // else if(lc == rc)
        // {
        //     return Math.max(left,right);
        // }
        return -1;
    }
}