class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generate("",n,list);
        return list;
    }
    public void generate(String current,int n,ArrayList<String> list)
    {
        if(current.length() == 2*n)
        {
            if(isValid(current))
            {
                list.add(current);
            }
            return;
        }
        generate(current+"(",n,list);
        generate(current+")",n,list);
    }
    public boolean isValid(String s)
    {
       int cnt = 0;
       for(char ch: s.toCharArray())
       {
         if(ch == '(')
         {
            cnt++;
         }
         if(ch == ')')
         {
            cnt--;
         }
         if(cnt < 0)
         {
            return false;
         }
       }
       return cnt ==0 ;
    }
}