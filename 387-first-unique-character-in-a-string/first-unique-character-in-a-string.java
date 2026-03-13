class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char x:s.toCharArray())
        m.put(x,m.getOrDefault(x,0)+1);
        for(int i=0;i<s.length();i++)
        {
            if(m.get(s.charAt(i))==1)
            return i;
            
        }
        return -1;
        
    }
}