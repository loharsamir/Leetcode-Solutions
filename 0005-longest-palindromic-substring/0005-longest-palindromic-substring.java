class Solution {
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
           if( str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
       String ans=null;
       int max=Integer.MIN_VALUE;
        
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                   if(s.substring(i,j+1).length()>max){
                    max=s.substring(i,j+1).length();
                    ans=s.substring(i,j+1);
                   }
                }
            }
        }
        return ans;
    }
}