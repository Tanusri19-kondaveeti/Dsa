class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.trim().split("\\s+");
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revmap = new HashMap<>();
        if(pattern.length() != str.length)
        {
            return false;
        }
        for(int i=0;i<str.length;i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                {
                    return false;
                }
            }
            if(map.containsValue(str[i]))
            {
                if(!revmap.get(str[i]).equals(pattern.charAt(i)))
                {
                    return false;
                }
            }
            map.put(pattern.charAt(i),str[i]);
            revmap.put(str[i],pattern.charAt(i));
        }
        return true;
    }
}