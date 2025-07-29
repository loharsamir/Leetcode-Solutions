class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        int isOdd=0;
        for(char ch:map.keySet()){
            if(map.get(ch)%2==0){
            length+=map.get(ch);
            }else{
                length+=map.get(ch)-1;
                isOdd=1;
            }
        }
        if(isOdd==1)return length+1;
        else return  length;
      
    }
}