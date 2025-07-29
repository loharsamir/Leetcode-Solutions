class Solution {
    public int numDifferentIntegers(String word) {
        int i=0;
        HashSet<String>set=new HashSet<>();
        while(i<word.length()){
            StringBuilder sb=new StringBuilder();
            while(i < word.length() && Character.isDigit(word.charAt(i))){
                sb.append(word.charAt(i));
                i++;
            }
            if (sb.length() > 0) {
            String num = sb.toString().replaceFirst("^0+", "");
            if (num.equals("")) num = "0"; 
            set.add(num);
            }
            i++;
        }
        return set.size();
    }
}