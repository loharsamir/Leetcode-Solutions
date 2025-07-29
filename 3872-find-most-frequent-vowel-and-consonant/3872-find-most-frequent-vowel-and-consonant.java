class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>vowel=new HashMap<>();
        HashMap<Character,Integer>cons=new HashMap<>();
        for(char ch:s.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }else{
                cons.put(ch,cons.getOrDefault(ch,0)+1);
            }
        }
        int maxV=0;
        int maxC=0;
        for(char ch:vowel.keySet()){
            maxV=Math.max(maxV,vowel.get(ch));
        }
        for(char ch:cons.keySet()){
            maxC=Math.max(maxC,cons.get(ch));
        }

    return maxV+maxC;
    }
}