class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            char currIdx=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==currIdx){
                count++;
                i++;
            }
            chars[idx]=currIdx;
            idx++;
            if(count>1){
                for(char c:(count+"").toCharArray()){
                    chars[idx]=c;
                    idx++;
                }
            }
        }
        return idx;
    }
}