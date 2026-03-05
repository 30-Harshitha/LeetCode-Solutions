class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=0,s=0;
        for(i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                s+=i;
            }
        }
        if(s==num)
        return true;
        else
        return false;
    }
}