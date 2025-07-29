class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        int l=0,r=k;
        int max=count;
        
        while(r<s.length()){
            if("aeiou".indexOf(s.charAt(r))!=-1)count++;
            if("aeiou".indexOf(s.charAt(l))!=-1)count--;
            r++;
            l++;
            max=Math.max(max,count);
        }
        return max;
    }
}