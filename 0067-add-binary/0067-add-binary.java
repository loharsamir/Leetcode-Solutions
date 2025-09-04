class Solution {
    public String addBinary(String a, String b) {
        int n=a.length();
        int m=b.length();
        int i=n-1,j=m-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 && j>=0){
            int ch1=a.charAt(i)-'0';
            int ch2=b.charAt(j)-'0';
            int sum=ch1+ch2+carry;

            if(sum==3){
                sb.append(1);
                carry=1;
            }
            else if(sum==2){
                sb.append(0);
                carry=1;
            }else if(sum==1){
                sb.append(1);
                carry=0;
            }else{
                sb.append(0);
                carry=0;
            }
            i--;j--;
        }
        while(i>=0){
            int ch1=a.charAt(i)-'0';
            int sum=ch1+carry;
            if(sum==3){
                sb.append(1);
                carry=1;
            }
            else if(sum==2){
                sb.append(0);
                carry=1;
            }else if(sum==1){
                sb.append(1);
                carry=0;
            }else{
                sb.append(0);
                carry=0;
            }
            i--;
        }
         while(j>=0){
            int ch1=b.charAt(j)-'0';
            int sum=ch1+carry;
            if(sum==3){
                sb.append(1);
                carry=1;
            }
            else if(sum==2){
                sb.append(0);
                carry=1;
            }else if(sum==1){
                sb.append(1);
                carry=0;
            }else{
                sb.append(0);
                carry=0;
            }
            j--;
        }
        if(carry==1)sb.append(1);
        return sb.reverse().toString();
    }
}