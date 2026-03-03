class Solution {
    public String restoreString(String s, int[] indices) {
        char []c=new char[s.length()];
        char st;
        int vl=0;
        for(int i=0;i<s.length();i++)
        {
            st=s.charAt(i);
            vl=indices[i];
            c[vl]= st;
        }
        return new String(c);
    }
}