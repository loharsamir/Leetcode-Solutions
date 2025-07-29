class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int reverse=0;
        int num=x;
        while(x!=0){
            int lastDigit=x%10;
            reverse = reverse*10+lastDigit;
            x/=10;
        }
        return reverse==num;
    }
}