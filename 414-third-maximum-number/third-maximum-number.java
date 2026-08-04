import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        // Remove duplicates and find distinct maximums
        int count = 1;
        int prev = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                count++;
                prev = nums[i];

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        // Third maximum doesn't exist
        return nums[nums.length - 1];
    }
}