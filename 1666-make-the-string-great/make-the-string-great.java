class Solution {
    public String makeGood(String s) {
        StringBuilder c = new StringBuilder(s);
        int i = 0;
        while (i < c.length() - 1) { 
            char curr = c.charAt(i);
            char next = c.charAt(i + 1);

            
            if (Character.toLowerCase(curr) == Character.toLowerCase(next) 
                && curr != next) {
                c.deleteCharAt(i);       
                c.deleteCharAt(i);       
                i = Math.max(i - 1, 0);  
            } else {
                i++;
            }
        }
        return c.toString();
    }
}