class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])count++;
        //     }
        // }
        // return count;

        int[] freq=new int[101];
        int count=0;
        for(int i:nums){
            count+=freq[i];
            freq[i]++;
        }
        return count;
    }
}