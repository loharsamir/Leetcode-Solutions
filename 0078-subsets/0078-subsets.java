class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int idx,int[] nums,List<Integer> curr,List<List<Integer>>result){
        if(idx==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        backtrack(idx+1,nums,curr,result);

        curr.remove(curr.size()-1);

        backtrack(idx+1,nums,curr,result);
    }
}