class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int[] merged=new int[n1+n2];
        int m=merged.length;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }  
        while(i<n1){
            merged[k++]=nums1[i++];
        }
        while(j<n2){
            merged[k++]=nums2[j++];
        }
        if(m%2==0){
            return (merged[m/2]+merged[(m-1)/2])/2.0;
        }else{
            return merged[m/2];
        }
        
        
    }
}