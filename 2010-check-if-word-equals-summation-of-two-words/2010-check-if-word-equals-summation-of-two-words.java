class Solution {
    public int stringToNum(String str){
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            sb.append(ch-'a');
        }
        return Integer.parseInt(sb.toString());
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return stringToNum(firstWord)+stringToNum(secondWord)==stringToNum(targetWord);
    }
}