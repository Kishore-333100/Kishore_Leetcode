class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i =0;i<s.length()-1;i++){
        int a = Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'));
        if(a>2) return false;
        }
    return true;
    }
}