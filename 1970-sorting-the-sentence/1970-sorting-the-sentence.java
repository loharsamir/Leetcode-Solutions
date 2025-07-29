class Solution {
    public String sortSentence(String s) {
        String arr[]=new String[200];
        int i=0,j=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                arr[s.charAt(i)-'0']=s.substring(j,i);
                i+=2;
                j=i;
            }
             else{
                i++;
             }
            
        }
        StringBuilder sb=new StringBuilder();
        for(String st:arr){
            if(st!=null){
                sb.append(st);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}