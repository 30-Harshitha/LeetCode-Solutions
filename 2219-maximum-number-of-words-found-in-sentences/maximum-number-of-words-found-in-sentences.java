class Solution {
    public int mostWordsFound(String[] s) {
        int max=Integer.MIN_VALUE;
        int c=1;
        for(int i=0;i<s.length;i++)
        {   c=1;
            s[i]=s[i].trim();
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)==' ')
                {
                    c++;
                }
            }
           max= Math.max(max,c);
        }
        return max;
    }
}