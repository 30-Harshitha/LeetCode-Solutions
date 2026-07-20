class Solution {
public:
    bool checkIfPangram(string s) {
       int f[26]={0};
       for(int i=0;i<s.size();i++)
       {
            f[s[i]-'a']++;
       }
       for(int i=0;i<26;i++)
       {
        if(f[i]==0)
        return false;
       }
       return true;
    }
};