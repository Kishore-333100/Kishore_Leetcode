class Solution {
    public int longestSubsequence(int[] nums) {
        int xor =0;
        boolean nonzero = false; //to check if atleast one element in th array is non zero
        for(int n:nums){ xor^=n;
        if(n!=0) nonzero=true;
        }
        if(xor!=0) return nums.length;
        return nonzero ? nums.length-1 : 0;
    }
}