class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
      HashMap<String,Integer>map=new HashMap<>();
      for(String str:text.split(" ")){
        for(int i=0;i<brokenLetters.length();i++){
            
                if(str.indexOf(brokenLetters.charAt(i))!=-1){
                    map.put(str,map.getOrDefault(str,0)+1);
                    break;
                }
            
        }
      } 
      int sum=0;
      for(int i: map.values()){
        sum+=i;
      }
      return text.split(" ").length-sum;  
    }
}