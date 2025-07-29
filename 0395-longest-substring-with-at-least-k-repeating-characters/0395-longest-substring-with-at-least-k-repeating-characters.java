class Solution {
    public int longestSubstring(String s, int k) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>map=new HashMap<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                
                if(map.get(ch)==k){
                    count++;
                }
                if(count==map.size()){
                    max=Math.max(max,j-i+1);
                }
                         
            }
                
        }
        return max;
    }
}