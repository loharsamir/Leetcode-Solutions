class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         String subStr=s.substring(i,j+1);
        //         if(subStr.indexOf(s.charAt(j))!=subStr.length()-1){
        //             break;
        //         }else{
        //             max=Math.max(max,subStr.length());
        //         }
        //     }
        // }
        // return max;

        int max=0;
        int l=0,r=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.get(s.charAt(r))+1);
               
            }
            map.put(s.charAt(r),r);
            int length=r-l+1;
                max=Math.max(max,length);
                r++;
           
        }
        return max;

    }
}