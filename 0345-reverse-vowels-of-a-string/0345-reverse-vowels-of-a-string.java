class Solution {
    public String reverseVowels(String s) {
        // StringBuilder sb=new StringBuilder();
        // for(char ch:s.toCharArray()){
        //     if("aeiouAEIOU".indexOf(ch)!=-1){
        //         sb.append(ch);
        //     }
        // }
        // sb.reverse();
        // StringBuilder ans=new StringBuilder(s);
        // int j=0;
        // for(int i=0;i<ans.length();i++){
        //     if("aeiouAEIOU".indexOf(ans.charAt(i))!=-1){
        //         ans.setCharAt(i,sb.charAt(j));
        //         j++;
        //     }
        // }
        // return ans.toString();

        char[] arr= s.toCharArray();
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right && "aeiouAEIOU".indexOf(arr[left])==-1){
                left++;
            }
            while(left<right && "aeiouAEIOU".indexOf(arr[right])==-1){
                right--;
            }
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;

        }
        return new String(arr);
    }
}