class Solution {
    public int passwordStrength(String p) {
        HashSet<Character> m=new HashSet<Character>();
        int su=0;
        for(char c:p.toCharArray())
        {
            m.add(c);
        }
        for(char c: m)
        {
            if(c>='a'&&c<='z')
            {
                su+=1;
            }
            else if(c>='A'&&c<='Z')
            su+=2;
            else if(c>='0'&&c<='9')
            su+=3;
            else
            su+=5;
        }
        return su;
    }
}