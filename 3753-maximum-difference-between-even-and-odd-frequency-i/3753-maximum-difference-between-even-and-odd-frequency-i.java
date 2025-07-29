class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
            
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Integer val : map.values()){
            if(val%2 ==1){
                max=Math.max(max,val);
            }else{
                min=Math.min(min,val);
            }

        }
        return max-min;
        

    }
}