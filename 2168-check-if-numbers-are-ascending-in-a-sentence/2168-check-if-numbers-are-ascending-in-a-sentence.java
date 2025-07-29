class Solution {
    public boolean areNumbersAscending(String s) {
      
    // int pre = -1;
    // int num = 0;
    // int i = 0;

    // while (i < s.length()) {
    //     if (Character.isDigit(s.charAt(i))) {
    //         num = 0;
    //         while (i < s.length() && Character.isDigit(s.charAt(i))) {
    //             num = num * 10 + (s.charAt(i) - '0');
    //             i++;
    //         }

    //         if (num <= pre) {
    //             return false;
    //         }
    //         pre = num;
    //     } else {
    //         i++;
    //     }
    // }

    // return true;

    int pre=-1;
    int num=0;
    String[] str= s.split(" ");
    for(int i=0;i<str.length;i++){
        if(Character.isDigit(str[i].charAt(0))){
            if(str[i].length()>=2){
                num=((str[i].charAt(0)-'0')*10)+(str[i].charAt(1)-'0');
            }else{
                num=(str[i].charAt(0)-'0');
            }

            if(num<=pre)return false;

            pre=num;
        }
    }
    return true;
    }
}