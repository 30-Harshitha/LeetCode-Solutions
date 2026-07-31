class Solution {
    public int findLucky(int[] arr) {
        int p=-1;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int c:arr)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int f:m.keySet())
        {
            if(m.get(f)==f)
            p=f;
        }
        return p;
    }
}