class Solution {
    public int totalNumbers(int[] digits) {
        int n =digits.length;
        boolean[] seen = new boolean[1000];
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(j==i) continue;
                for(int k=0;k<n;k++){
                    if(k==j||k==i) continue;
                    int num = (digits[i]*100) + (digits[j]*10)+digits[k];
                    if(num%2==0){
                        seen[num]=true;
                    }
                }
            }
        }
        int count=0;
        for(boolean exists:seen){
            if(exists){
                count++;
            }
        }
        return count;
    }
}