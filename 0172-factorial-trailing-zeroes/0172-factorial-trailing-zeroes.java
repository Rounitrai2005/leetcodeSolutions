class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>5){
            count += n/5;
            n/=5;
        }
        if(n==5){
            count += 1;

        }
        
        return count;
        
    }
}