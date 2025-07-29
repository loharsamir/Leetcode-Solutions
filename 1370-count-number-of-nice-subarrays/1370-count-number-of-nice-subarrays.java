class Solution {
    public int niceSubarray(int[] nums,int k){
        // int l=0;
        // int count=0;
        // int maxOdd=0;
        // for(int r=0;r<nums.length;r++){
        //     if(nums[r]%2==1)maxOdd++;
        //     while(maxOdd>=k){
        //         count+=nums.length-r;
        //         if(nums[l]%2==1)maxOdd--;
        //         l++;
        //     }
        // }
        // return count;

        int l=0;
        int count=0;
        int maxOdd=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1)maxOdd++;
            while(maxOdd>k){                
                if(nums[l]%2==1)maxOdd--;
                l++;
            }
            count+=r-l+1;
        }
        return count;

    }
    public int numberOfSubarrays(int[] nums, int k) {
         return niceSubarray(nums,k)-niceSubarray(nums,k-1);
    }
}