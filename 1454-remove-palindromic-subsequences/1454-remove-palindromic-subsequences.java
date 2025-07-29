class Solution {
    public boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
    public int removePalindromeSub(String s) {
        if(s.equals(""))return 0;
        else if(isPalindrome(s))return 1;
        else return 2;
    }
}