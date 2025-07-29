class Solution {
    public Boolean checkNice(String str){
        HashSet<Character>set=new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                if(set.contains(Character.toUpperCase(str.charAt(i)))){
                    count++;
                }
            }else{
                if(set.contains(Character.toLowerCase(str.charAt(i)))){
                    count++;
                }
            }
        }
        return count==str.length();
    }
    String ans="";
    int max=0;
    public String longestNiceSubstring(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(checkNice(s.substring(i,j+1))){
                   if(s.substring(i,j+1).length()>max){
                    max=s.substring(i,j+1).length();
                    ans=s.substring(i,j+1);
                   }         
                }
            }
        }
        return ans;
    }
}