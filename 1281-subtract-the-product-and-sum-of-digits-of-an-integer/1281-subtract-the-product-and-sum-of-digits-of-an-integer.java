class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1,digit;
        while(n>0){
            digit = n%10;
            sum = digit+sum;
            prod=prod*digit;
            n/=10;
        }
        return prod-sum;
    }
}