class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
       
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                max=Math.max(max,sum);
            }else{
                sum=nums[i];
               
            }
        }
        // if(count==nums.length-1)return nums[0];
        return max;
    }
}