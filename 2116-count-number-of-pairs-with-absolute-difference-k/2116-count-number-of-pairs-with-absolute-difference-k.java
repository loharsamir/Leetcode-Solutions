class Solution {
    public int countKDifference(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(Math.abs(nums[i]-nums[j])==k)count++;
        //     }
        // }
        // return count;

        HashMap<Integer,Integer>map=new HashMap<>();
        
        int count=0;
        for(int i:nums){
             map.put(i,map.getOrDefault(i,0)+1);
            if(map.containsKey(i+k)){
                count+=map.get(i+k);
            }
             if(map.containsKey(i-k)){
                count+=map.get(i-k);
            }
           
        }
        return count;
    }
}