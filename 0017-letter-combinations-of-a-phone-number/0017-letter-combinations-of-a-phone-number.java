class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String>list=new ArrayList<>();
        if (digits.length()==0)return list;
        backtrack(0,map,list,digits,new StringBuilder());
        return list;      
    }
    public void backtrack(int idx, HashMap<Character,String>map,List<String>list,String digits,StringBuilder sb){
        if(idx==digits.length()){
            list.add(sb.toString());
            return;
        }
        String str=map.get(digits.charAt(idx));
        for(char ch:str.toCharArray()){
            sb.append(ch);
            backtrack(idx+1,map,list,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}