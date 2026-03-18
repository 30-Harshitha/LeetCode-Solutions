class Solution {
    public int countDigits(int num) {
        int n=num,c=0;
        while(num!=0)
        {
           if(n%(num%10)==0)
           {
            c++;
           }
           num=num/10;
        }
        return c;
        
    }
}