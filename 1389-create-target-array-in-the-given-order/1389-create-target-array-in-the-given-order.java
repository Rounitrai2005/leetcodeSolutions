class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=index[i];
            for(int j=i;j>a;j--){
                result[j]=result[j-1];
            }
            result[a]=nums[i];
        }
        return result;
    }
}