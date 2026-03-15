class Solution {
    public boolean checkIfPangram(String s) {
        if (s.length() < 26)
            return false;

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            if (!s.contains(String.valueOf(ch)))
                return false;
        }
        return true;
    }
}