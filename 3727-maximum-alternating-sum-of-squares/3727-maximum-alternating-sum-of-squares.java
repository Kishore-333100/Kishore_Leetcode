class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long score=0;
        for(int i=0;i<n;i++) nums[i]=nums[i]*nums[i];
        Arrays.sort(nums);
        int half = n/2;
        for(int i=0;i<n;i++){
            if(half>i) score-=nums[i];
            else score+=nums[i];
        }
        return score;
    }
}