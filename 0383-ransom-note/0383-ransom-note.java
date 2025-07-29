class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char ch: ransomNote.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(char ch: magazine.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char ch:map1.keySet()){
            if(map1.containsKey(ch) && map2.containsKey(ch) && map1.get(ch)<=map2.get(ch)){
                count++;
            }
        }
        if(count==map1.size())return true;
        else return false;

    }
}