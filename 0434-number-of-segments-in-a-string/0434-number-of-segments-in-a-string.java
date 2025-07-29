class Solution {
    public int countSegments(String s) {
        // String str=s.trim();
        // int count=0;
        // if(str.equals(""))return 0;
        // for(int i=0;i<str.length()-1;i++){
        //     char ch=str.charAt(i);
        //     if(Character.isWhitespace(ch) && !Character.isWhitespace(str.charAt(i+1)))count++;
        // }
        // return count+1;

        String[] str = s.split(" ");
        int count=0;
        for(String i: str){
            if(!i.equals(""))count++;
        }
        return count;
    }
}