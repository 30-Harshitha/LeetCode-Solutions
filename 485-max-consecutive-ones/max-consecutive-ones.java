class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int j=0,c=0;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {c++;
            if(i==nums.length-1)
            {a[j++]=c;
            }
            }
            else
            {
                a[j++]=c;
                c=0;
            }
        }
         return Arrays.stream(a).max().getAsInt();
    }
}