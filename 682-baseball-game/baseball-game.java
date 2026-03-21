class Solution {
    public int calPoints(String[] ops) {
        int[] arr = new int[ops.length];
        int top = -1;

        for (String op : ops) {
            if (op.equals("+")) {
                int sum = arr[top] + arr[top - 1]; // use old top
                arr[++top] = sum;
            } 
            else if (op.equals("D")) {
                int val = 2 * arr[top]; // use old top
                arr[++top] = val;
            } 
            else if (op.equals("C")) {
                top--;
            } 
            else {
                arr[++top] = Integer.parseInt(op);
            }
        }

        int total = 0;
        for (int i = 0; i <= top; i++) {
            total += arr[i];
        }

        return total;
    }
}