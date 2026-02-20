import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
            if (num > 0) {
                set.add(num);
            }
        }

        // If we have positive numbers, sum them
        if (!set.isEmpty()) {
            int sum = 0;
            for (int num : set) {
                sum += num;
            }
            return sum;
        }

        // If all numbers are negative, return the maximum
        return max;
    }
}