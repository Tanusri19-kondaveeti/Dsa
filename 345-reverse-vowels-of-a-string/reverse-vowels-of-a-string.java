class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String str = "aeiouAEIOU";
        char[] c = s.toCharArray();
        while(left < right)
        {
            while(left<right && str.indexOf(c[left]) == -1)
            {
                left++;
            }
            while(left<right && str.indexOf(c[right]) == -1)
            {
                right--;
            }
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return new String(c);
    }
}