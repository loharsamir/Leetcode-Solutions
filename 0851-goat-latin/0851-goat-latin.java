class Solution {
    public String toGoatLatin(String sentence) {
        String str[]=sentence.split(" ");
        StringBuilder ans=new StringBuilder();
        int n=1;
        for(String word:str){
            if("aeiouAEIOU".indexOf(word.charAt(0))!=-1){
                ans.append(word).append("ma");
            }else{
                ans.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            for(int i=1;i<=n;i++){
                ans.append('a');
            }
            
            ans.append(" ");
            n++;

        }
        return ans.substring(0,ans.length()-1);
    }
}