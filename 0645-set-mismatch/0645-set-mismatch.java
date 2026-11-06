class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        int[] arr = new int[2];

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {

                arr[0] = nums[index];      
                arr[1] = index + 1;        

                break;
            }
        }

        return arr;
    }
}