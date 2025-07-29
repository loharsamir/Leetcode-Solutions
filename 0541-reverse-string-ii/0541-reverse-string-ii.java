class Solution {
    public String add(String str,int k){
        StringBuilder sb=new StringBuilder(str);
        int i=0,j=Math.min(k,str.length())-1;
        while(i<j){
        char ch=str.charAt(i);
        sb.setCharAt(i,str.charAt(j));
        sb.setCharAt(j,ch);
        i++;
        j--;
        }
        return sb.toString();

    }
    public String reverseStr(String s, int k) {

        int n=s.length();
        if(n==1)return s;
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n ){
            if(i+2*k>n){
                sb.append(add(s.substring(i),k));
            }else{
            sb.append(add(s.substring(i,i+2*k),k));
            }
            i+=2*k;
        }
        return sb.toString();
        
    }
}