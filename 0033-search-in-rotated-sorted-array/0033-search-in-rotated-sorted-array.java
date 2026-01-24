class Solution {
    public int search(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)return mid;
            else if(arr[start]<=arr[mid]){
                if(arr[start]<=target && arr[mid]>=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=target && arr[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}