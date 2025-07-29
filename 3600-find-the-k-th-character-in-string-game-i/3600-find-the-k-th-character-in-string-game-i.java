class Solution {
    public char kthCharacter(int k) {
        int i=0;
        StringBuilder word=new StringBuilder("a");
        while(word.length()<=k){
            StringBuilder str=new StringBuilder(word);
            while(i<str.length()){
                char ch=(char)(str.charAt(i)+1);
                word.append(ch);
                i++;
            }
            i=0;
            
        }
        return word.charAt(k-1);
        
    }
}