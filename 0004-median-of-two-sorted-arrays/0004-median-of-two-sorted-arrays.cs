public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.Length;
        int n2=nums2.Length;
        int n=n1+n2;
        int idx2=n/2;
        int idx1=idx2-1;
        int i=0,j=0;
        int count=0;
        int el1=0,el2=0;
        while(i<n1 && j<n2){
           if(nums1[i]>nums2[j]){
             if(count==idx1)el1=nums2[j];
             if(count==idx2)el2=nums2[j];
             j++;
             count++;
           }else{
             if(count==idx1)el1=nums1[i];
             if(count==idx2)el2=nums1[i];
             i++;
             count++;
           }
        }
        while(i<n1){
            if(count==idx1)el1=nums1[i];
            if(count==idx2)el2=nums1[i];
            i++;
            count++;
        }
        while(j<n2){
            if(count==idx1)el1=nums2[j];
            if(count==idx2)el2=nums2[j];
            j++;
            count++;
        }
        if(n%2==1){
            return el2;
        }else{
            return (double)(el1+el2)/2;
        }
    }
}