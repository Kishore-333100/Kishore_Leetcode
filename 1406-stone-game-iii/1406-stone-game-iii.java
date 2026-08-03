class Solution {
    Integer[] dp;
    public String stoneGameIII(int[] stoneValue) {
        
        dp = new Integer[stoneValue.length];
        int diff = dfs(stoneValue,0);
        if(diff>0)
            return "Alice";
        else if (diff<0)
            return "Bob";
        else
            return "Tie";
    }
    
    private int dfs(int[] stoneValue,int i){
        if(i>=stoneValue.length)
            return 0;
        if(dp[i]!=null)
            return dp[i];

        int res = Integer.MIN_VALUE;
        int sum=0;
        for(int j=i;j<Math.min(i+3,stoneValue.length);j++){
            sum+= stoneValue[j];
            res= Math.max(res, sum - dfs(stoneValue,j+1));
        }
        dp[i] =res;
        return res;
    }
}