class Solution {
   
    public int reverseDegree(String s) {
         int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sum+=((i+1)*(26-(ch-'a')));
        } 
        return sum;  
    }
}