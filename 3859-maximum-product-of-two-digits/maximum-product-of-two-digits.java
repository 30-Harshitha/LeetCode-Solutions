class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int max=0,m=1;
        while(n!=0)
        {
            a.add(n%10);
            n/=10;
        }
        for(int i=0;i<a.size()-1;i++)
        {
            
            for(int j=i+1;j<a.size();j++)
            {
                m=a.get(i)*a.get(j);
                if(max<m)
            max=m;
            }
            

        }
        return max;
    }
}