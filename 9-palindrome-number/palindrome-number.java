class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int t=0,r=0;
        if(num<0)
        return false;
        while(x!=0)
        {
            r=x%10;
            t=t*10+r;
            x=x/10;
        }
        if(num==t)
        return true;
        else
        return false;
    }
}
        