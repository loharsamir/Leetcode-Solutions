class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int count=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans)count++;
            else{
                count=1;
                ans=nums[i];
            }
            if(count>nums.length/3){
                if(list.contains(nums[i]))continue;
                list.add(nums[i]);
            }    
        }
        return list;

        // List<Integer>list=new ArrayList<>();
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)>nums.length/3)list.add(key);
        // }
        // return list;
    }
}