class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int l=0;
        int ones=0;
        String ans="";
        for(int r=0;r<n;r++){
            if(s.charAt(r)=='1'){
                ones++;
            }
            while(ones>k){
                if(s.charAt(l)=='1') {
                    l++;
                }
                    ones--;
                
            }
            if(ones==k){
                while(l<r&&s.charAt(l)=='0'){
                    l++;
                }
            
            String current = s.substring(l,r+1);
            if(ans.isEmpty()|| current.length()<ans.length()||(current.length()==ans.length())&& current.compareTo(ans)<0){
                ans =current;
            }
            }
        }
        return ans;
    }
}