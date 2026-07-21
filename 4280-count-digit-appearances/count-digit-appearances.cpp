class Solution {
public:
    int countDigitOccurrences(vector<int>& nums, int digit) {
        int c=0;
        for(auto r:nums)
        {
            while(r!=0)
            {
                if(r%10==digit)
                c++;
                r/=10;
            }
        }
        return c;
    }
};