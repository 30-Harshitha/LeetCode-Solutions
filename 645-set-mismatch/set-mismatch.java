class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int h[]=new int[2];
        int i=0;
        for(int x: nums) a.put(x,a.getOrDefault(x,0)+1);
        for(int y:a.keySet())
        {
            if(a.get(y)==2)
            {
                h[i++]=y;
                for(int j=1;j<=nums.length;j++)
                {
                    if(a.containsKey(j))
                    {
                        continue;
                    }
                    else
                    {
                        h[i]=j;
                    }
                }
            }
        }
        return h;
    }
}