class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        long count=0;
        int maxCount=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==max)maxCount++;
            while(maxCount>=k){
                count+=nums.length-r;
                if(nums[l]==max)maxCount--;
                l++;
            }
        }
        return count;
    }
}