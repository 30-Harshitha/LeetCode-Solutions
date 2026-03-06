class Solution {
    public int reverse(int x) {
        int num=x,r=0,s=0;
        
        while(x!=0)
        {
            r=x%10;
            if(s>Integer.MAX_VALUE/10||s<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            s=s*10+r;
            x=x/10;
        }
        if(num<0)
        return s;
        else if(s<0)
        return Integer.parseInt("s");
        else
        return s;
    }
}