class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=nums.length/3;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}