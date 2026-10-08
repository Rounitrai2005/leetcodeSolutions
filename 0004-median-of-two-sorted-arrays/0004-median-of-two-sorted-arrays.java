class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        double mid=0;
        while(i<nums1.length &&j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
                k++;
            }
            else{
                result[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            result[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            result[k]=nums2[j];
            j++;
            k++;
        }
        if(result.length %2 !=0){
            mid=result[(result.length)/2];
        }
        else{
            mid=(result[(result.length/2 -1)] + result[result.length /2])/2.0;
        }
        return mid;
    }
}