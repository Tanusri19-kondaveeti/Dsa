class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // int prev = -1;
        // int next = -1;
        // if(nums.length == 1)
        // {
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(i ==0 && nums[i] != nums[i+1])
        //     {
        //         return nums[i];
        //     }
        //     else if(i ==0 && nums[i] == nums[i+1])
        //     {
        //         continue;
        //     }
        //     if(i==nums.length-1 && nums[i] != nums[i-1])
        //     {
        //         return nums[i];
        //     }
        //     else if(i == nums.length-1 && nums[i] == nums[i-1])
        //     {
        //         continue;
        //     }
        //     prev = nums[i-1];
        //     next = nums[i+1];
        //     if(nums[i] != prev && nums[i] != next)
        //     {
        //         return nums[i];
        //     }
        // }
        // return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int n : map.keySet())
        {
            if(map.get(n) == 1)
            {
                return n;
            }
        }
        return -1;
    }
}