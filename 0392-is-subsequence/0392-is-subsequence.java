class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int count=0;
        while(i<s.length() && j<t.length()){
            char sh=s.charAt(i);
            char th=t.charAt(j);
            if(sh==th){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        if(count==s.length())return true;
        else return false;
    }
}