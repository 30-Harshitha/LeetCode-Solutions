class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
        return nums[0];
        HashMap <Integer,Integer> m=new HashMap<>();
        for(int x:nums) m.put(x,m.getOrDefault(x,0)+1);
        for(int y:m.keySet())
        {
            if(m.get(y)==1)
            return y;

        }
        return 0;
    }
}