class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        int i=0;
        char temp;
        while(i<j)
        {
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        
    }
}