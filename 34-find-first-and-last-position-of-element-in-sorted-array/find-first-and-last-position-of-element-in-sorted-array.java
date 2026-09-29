class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0,fi=-1,la=-1;
        int[] n= new int[2];
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                fi=m;
                r=m-1;
            }
            else if(nums[m]<target)
            {
                l=m+1;
            }
            else if(nums[m]>target)
            {
                r=m-1;
            }
        }
        l=0;r=nums.length-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                la=m;
                l=m+1;
            }
            else if(nums[m]<target)
            {
                l=m+1;
            }
            else if(nums[m]>target)
            {
                r=m-1;
            }
        }
        n[0]=fi;
        n[1]=la;
        return n;

    }
}