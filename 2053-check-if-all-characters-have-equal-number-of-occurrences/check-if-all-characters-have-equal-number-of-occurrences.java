class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        int freq = -1;

        for (int value : m.values()) {
            if (freq == -1)
                freq = value;
            else if (value != freq)
                return false;
        }

        return true;
    }
}