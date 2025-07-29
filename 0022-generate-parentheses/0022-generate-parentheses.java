class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        backtrack(n,n,list,new StringBuilder());
        return list;
    }
    public void backtrack(int open,int close, List<String>list,StringBuilder sb){
        if(open==0 && close==0){
            list.add(sb.toString());
            return;
        }
        if(open!=0){
            sb.append('(');
            backtrack(open-1,close,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open<close){
            sb.append(')');
            backtrack(open,close-1,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}