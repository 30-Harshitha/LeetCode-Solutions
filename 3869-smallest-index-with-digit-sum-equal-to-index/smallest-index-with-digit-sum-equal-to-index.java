class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        { int sum=0,r=nums[i];
            while(r!=0)
            {
                sum+=r%10;
                r/=10;
            }
            if(sum==i)
            return i;
           
        }
        return -1;
    }
}