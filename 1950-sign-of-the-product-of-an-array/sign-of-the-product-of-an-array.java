class Solution {
    public int arraySign(int[] n) {
        int negativeCount = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                return 0;
            }
            if (n[i] < 0) {
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}