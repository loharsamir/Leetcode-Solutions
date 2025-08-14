public class Solution {
    public int SmallestDivisor(int[] nums, int threshold) {
        int right=nums.Max();
        int left=1;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum=0;
            foreach(int i in nums){
                double val=(double)i/mid;
                int ceil=(int)val;
                if(val>ceil)ceil++;
                sum+=ceil;
            }
            if(sum<=threshold){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}