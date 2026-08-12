class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res = k;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == res) {
                res += k;
                i = -1;   
            }
        }

        return res;
    }
}