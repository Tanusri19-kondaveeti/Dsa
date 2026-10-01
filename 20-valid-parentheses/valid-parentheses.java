class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> str = new Stack<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                str.push(ch);
            }
            else{
                if(str.isEmpty())
                {
                    return false;
                }
                if(map.get(str.peek())==ch)
                {
                    str.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(!str.isEmpty())
        {
            return false;
        }
        return true;
    }
}