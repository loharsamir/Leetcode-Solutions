class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // int length=-1;
        // int max=-1;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         String str=s.substring(i,j+1);
        //         if(str.charAt(0)==str.charAt(str.length()-1)){
        //             length=str.length()-2;
                    
        //         }
                
        //     }
        //     max=Math.max(max,length);
        // }
        // return max;
        int max=-1;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(arr[index]!=0){
                max=Math.max(max,i-arr[index]);
            }else{
                arr[index]=i+1;
            }
        }
        return max;
    }
}