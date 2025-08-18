public class Solution {
    public int[] SearchRange(int[] nums, int target) {
        int left=0,right=nums.Length-1;
        int starting=-1,ending=-1;
        int[] arr=new int[2];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                starting=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){    
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        left=0;right=nums.Length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ending=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){    
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        arr[0]=starting;
        arr[1]=ending;
        return arr;
    }
}