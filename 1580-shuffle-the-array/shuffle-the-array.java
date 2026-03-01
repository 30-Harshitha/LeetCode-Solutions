class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[2*n];
        int i,j;
        for(i=0;i<n;i++)
        {
           a[i]=nums[i];
        }
        for(j=0;j<n;j++)
        {
            b[j]=nums[i++];
        }
        i=0;
        j=0;
        while(j<n)
        {
            c[i++]=a[j];
            c[i++]=b[j];
            j++;
        }
        return c;
    }
}