class Solution {
    public boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        // StringBuilder sb=new StringBuilder(str);
        // return str.equals(sb.reverse().toString());
    }
    public String firstPalindrome(String[] words) {
        for(String str: words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }
}