class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(1,k,n,ans,new ArrayList<>());
        return ans;
    }
    public void backtrack(int start,int k,int n,List<List<Integer>>ans,List<Integer>list){
        if(list.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>n)break;
            
            
            list.add(i);
            backtrack(i+1,k,n-i,ans,list);
            list.remove(list.size()-1);
            
            
        }
    }
}