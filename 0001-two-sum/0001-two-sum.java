class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                   arr[0]=i;
                   arr[1]=j;
                   return arr;
                }
            }
        }
        return arr;
       

        // int[] ans =new int[2];
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int need= target-nums[i];
        //     if(map.containsKey(need)){
        //         ans[0]=i;
        //         ans[1]=map.get(need);
        //         break;
        //     }
        //     map.put(nums[i],i);

        // }
        // return ans;
    }
} 
