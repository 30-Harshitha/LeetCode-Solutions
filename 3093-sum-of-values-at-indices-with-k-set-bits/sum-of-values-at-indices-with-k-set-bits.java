class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0,c=0,l=0;
        for(int i=0;i<nums.size();i++)
        {  
            l=i;c=0;
            while(l!=0)
            {
            if(l%2==1)
            c++;
            l/=2;
            }
            if(c==k)
            sum+=nums.get(i);
        }
        return sum;
    }
}