class Solution {
    public int subtractProductAndSum(int n) {
        int r=0,num=1,n1=0;
        while(n!=0)
        {
            r=n%10;
            num*=r;
            n1+=r;
            n=n/10;
        }
        return num-n1;
    }
}