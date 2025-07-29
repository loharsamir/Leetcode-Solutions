class Solution {
    public List<String> validStrings(int n) {
        List<String>list=new ArrayList<>();
        backtrack(n,list,new StringBuilder());
        return list;
    }
    public void backtrack(int n,List<String>list,StringBuilder sb){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        sb.append('1');
        backtrack(n,list,sb);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0 || sb.charAt(sb.length()-1)=='1'){
            sb.append('0');
            backtrack(n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}