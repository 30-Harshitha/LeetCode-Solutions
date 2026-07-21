class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1,maxx=Integer.MIN_VALUE;
        if(nums.length==1)
        return 1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            c++;
            maxx=Math.max(maxx,c);
            if(nums[i]>=nums[i+1])
            c=1;
        }
        return maxx;
    }
}