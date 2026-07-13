class Solution {
    public int sumBase(int n, int k) {
        int r=0,s=0;
        while(n!=0)
        {
            r=n%k;
            s+=r;
            n/=k;
        }
        return s;
    }
}