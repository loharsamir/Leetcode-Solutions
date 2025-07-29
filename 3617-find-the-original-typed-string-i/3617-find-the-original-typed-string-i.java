class Solution {
    public int possibleStringCount(String word) {
        // int[] freq=new int[26];
        // for(int i=1;i<word.length();i++){
        //     char ch=word.charAt(i);
        //     char pre=word.charAt(i-1);
        //     if(ch==pre){
        //         freq[ch-'a']++;
        //     }
            
        // }
        // int count=0;
        // for(int i:freq){
        //     if(i>0){
        //         count+=i;
        //     }
        // }
        // return count+1;
        int count=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
            }
        }
        return count+1;
        
    }
}