class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int freq=0;
        //     if(map.containsKey(nums[i]+1)){
        //         freq=map.get(nums[i]+1)+map.get(nums[i]);
        //     }
        //     max=Math.max(max,freq);
        // }

        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                max=Math.max(max,map.get(key)+map.get(key+1));
            }
        }
        return max;
        
    }
}