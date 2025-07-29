class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=1;i<nums.length;i++){
            int diff=Math.abs(nums[i]-nums[i-1]);
            max=Math.max(max,diff);
        }
        return Math.max(max,Math.abs(nums[0]-nums[nums.length-1]));
    }
}