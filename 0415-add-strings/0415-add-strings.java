class Solution {
    public String sum(String num1,String num2){
        int index1=num1.length()-1,index2=num2.length()-1;
        int carry=0,add,last;
        StringBuilder sb=new StringBuilder();
        while(index2>=0){
            char ch=num1.charAt(index1);
            char bh=num2.charAt(index2);
             add=(ch-'0')+(bh-'0')+carry;
             last=add%10;
            sb.append(last);
            carry=add/10;
            index1--;
            index2--;
        }
        while(index1>=0){
            add=num1.charAt(index1)-'0'+carry;
            last=add%10;
            sb.append(last);
            carry=add/10;
            index1--;

        }
        if(carry>0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    public String addStrings(String num1, String num2) {
        if(num1.length()>=num2.length())return sum(num1,num2);
        else return sum(num2,num1);
    }
}