class Solution {
    public int minDeletionSize(String[] strs) {
        int i=0;
        int ans=0;
        while(i<strs[0].length()){
            int count=1;
            for(int j=1;j<strs.length;j++){
               if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                ans++;
                break;
               }
            }
            
            i++;
        }
        return ans;
    }
}