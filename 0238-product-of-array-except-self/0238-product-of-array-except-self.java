class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]*pre[i-1];
        }
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=nums[i]*suf[i+1];
        }
       
        nums[0]=suf[1];
        nums[nums.length-1]=pre[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            nums[i]=pre[i-1]*suf[i+1];
        }
        return nums;
    }
}