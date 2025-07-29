class Solution {
    public int lengthOfLastWord(String s) {
        // String str=s.trim().replaceAll("\\s+"," ");
        // String[] ans=str.split("\\s+");
        // return ans[ans.length-1].length();

        int i=s.length()-1;
        int length=0;
        //if(s.length()==1)return 1;
        while(s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            length++;
        }
        return length;
    }
}