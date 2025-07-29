class Solution {
    public int[] buildArray(int[] nums) {
        // int n=nums.length;
        // int[] ans= new int[n];
        // for(int i=0;i<n;i++){
        //     ans[i]=nums[nums[i]];
        // }
        // return ans;

        int n=nums.length;
        for(int i=0;i<n;i++){
            int newVal=nums[nums[i]]%n;
            nums[i]=nums[i]+n*newVal;
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }
        return nums;
    }
}