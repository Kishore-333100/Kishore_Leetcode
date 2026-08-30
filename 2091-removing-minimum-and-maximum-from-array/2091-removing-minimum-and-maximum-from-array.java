class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[min]) min=i;
            if(nums[i]>nums[max]) max=i;
        }
        int left = Math.min(min,max);
        int right = Math.max(min,max);
        int front = right + 1;

        // Remove both from the back
        int back = n - left;

        // Remove one from each side
        int frontBack = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, frontBack));
    }
}