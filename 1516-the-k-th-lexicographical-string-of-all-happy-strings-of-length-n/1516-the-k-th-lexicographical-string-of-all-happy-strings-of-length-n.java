class Solution {
    public String getHappyString(int n, int k) {
        List<String>list=new ArrayList<>();
        backtrack(n,list,new StringBuilder());
        return list.size()>=k? list.get(k-1):"";
    }
    public void backtrack(int n,List<String>list,StringBuilder sb){
        if(sb.length()==n){
            list.add(sb.toString());
            return;
        }
        if(sb.length()==0 || sb.charAt(sb.length()-1)!='a'){
            sb.append('a');
            backtrack(n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length()==0 || sb.charAt(sb.length()-1)!='b'){
            sb.append('b');
            backtrack(n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if( sb.length()==0 || sb.charAt(sb.length()-1)!='c'){
            sb.append('c');
            backtrack(n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}