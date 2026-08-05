/*class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        Arrays.sort(nums);
        int longest = 1;
        int cnt = 0;
        int lastsmaller = Integer.MIN_VALUE;
        for(int i =0;i<=nums.length-1;i++)
        {
            if(nums[i]-1 == lastsmaller)
            {
                cnt +=1;
                lastsmaller = nums[i];
            }
            else if(nums[i] != lastsmaller)
            {
                cnt = 1;
                lastsmaller = nums[i];
            }
            longest = Math.max(longest , cnt);
        }
        return longest;
    }
}*/
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        int cnt = 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<nums.length;i++)
        {
            st.add(nums[i]);
        }
        for(int i: st)
        {
            if(!st.contains(i-1))
            {
                cnt = 1;
                int x = i;
                while(st.contains(x+1))
                {
                    cnt++;
                    x = x+1;
                }
            }
            longest = Math.max(longest , cnt);
        }
        return longest;
    }
}