class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.equals(goal)){
            for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
                 if(map.get(ch)>=2)return true;
            }
            return false;
        }
       
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()==2){
            if(s.charAt(list.get(0))==goal.charAt(list.get(1)) && s.charAt(list.get(1))==goal.charAt(list.get(0)))return true;
        }
        return false;
    }
}