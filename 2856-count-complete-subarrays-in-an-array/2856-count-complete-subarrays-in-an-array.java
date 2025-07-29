class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        HashSet<Integer>ans=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i;j<nums.length;j++){
                ans.add(nums[j]);
                if(set.size()==ans.size()){
                    count+=(nums.length-j);
                    break;
                }
            }
            ans.clear();
           
        }
        return count;
    }
}