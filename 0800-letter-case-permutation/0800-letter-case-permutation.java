class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(0,s,sb,list);
        return list;
    }
    public void backtrack(int idx,String s,StringBuilder sb,List<String>list){
        if(idx==s.length()){
            list.add(sb.toString());
            return;
        }
        char ch=s.charAt(idx);
        sb.append(ch);
        backtrack(idx+1,s,sb,list);
        sb.deleteCharAt(sb.length() - 1);
        if(Character.isLetter(ch)){
            char flip = Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch);
            
            sb.append(flip);
             backtrack(idx+1,s,sb,list);
             sb.deleteCharAt(sb.length() - 1);
        }
        
       
    }
}