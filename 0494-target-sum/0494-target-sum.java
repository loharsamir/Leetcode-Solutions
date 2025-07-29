class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return backtrack(0,nums,target,0);
    }
    public int backtrack(int sum,int[] nums,int target,int idx){
        if(idx==nums.length){
            if(sum==target){
                return 1;
            }else return 0;
        }
       
        int l=backtrack(sum+nums[idx],nums,target,idx+1);
        int r=backtrack(sum-nums[idx],nums,target,idx+1);
        return l+r;
    }
}