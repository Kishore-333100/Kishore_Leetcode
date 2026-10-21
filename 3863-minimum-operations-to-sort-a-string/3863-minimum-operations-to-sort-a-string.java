class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        char[] c = s.toCharArray();
        for(int i=1;i<n;i++){
            if(c[i]<c[i-1]) {
                sorted=false;
                break;
            }
        }
        if(sorted) return 0;
        if(n==2) return -1;
        char max='a',min='z';
        for(char ch:c){
            if(ch<min) min=ch;
            if(ch>max) max=ch;
        }
        if(c[0]==min || c[n-1]==max) return 1;
        int maxC=0,minC=0;
        for(char ch:c){
            if(ch==min) minC++;
            if(ch==max) maxC++;
        }
        if(c[0]==max && maxC==1 && c[n-1]==min && minC==1){
            return 3;
        }
    return 2;
    }
}