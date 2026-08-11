class Solution {
public int majorityElement(int[] nums) {
     HashMap <Integer,Integer> hm = new HashMap<>();
     int n = nums.length;
     for(int ele:nums){
        if(hm.containsKey(ele)){
            hm.put(ele,hm.get(ele)+1);
        }else{
            hm.put(ele,1);
        }
     }
     for(int ele:nums){
        if(hm.get(ele)>n/2) return ele;
     }
     return 0;
    }
}