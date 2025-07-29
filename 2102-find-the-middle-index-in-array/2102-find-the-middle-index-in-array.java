class Solution {
    public int findMiddleIndex(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1]+nums[i];
        }
        if(nums.length==1)return 0;
        if( suf[1]==0)return 0;
        
        for(int i=1;i<nums.length-1;i++){
            if(pre[i-1]==suf[i+1]){
                return i;
            }
        }
        if( pre[nums.length-2]==0)return nums.length-1;
        return -1;

    }
}

