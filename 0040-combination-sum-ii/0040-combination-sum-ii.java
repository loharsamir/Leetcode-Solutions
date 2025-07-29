class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {      Arrays.sort(candidates);
       List<List<Integer>>ans=new ArrayList<>();
        backtrack(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void backtrack(int idx,int[] candidates,int target,List<List<Integer>>ans,List<Integer>list){
        
            if(target==0){
                ans.add(new ArrayList<>(list));
                 return;
            }
           
        
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;

            list.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],ans,list);
            list.remove(list.size()-1);
        }

       
    }
}