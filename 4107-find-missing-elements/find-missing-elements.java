class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        if(max-min == nums.length-1)
        {
            return li;
        }
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i] != min)
        {
            li.add(min);
            i--;
        }
        min++;
       }
       return li;
    }
}