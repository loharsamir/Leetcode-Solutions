class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(freq[s.charAt(i)-'a']!=freq[s.charAt(i+1)-'a']){
                return false;
            }
        }
        return true;
    }
}