class Solution {
public:
    int minElement(vector<int>& nums) {
        int min=INT_MAX;
        for(auto n:nums)
        { int sum=0;
            while(n!=0)
            {
                sum+=n%10;
                n=n/10;
            }
            if(min>sum)
            min=sum;
        }
        return min;
    }
};