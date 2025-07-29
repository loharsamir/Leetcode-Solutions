class Solution {
    public int balancedStringSplit(String s) {
        int countL=0,countR=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')countL++;
            else countR++;
            if(countL==countR){
                count++;
                countR=0;
                countL=0;
            }
        }
        return count;
    }
}