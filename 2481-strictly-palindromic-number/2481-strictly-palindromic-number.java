class Solution {
    public boolean isStrictlyPalindromic(int n) {
        //return false;
        for(int i=2;i<=n-2;i++){
            if(!isPalindrome(toBase(n,i)))return false;
        }
        return true;
    }
    public String toBase(int num,int base){
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(num%base);
            num/=base;
        }
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString());
       
    }
}