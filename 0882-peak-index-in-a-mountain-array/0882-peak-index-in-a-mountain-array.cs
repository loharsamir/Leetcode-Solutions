public class Solution {
    public int PeakIndexInMountainArray(int[] arr) {
        int n=arr.Length;
        int left=0;
        int right=n-1;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid+1]>arr[mid]){
                 //ans=mid+1;
                 left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}