class Solution {
public:
    int maxPower(string s) {
        int m=1,c=1;
        for(int i=0;i<s.size()-1;i++)
        {  
            if(s[i]==s[i+1])
            c++;
            else 
            c=1;
            if(c>m)
            m=c;
        }
        
        return m;
     }  
};
