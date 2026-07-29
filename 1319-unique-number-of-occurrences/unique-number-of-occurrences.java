class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:arr)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        HashSet<Integer> s=new HashSet<>();
        for(int l:m.values())
        {
            if(s.contains(l))
            return false;
            s.add(l);
        }
        return true;
    
        
    }
}