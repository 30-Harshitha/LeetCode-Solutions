class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        for(int x : nums) a.put(x,a.getOrDefault(x,0)+1);
        for(int d : a.values()) 
        if(d>1)
        {
            return true;
        }
        return false;
    }
}