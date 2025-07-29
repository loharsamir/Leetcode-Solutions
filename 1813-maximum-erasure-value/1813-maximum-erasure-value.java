class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        //map.put(0,1);
        int l=0;
        int max=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            sum+=nums[r];
            while( map.get(nums[r])>1 ){
                
                    map.put(nums[l],map.get(nums[l])-1);
                    sum-=nums[l];
                    l++;
                    
                
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}