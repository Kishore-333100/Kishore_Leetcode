class Solution {
    public boolean winnerSquareGame(int n) {
        // step 1 initialize table
     
     boolean[] dp = new boolean[n+1];
     //step 2  base case of recursion
     dp[0]=false;
     // step 3 remove recursions -> loop->direction -> depedent
     for(int stones=1;stones<=n;stones++){
        //Step 4  remove recurion call
        for(int i =1;i*i<=stones;i++){
            int sq = i*i;
            if(!dp[stones-sq]){
                dp[stones] = true;
            break;
            }
        }
     }
     // return final dp
     return dp[n];
    }
}