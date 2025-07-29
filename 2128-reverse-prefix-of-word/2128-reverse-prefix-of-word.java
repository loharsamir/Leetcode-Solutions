class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word.length()){
            if(word.charAt(i)==ch){
                sb.append(word.substring(j,i+1));
                sb.reverse();
                j=i+1;
                break;
            }
            i++;
        }
        return sb.append(word.substring(j)).toString();
    }
}