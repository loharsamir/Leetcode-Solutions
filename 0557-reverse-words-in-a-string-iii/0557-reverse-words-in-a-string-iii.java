class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
       
        while(j<s.length()){
            
            if(s.charAt(j)==' '){
               
                sb.append(new StringBuilder(s.substring(i, j)).reverse()).append(' ');
                i=j+1;
            }
            
            j++;
        }
        sb.append(new StringBuilder(s.substring(i,j)).reverse());
        return sb.toString();
    }
}