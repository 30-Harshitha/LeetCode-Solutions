class Solution {
public:
    int minimumChairs(string s) {
        int c=0,max=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='E')
            c++;
            if(max<c)
            max=c;

            if(s[i]=='L')
            c--;
        
        }
        return max;
    }
};