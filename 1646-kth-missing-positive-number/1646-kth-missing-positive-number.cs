public class Solution {
    public int FindKthPositive(int[] arr, int k) {
        int count=0;
        for(int i=1;i<=10000;i++){
            int left=0,right=arr.Length-1;
             int ans=0;
            
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==i){
                    ans=arr[mid];
                    break;
                }else if(arr[mid]>i){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            if(ans!=i)count++;
            if(count==k)return i;
        }
        return -1;
    }
}