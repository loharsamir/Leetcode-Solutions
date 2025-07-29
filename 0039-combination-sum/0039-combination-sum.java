class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void backtrack(int idx,int[] candidates,int target,List<List<Integer>>ans,List<Integer>list){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
                 
            }
           return;
        }

        if(candidates[idx]<=target){
            list.add(candidates[idx]);
            backtrack(idx,candidates,target-candidates[idx],ans,list);
            list.remove(list.size()-1);
        }
        backtrack(idx+1,candidates,target,ans,list);
    }
}