class Solution {
    public int differenceOfSum(int[] n) {
        int sum=0,s=0,r=0;
        for(int i=0;i<n.length;i++)
        {
            sum+=n[i];
            while(n[i]!=0)
            {
                s+=n[i]%10;
                n[i]=n[i]/10;
            }

        }
        r=Math.abs(sum-s);
        return r;
        
    }
}