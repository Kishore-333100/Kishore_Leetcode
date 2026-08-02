class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1MaAdv = currPlayAdv(nums,0,nums.length-1);
        if(player1MaAdv>=0){
            return true;
        }
        else{
            return false;
        }
    }
    private int currPlayAdv(int[] nums,int left,int right){
        // Base Case
        if(left==right)
            return nums[left];
        // Left choice    
        int chooseLeft = nums[left] - currPlayAdv(nums,left+1,right);
       //Right choice
        int chooseRight = nums[right] - currPlayAdv(nums,left,right-1);
    return Math.max(chooseLeft,chooseRight);
    }
}