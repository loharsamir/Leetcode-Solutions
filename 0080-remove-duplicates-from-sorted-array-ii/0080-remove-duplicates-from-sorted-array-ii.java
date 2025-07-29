class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=0;
        int i=0;
        while(i<nums.length){
            int curr=nums[i];
            int count=0;
            while(i<nums.length && nums[i]==curr){
                count++;
                i++;
            }
            if(count>=2){
                nums[idx++]=curr;
                nums[idx++]=curr;
            }
            if(count==1)nums[idx++]=curr;
        }
        return idx;
    }
}