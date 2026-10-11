class Solution {
    public int findNumbers(int[] nums) {
        int items=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int n=nums[i];
            while(n>0){
                n=n/10;
                count ++;
            }if(count%2==0){
                items++;
            }
        }
        return items;
    }
}