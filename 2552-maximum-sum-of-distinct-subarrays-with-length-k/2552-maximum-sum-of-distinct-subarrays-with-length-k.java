class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    //    HashMap<Integer,Integer>map=new HashMap<>();
    //    long sum=0,max=0;
    //    for(int i=0;i<nums.length;i++){
    //     sum+=nums[i];
    //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);

    //     if(i>=k-1){
    //         if(map.size()==k)max=Math.max(max,sum);
    //         sum-=nums[i-k+1];
    //         map.put(nums[i-k+1],map.get(nums[i-k+1])-1);
    //         if(map.get(nums[i-k+1])==0)map.remove(nums[i-k+1]);
    //     }     
    //    }
    //    return max;
       
    HashSet<Integer>set=new HashSet<>();
    long sum=0,max=0;
    int left=0;
    for(int right=0;right<nums.length;right++){
        while(set.contains(nums[right])){
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
        set.add(nums[right]);
        sum+=nums[right];
        if(right-left+1==k){
            max=Math.max(max,sum);
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
    }
    return max;

    }
}