class Solution {
    public int subarray(int[] nums,int goal){
        int l=0;
        int sum=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1)sum++;
            while(sum>goal && r>=l){               
                if(nums[l]==1)sum--;
                l++;
            }
             count+=r-l+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        return subarray(nums,goal)-subarray(nums,goal-1);
    }
}