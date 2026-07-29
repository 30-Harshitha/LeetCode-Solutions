class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:nums)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int l:m.keySet())
        {
            if(m.get(l)%k==0)
            sum+=m.get(l)*l;

        }
        return sum;
    }
}