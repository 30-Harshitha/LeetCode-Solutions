class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] tem=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:nums)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int i=0;
        for(int f:m.keySet())
        {
            if(m.get(f)==2)
            tem[i++]=f;
        }
        return tem;
        
    }
}