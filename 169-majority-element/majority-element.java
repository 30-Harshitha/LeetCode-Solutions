class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int x:nums) a.put(x,a.getOrDefault(x,0)+1);
        int s=0;
        for(int y:a.keySet())
        {
            if(a.get(y)>nums.length/2)
            {
                s=y;
            }

        }
        return s;
    }
}