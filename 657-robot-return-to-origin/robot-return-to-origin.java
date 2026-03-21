class Solution {
    public boolean judgeCircle(String m) {
        int l=0,w=0;
        for(int i=0;i<m.length();i++)
        {
            if(m.charAt(i)=='U')
            l++;
            else if(m.charAt(i)=='L')
            w--;
            else if(m.charAt(i)=='D')
            l--;
            else if(m.charAt(i)=='R')
            w++;
        }
        if(l==0&&w==0)
        return true;
        else
        return false;
    }
}