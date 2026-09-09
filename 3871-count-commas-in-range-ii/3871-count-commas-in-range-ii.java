class Solution {
    public long countCommas(long n) {
        long res =0;
        long power = 1000;
        for(int c=1;c<=5;c++){
            res+=Math.max(0L,n-(power-1));
            power = power*1000;
        }
        return res;
    }
}