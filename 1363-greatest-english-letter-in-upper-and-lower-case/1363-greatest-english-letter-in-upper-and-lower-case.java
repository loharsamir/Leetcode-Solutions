class Solution {
    public String greatestLetter(String s) {
        // HashMap<Character,Integer>map=new HashMap<>();
        // for(char ch:s.toCharArray()){
        //     if(Character.isLowerCase(ch)){
        //         map.put(ch,1);
        //     }
        // }
        // for(char ch:s.toCharArray()){
        //     if(Character.isUpperCase(ch)){
        //        char c=Character.toLowerCase(ch);
        //        if(map.containsKey(c)){
        //         map.put(c,2);
        //        }
        //     }
        // }
        // char ch=' ';
        // for(char key:map.keySet()){
        //     if(map.get(key)==2 && key>ch){
        //         ch=key;
        //     }
        // }
        // return (ch==' ')? "":Character.toUpperCase(ch)+"";

        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(char ch='Z';ch>='A';ch--){
            if(set.contains(ch) && set.contains((char)('a'+(ch-'A')))){
                return ch+"";
            }
        }
        return "";

    }
}