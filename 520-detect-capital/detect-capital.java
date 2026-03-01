class Solution {
    public boolean detectCapitalUse(String word) {
        int i=0,c=0;
        while(i<word.length())
        {   
            char ch=word.charAt(i);

            if(Character.isUpperCase(ch))
            c++;
             i++;
        }
        if(c==word.length())
        {
            return true;
        }
        else if(c==0)
        {
            return true;
        }
        else if(c==1&&Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        else
        return false;
       
    }
}