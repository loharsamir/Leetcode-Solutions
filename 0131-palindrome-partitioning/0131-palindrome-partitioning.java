class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        backtrack(0,s,list,ans);
        return ans;
    }
    public void backtrack(int idx,String s,List<String>list,List<List<String>>ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                list.add(s.substring(idx,i+1));
                backtrack(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}