class Solution {
    public int maximumWealth(int[][] acc) {
        int max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<acc.length;i++)
        {   s=0;
            for(int j=0;j<acc[i].length;j++)
            {
                s+=acc[i][j];
            }
            max=Math.max(max,s);
        }
        return max;
    }
}