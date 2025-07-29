class Solution {
    public boolean halvesAreAlike(String s) {
        // int countL=0;
        // int countR=0;
        // int n=s.length();
        // for(int i=0;i<n/2;i++){
        //     if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
        //         countL++;
        //     }
        // }
        // for(int i=n/2;i<n;i++){
        //     if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
        //         countR++;
        //     }
        // }
        // return countL==countR;
        

        int countL=0,countR=0;
        int n=s.length();
        int left=0,right=n/2;
        while(right<n){
            if("aeiouAEIOU".indexOf(s.charAt(left++))!=-1){
                 countL++;
            }
            if("aeiouAEIOU".indexOf(s.charAt(right++))!=-1){
                 countR++;
            }
            

        }
        return countL==countR;
    }
}