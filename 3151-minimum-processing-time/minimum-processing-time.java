class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        Collections.sort(processorTime);                    // Ascending
        Collections.sort(tasks, Collections.reverseOrder()); // Descending

        int ans = 0;

        for (int i = 0; i < processorTime.size(); i++) {
            ans = Math.max(ans, processorTime.get(i) + tasks.get(i * 4));
        }

        return ans;
    }
}