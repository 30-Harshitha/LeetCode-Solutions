class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;

        while(n!=0)
        {
            if(n%2==0)
            {c=1;
              n=n/2;
            }
            else
            {c=0;
            break;}
        }
        if(c==1||n==1)
        return true;
        else
        return false;
    }
}