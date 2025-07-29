class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        for(String str1:s1.split(" ")){
            map.put(str1,map.getOrDefault(str1,0)+1);
        }
        for(String str1:s2.split(" ")){
            map.put(str1,map.getOrDefault(str1,0)+1);
        }
        for(String str:map.keySet()){
            if(map.get(str)==1){
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }
}