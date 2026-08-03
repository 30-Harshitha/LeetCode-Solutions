class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> m = new HashMap<>();

        // Count frequency
        for (int c : nums) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        // Convert int[] to Integer[]
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort by frequency ascending,
        // and value descending if frequencies are equal
        Arrays.sort(arr, (a, b) -> {
            if (!m.get(a).equals(m.get(b))) {
                return m.get(a) - m.get(b);
            }
            return b - a;
        });

        // Convert back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}