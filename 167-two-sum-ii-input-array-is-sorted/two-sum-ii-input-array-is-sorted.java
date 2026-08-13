class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length-1;
        int sum =0;
        while(left<right)
        {
            sum = numbers[right]+numbers[left];
            if(sum == target)
            {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            else{
                if(sum > target)
                {
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
}