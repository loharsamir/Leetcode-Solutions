class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int l=0;
         int product=1;
         int count=0;
         for(int r=0;r<nums.length;r++){
            product*=nums[r];
            while(product>=k && r>=l){
                product/=nums[l];
                l++;
            }
            count+=r-l+1;
         }
         return count;
    }
}