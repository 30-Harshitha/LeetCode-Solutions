class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String l=new StringBuilder(word).reverse().toString();
            if(word.equals(l))
            return word;
        }
        return "";
    }
}