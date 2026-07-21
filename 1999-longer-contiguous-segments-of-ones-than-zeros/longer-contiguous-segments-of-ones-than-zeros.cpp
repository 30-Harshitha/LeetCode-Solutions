class Solution {
public:
    bool checkZeroOnes(string s) {
        int max1=0,max2=0,o=0,z=0;
        for(char c:s)
        {
            if(c=='1')
            {o++;
            z=0;
            }
            max1=max(o,max1);
            if(c=='0') 
           { z++;
             o=0;
           }
           max2=max(z,max2);
        }
        if(max1>max2)
        return true;
        else
        return false;
    }
};