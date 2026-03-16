class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] h, int target) {
        int c=0;
        for(int i=0;i<h.length;i++)
        {
            if(h[i]>=target)
            {
                c++;
            }
        }
        return c;
    }
}