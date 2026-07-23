class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,m=1;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                m=(nums[i]-1)*(nums[j]-1);
                 max=Math.max(m,max);
            }
           
        }
        return max;
    }
}