class Solution {
public:
    int finalValueAfterOperations(vector<string>& o) {
        int X=0;
        for(auto c:o)
        {
            if((c=="--X")||(c=="X--"))
            X-=1;
            else if(c=="X++"||c=="++X")
            X+=1;
        }
        return X;
    }
};