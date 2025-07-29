class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
    public void backtrack(int idx,int nums[],List<Integer>list,Set<List<Integer>>set){
        if(idx==nums.length){
            
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        backtrack(idx+1,nums,list,set);
        list.remove(list.size()-1);
        backtrack(idx+1,nums,list,set);
    }
    
}