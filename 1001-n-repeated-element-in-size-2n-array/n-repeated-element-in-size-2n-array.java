class Solution {
    public int repeatedNTimes(int[] nums) {
        int v=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:nums)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int k:m.keySet())
        {
            if(m.get(k)>1)
            v=k;
            
        }
        return v;
    }
}