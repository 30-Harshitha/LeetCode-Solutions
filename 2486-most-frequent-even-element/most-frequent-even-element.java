class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=Integer.MIN_VALUE;
        int p=-1;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
       for(int c:nums)
       {
        if(c%2==0)
        m.put(c,m.getOrDefault(c,0)+1);
       } 
       for(int g:m.keySet())
       {
        if(max<m.get(g))
        {
            max=m.get(g);
            p=g;
        }
        else if(max==m.get(g)&&g<p)
        p=g;
       }
       return p;
    }
}