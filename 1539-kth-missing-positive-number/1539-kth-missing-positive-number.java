class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        int j=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        while(count<k){
            if(!set.contains(j)){
                count++;
            }
            if(count==k){
                return j;
            }
            j++;
        }
        return -1;
    }
}