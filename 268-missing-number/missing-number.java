class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int t=n*(n+1)/2,hs=0;
        for(int i=0;i<n;i++)
        {
            hs+=nums[i];
        }
        return t-hs;
    }
}