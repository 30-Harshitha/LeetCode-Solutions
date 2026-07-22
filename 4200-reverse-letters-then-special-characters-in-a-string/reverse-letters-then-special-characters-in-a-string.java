class Solution {
    public String reverseByType(String s) {
        ArrayList<Character> l=new ArrayList<Character>();
        ArrayList<Character> sp=new ArrayList<Character>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            l.add(s.charAt(i));
            else
            sp.add(s.charAt(i));
        }
        Collections.reverse(l);
        Collections.reverse(sp);
        int j=0,k=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            sb.append(l.get(j++));
            else
            sb.append(sp.get(k++));
        }
        return sb.toString();
    }
}