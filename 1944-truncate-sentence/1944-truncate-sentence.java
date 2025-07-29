class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(str[i]).append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}