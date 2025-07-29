class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int zero=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0)zero++;
        //         if(zero>k)break;
        //         int length=j-i+1;
        //         max=Math.max(max,length);
        //     }
        // }
        // return max;

        // int l=0;
        // int zero=0;
        // int max=0;
        // for(int r=0;r<nums.length;r++){
        //     if(nums[r]==0)zero++;
        //     while(zero>k){
        //       if(nums[l]==0)zero--;
        //       l++;                          
        //     }
        //     int length=r-l+1;
        //     max=Math.max(max,length);
        // }
        // return max;

        int l=0;
        int zero=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)zero++;
           if(zero<=k){
            max=Math.max(max,r-l+1);

           }else{            
            if(nums[l]==0)zero--;
            l++;
           }
        }
        return max;
    }
}