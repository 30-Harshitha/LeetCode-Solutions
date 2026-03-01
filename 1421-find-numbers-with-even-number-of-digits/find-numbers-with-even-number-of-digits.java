class Solution {
    public int findNumbers(int[] nums) {
        int co=0;
       for(int i=0;i<nums.length;i++)
        {
             int c=0,r=0;
             while(nums[i]!=0)
        {
            r=nums[i]%10;
            c++;
            nums[i]/=10;
        }
        if(c%2==0)
        {
            co++;
        }
        }
        return co;
    }
}