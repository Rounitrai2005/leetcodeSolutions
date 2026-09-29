class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=0;
        int i=0;
        int j=0;
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            sum=sum+nums[j];
            average=sum/k;
            if((j-i+1)<k){
                j++;
            }
            else{
                max=Math.max(max,average);
                sum=sum-nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}