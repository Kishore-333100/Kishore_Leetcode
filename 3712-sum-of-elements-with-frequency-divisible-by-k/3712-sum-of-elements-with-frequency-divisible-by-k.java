class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int sum =0;
        for(int num :hm.keySet()){
            if(hm.get(num)%k==0)    sum+= num*hm.get(num);
        }
            return sum;
        }
}