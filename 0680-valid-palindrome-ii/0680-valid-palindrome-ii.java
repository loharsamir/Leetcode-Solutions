class Solution {
    public boolean validPalindrome(String s) {
        // StringBuilder str=new StringBuilder(s);
        // if(str.toString().equals(str.reverse().toString()))return true;
        // for(int i=0;i<s.length();i++){
        //     StringBuilder sb=new StringBuilder();
        //     sb.append(s.substring(0,i)).append(s.substring(i+1,s.length()));
        //     if(sb.toString().equals(sb.reverse().toString())){
        //         return true;
        //     };
        // }
        // return false;

        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s,left,right-1) || isPalindrome(s,left+1,right);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}