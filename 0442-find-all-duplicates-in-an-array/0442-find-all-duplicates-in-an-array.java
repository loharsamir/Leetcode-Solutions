class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer>list=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i]);
            int idx=val-1;
            if(nums[idx]<0)list.add(val);
            else nums[idx]=-nums[idx];
         }
         return list;
    }
}