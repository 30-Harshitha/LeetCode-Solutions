class Solution {
    public int maximumDifference(int[] nums) {
        int dif=0,max=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {dif=nums[j]-nums[i];
                max=Math.max(dif,max);
                }
            }

        }
        return max;
    }
}