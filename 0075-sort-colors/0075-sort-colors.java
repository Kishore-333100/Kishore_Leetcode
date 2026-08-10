class Solution {
    public void sortColors(int[] nums) {
        int c1=0,c2=0;
        int n = nums.length;
        for(int ele:nums){
            if(ele==0) c1++;
            if(ele==1) c2++;
        }
        for(int i=0;i<n;i++){
            if(i<c1) nums[i]=0;
            if(i>=c1 && i<c1+c2) nums[i]=1;
            if(i>=c1+c2 && i<n) nums[i]=2;
        }
    }
}