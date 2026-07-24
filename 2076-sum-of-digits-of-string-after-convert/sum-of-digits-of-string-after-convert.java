class Solution {
    public int getLucky(String s, int k) {

        int sum = 0;
        for (char c : s.toCharArray()) {

            int val = c - 'a' + 1;

            while (val > 0) {
                sum += val % 10;
                val /= 10;
            }
        }
        k--;

        while (k-- > 0) {

            int temp = 0;

            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }

            sum = temp;
        }

        return sum;
    }
}