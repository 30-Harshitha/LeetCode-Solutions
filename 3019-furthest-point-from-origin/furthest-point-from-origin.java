class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int l=0,r=0,u=0;
        for(int i=0;i<m.length();i++)
        {
            if(m.charAt(i)=='L')
            l++;
            else if(m.charAt(i)=='R')
            r++;
            else
            u++;
        }
        return Math.abs(r-l)+u;
    }
}