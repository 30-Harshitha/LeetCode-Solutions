class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            int l=0,m=0;
            int r=grid[i].length-1;
            while(l<=r)
            {
                m=l+(r-l)/2;
                if(grid[i][m]<0)
                r=m-1;
                else
                l=m+1;
            }
            c+=grid[i].length-l;
        }
        return c;
    }
}