class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n:nums) min = Math.min(n,min);
        int moves=0;
        for(int n:nums) moves+=n-min;
        return moves;
    }
}