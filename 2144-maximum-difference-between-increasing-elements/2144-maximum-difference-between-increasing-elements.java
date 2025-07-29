class Solution {
    public int maximumDifference(int[] nums) {
        // int max=-1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]-nums[i]==0)continue;
        //         max=Math.max(max,nums[j]-nums[i]);
        //     }
        // }
        // return max;

        int min=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                diff=Math.max(diff,nums[i]-min);
            }else{
                min=nums[i];
            }
        }
        return diff;
    }
}