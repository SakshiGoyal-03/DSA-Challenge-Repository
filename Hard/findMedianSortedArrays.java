package Hard;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] k = new int[nums1.length + nums2.length];
        int index = 0;
        int i =0;
        int j= 0;
        while(i < nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                k[index] = nums1[i];
                index++;
                i++;
            }
            else if(nums1[i] > nums2[j]){
               k[index] = nums2[j];
               index++;
               j++;
            }
            else{
                
                k[index] = nums1[i];
                index++;
                k[index] = nums2[j];
                i++;
                j++;
                index++;
            }
        }
        while(i<nums1.length){
            k[index] = nums1[i];
            i++;
            index++;
        }
        while(j<nums2.length){
            k[index] = nums2[j];
            j++;
            index++;
        }
        float median ; 
        if(index %2 == 0)
        {
            float med = k[index/2] + k[index/2 - 1];
            median = med/2;
        }
        else{
           median = k[index/2];
        }
        return median;
        
    }
}
