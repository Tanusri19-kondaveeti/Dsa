class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int mini = -1;
        int maxi =0;
        int ans =0;
        while(left<right)
        {
            mini = Math.min(height[left],height[right]);
            int area = mini*(right-left);
            ans = Math.max(ans,area);
            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}