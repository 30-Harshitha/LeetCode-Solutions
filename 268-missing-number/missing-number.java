class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        
        for(int z:nums)
        {if(z==0&&nums.length==1)
        return 1;
        if(z==1&&nums.length==1)
        return 0;
        a.add(z);
        }
        for(int i=1;i<=a.size();i++)
        {
            if(!a.contains(i))
            return i;
        }
        return 0;
    }
}