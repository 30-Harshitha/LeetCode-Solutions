class Solution {
    public boolean judgeCircle(String m) {
        int l=0,w=0;
        for(int i=0;i<m.length();i++)
        {
            if(m.charAt(i)=='L')
            l++;
            if(m.charAt(i)=='R')
            l--;
            if(m.charAt(i)=='U')
            w++;
            if(m.charAt(i)=='D')
            w--;

        }
        if(l==0&&w==0)
        return true;
        else
        return false;
    }
}