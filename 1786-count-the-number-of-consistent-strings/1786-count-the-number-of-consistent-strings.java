class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(String str:words){
            int count=0;
            for(char ch:str.toCharArray()){
                if(allowed.indexOf(ch)!=-1)count++;
                else break;
            }
            if(count==str.length())ans++;
        }
        return ans;
    }
}