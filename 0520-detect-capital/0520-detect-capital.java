class Solution {
    public boolean detectCapitalUse(String word) {
         if(Character.isUpperCase(word.charAt(0))){
            int count=0;
            for(int i=1;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    count++;
                }
            }
            if(count==word.length()-1 || count==0)return true;
            //else return false;
        }else{
            int count=0;
            for(int i=0;i<word.length();i++){
                 if(Character.isLowerCase(word.charAt(i))){
                    count++;
                 }
            }
            if(count==word.length())return true;
        }
        return false;
        
    }
}