class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int mid = nums[nums.length/2];
        int moves=0;
        for(int n:nums) Math.min(n,min);
        for(int n:nums) moves+=Math.abs(mid-n);
        return moves;
    }
}