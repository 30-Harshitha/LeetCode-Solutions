class Solution {
    public int maxFreqSum(String s) {
        int max=0,maxx=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char c:m.keySet())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                max=Math.max(max,m.get(c));
            }
            else
            maxx=Math.max(maxx,m.get(c));
            
        }
        return max+maxx;
    }
}