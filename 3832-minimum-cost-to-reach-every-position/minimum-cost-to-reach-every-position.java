class Solution {
    public int[] minCosts(int[] cost) {
        int j=0;
        int[] c=new int[cost.length];
        c[j]=cost[0];
        for(int i=1;i<cost.length;i++)
        {
            if(c[j]<cost[i])
            c[++j]=c[j-1];
            else
            c[++j]=cost[i];
        }
     return c;   
    }
}