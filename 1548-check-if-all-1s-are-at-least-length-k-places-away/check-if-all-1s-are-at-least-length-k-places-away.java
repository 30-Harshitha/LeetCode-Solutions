class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c = 0, o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (o == 0) {   // first 1
                    o++;
                } 
                else if (c >= k) {   // enough zeros between 1s
                    o++;
                } 
                else {   // not enough zeros
                    return false;
                }
                c = 0;   // reset zero counter after every 1
            } 
            else {
                c++;   // count zeros
            }
        }

        return true;
    }
}