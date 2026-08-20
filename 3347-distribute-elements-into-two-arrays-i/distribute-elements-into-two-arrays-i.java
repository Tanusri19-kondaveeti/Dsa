class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        n1.add(nums[0]);
        n2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(n1.get(n1.size()-1) > n2.get(n2.size()-1))
            {
                n1.add(nums[i]);
            }
            else{
                n2.add(nums[i]);
            }
        }
        int j=0;
        for(int x:n1)
        {
            nums[j] = x;
            j++;
        }
        for(int x:n2)
        {
            nums[j] = x;
            j++;
        }
        return nums;
    }
}