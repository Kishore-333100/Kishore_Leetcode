class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int n:nums) max=Math.max(n,max);
        int moves=0;
        for(int n:nums) moves+=max-n;
    return moves;
    }

}