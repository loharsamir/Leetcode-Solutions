class Solution {
    
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch) ){
                sb.append(ch);
            }
        }
        String ans=sb.toString();
        return ans.toLowerCase().equals(sb.reverse().toString().toLowerCase());
    }
}