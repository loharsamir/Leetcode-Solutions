class Solution {
    public String removeKdigits(String num, int k) {
        int l=k;
        if(num.length()<=k)return "0";
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            if(st.size()==0){
                st.push(num.charAt(i));
            }else{
                while(k>0 && st.size()>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            int idx=i+1;
            while(idx<num.length() && k==0){
                st.push(num.charAt(idx++));
                i++;
            }
            }   
            
        }
        
        
        while(st.size()>0){
            sb.append(st.pop());
        }
        String str= sb.reverse().toString();
        String result = str.replaceFirst("^0+(?!$)", "");
        if(result.length()<=k)return "0";
        if(result.length()<=num.length() && k>0)return result.substring(0,result.length()-k);
        return result;

    }
}