class Solution {
public:
    string sortVowels(string s) {
        vector<char> m;
        for(int i=0;i<s.size();i++)
        { 
            char ch=s[i];
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            m.push_back(ch);
        }
        sort(m.begin(),m.end());
        int j=0;
        for(int i=0;i<s.size();i++)
        {  
             char ch=s[i];
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             s[i]=m[j++];
        }
        return s;
    }
};