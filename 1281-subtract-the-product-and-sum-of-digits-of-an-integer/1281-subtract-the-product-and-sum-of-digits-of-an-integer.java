class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int result=0;
        
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n=n/10;
            }
        result=product-sum;
        return result;
    }
}