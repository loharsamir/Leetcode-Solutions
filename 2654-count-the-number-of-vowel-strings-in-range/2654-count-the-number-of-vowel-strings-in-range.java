class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowel="aeiou";
        int count=0;
        for(int i=left;i<=right;i++){
            if(vowel.indexOf(words[i].charAt(0))!=-1 && vowel.indexOf(words[i].charAt(words[i].length()-1))!=-1){
                count++;
            }
        }
        return count;
    }
}