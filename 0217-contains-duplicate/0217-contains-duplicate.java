class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // //if(map.containsValue())
        // for(int i:map.values()){
        //     if(i>=2)return true;
        // }
        // return false;
        Arrays.sort(nums);
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }
        return false;
        


    }
}