class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num==1)return true;
        // for(int i=1;i<=Math.sqrt(num);i++){
        //     if(i*i==num)return true;
        // }
        // return false;

        int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
    }
}