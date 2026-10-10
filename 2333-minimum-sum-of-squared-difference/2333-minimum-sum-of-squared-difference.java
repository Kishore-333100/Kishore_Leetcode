class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int k =k1+k2;
        int max = 100000;
        long[] cnt = new long[max+1];
        for(int i=0;i<n;i++){
            cnt[Math.abs(nums1[i]-nums2[i])]++;
        }
        for(int d=max;d>0&&k>0;d--){
            if(cnt[d]==0) continue;
            if(cnt[d]<=k){
                k-=cnt[d];
                cnt[d-1]+=cnt[d];
                cnt[d]=0;
            }else{
                cnt[d]-=k;
                cnt[d-1]+=k;
                k=0;
            }
        }
        long ans=0;
        for(long d=1;d<=max;d++){
            ans+=cnt[(int)d]*d*d;
        }
        return ans;
    }
}