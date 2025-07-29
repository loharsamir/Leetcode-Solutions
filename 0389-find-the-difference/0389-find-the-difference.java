class Solution {
    public char findTheDifference(String s, String t) {
        // if(s.length()==0) return t.charAt(0);
        // HashMap<Character,Integer>map=new HashMap<>();
        // for(char ch:s.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(char ch:t.toCharArray()){
        //     if(!map.containsKey(ch))return ch;
        //     else{
        //         map.put(ch,map.get(ch)-1);
        //         if(map.get(ch)==0){
        //             map.remove(ch);
        //         }
        //     }
        // }
        // return 0;

        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=t1[i])return t1[i];
        }
        return t1[t1.length-1];
        
    }
}                                                           