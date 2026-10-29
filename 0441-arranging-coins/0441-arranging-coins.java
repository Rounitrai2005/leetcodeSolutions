class Solution {
    public int arrangeCoins(int n) {
        long low=0;
        long high=n;
        int row=0;
        while(low<=high){
            long mid=low + (high-low)/2;
            long coins=mid*(mid+1)/2;
            if(coins<=n){
                row=(int) mid;
            }
            if(coins>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return row;
    }
}