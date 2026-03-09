class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char ch,c,temp;
        int i=0;
        int j=s.length()-1;
          char[] a = s.toCharArray();
       while(i<j)
        {
           
            if(!vowels.contains(a[i])&&(!(vowels.contains(a[j]))))
            {
                i++;
                j--;
            }
            if(vowels.contains(a[i])&&(!(vowels.contains(a[j]))))
            {
                j--;
            }
             if(!vowels.contains(a[i])&&(vowels.contains(a[j])))
            {
                i++;
            }
            
            else if(vowels.contains(a[i])&&vowels.contains(a[j]))
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;j--;
                
            }
            
            
        }
        return new String(a);
    }
}