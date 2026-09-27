class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[x];
                nums[x]=temp;
                x++;
            }
        }
        return nums;
    }
}