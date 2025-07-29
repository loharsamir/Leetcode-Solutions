class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r])>k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}