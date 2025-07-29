class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
           int[] freq=new int[26];
            
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int value:freq){
                    if(value>0){
                    min=Math.min(min,value);
                    max=Math.max(max,value);
                    }
                }
                sum+=(max-min);
            }
        }
        return sum;
    }
}