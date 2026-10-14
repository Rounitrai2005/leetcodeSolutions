class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i+1==nums.length){
                break;
            }
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int a=0;
        int b=0;
        while(b<nums.length){
            if(nums[b]!=0){
                int temp=nums[b];
                nums[b]=nums[a];
                nums[a]=temp;
                a++;
            }
            b++;
        }
        return nums;
    }
}