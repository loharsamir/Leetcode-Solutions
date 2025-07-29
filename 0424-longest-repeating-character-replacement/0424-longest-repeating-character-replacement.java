class Solution {
    public int characterReplacement(String s, int k) {
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     int[] freq=new int[26];int maxf=0;
        //     for(int j=i;j<s.length();j++){
        //         freq[s.charAt(j)-'A']++;
        //         maxf=Math.max(maxf,freq[s.charAt(j)-'A']);
        //         if(s.substring(i,j+1).length()-maxf>k){
        //             break;
        //         }else{
        //              max=Math.max(max,s.substring(i,j+1).length());
        //         }
        //     }
                   
        // }
        // return max;

        int l=0;
        int maxf=0;
        int maxlen=0;
        int[] freq=new int[26];
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(r)-'A']);
            int length=r-l+1;
            if(length-maxf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }else{
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        return maxlen;
    }
}