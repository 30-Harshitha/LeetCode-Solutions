class Solution {
    public int[] evenOddBit(int n) {
        int r=0,c=0,e=0,o=0;
        int[] a=new int[2];
        while(n!=0)
        {
            r=n%2;
            c++;
            if(r==1&&c%2==0)
            e++;
            else if(r==1&&c%2!=0)
            o++;
            n=n/2;
        }
        a[0]=o;
        a[1]=e;
        return a;
    }
}