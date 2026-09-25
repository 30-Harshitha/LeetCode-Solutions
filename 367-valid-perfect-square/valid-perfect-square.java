class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        int l=1,r=num/2,m=0;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if((long)m*m==num)
            return true;
            else if((long)m*m>num)
            r=m-1;
            else if(m*m<num)
            l=m+1;
        }
        return false;
    }
}