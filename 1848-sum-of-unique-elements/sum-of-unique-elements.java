class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int c:nums)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int c:m.keySet())
        {
            if(m.get(c)<=1)
            sum+=c;
            
        }
        return sum;
    }
}