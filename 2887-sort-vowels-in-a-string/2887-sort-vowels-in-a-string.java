class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder(s);
        while(i<s.length()){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                  sb.setCharAt(i,list.get(j)); 
                  
                  j++; 
            }
            i++;
        }
        return sb.toString();

    }
}