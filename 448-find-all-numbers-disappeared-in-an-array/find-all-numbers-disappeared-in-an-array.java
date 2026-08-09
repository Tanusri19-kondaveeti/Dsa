class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            map.put(i,0);
        }
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer x : map.keySet())
        {
            if(map.get(x) == 0)
            {
                li.add(x);
            }
        }
        return li;
    }
}