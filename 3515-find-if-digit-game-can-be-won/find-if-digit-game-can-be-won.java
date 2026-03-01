class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleSum += num;
            } else {
                doubleSum += num;
            }
        }

        // Alice can choose either single-digit or double-digit numbers
        return singleSum > doubleSum || doubleSum > singleSum;
    }
}