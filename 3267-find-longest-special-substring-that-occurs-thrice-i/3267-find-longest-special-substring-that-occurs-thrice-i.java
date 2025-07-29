class Solution {
    public int maximumLength(String s) {
         HashMap<String,Integer>map=new HashMap<>();
        int max=-1;
        for(int i=0;i<s.length();i++){
           StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)){
                    sb.append(s.charAt(j));
                    String str=sb.toString();
                    map.put(str,map.getOrDefault(str,0)+1);
                }else{
                    break;
                }
            }
        }
        for(String key:map.keySet()){
            if(map.get(key)>=3){
                max=Math.max(max,key.length());
            }
        }
        return max;
    }
}