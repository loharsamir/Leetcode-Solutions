public class Solution {
    public int SplitArray(int[] nums, int k) {
        int left=nums.Max();
        int right=nums.Sum();
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=1;
            int sum=0;
            foreach(int i in nums){
                sum+=i;
                if(sum>mid){
                    count++;
                    sum=i;
                }
            }
            if(count<=k){
                ans=mid;
                right=mid-1;
            }else{
                
                left=mid+1;
            }
        }
        return ans;
    }
}