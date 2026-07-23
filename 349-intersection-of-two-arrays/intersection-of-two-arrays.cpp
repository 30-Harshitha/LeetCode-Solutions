class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> s;
        set<int> s1;
        int i=0;
        for(int i=0;i<nums1.size();i++)
        {
            s.insert(nums1[i]);
        }
        for(int c:nums2)
        {
            if(s.contains(c))
            s1.insert(c);
        }
        vector<int> res;
        for(int d:s1)
        {
            res.push_back(d);
        }
        
        return res;

    }
};