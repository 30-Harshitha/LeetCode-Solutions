class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        int c=0;
        ans[0]=0;
        for(int i=1;i<=n;i++)
        {  
            c=0;
            int t=i;
            while(t!=0)
            {
            c+=t%2;
            t/=2;
            }
            ans[i]=c;
        }
        return ans;
    }
}