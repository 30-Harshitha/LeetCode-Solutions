import java.util.*;

class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> m = new HashMap<>();
        
        // Count frequency
        for (char x : s.toCharArray()) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        int distinct = m.size();
        
        if (distinct <= k) {
            return 0;
        }

        // Get all frequencies
        List<Integer> freq = new ArrayList<>(m.values());
        
        // Sort in ascending order
        Collections.sort(freq);

        int deletions = 0;
        int removeCount = distinct - k;

        // Remove smallest frequencies first
        for (int i = 0; i < removeCount; i++) {
            deletions += freq.get(i);
        }

        return deletions;
    }
}
