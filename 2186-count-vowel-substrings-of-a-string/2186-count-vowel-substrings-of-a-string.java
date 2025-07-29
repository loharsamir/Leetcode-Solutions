class Solution {   
    public int countVowelSubstrings(String word) {
        int count=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            HashSet<Character>set= new HashSet<>();
            for(int j=i;j<n;j++){
                char ch=word.charAt(j);
                if("aeiou".indexOf(ch)==-1)break;
                set.add(ch);
                if(set.size()==5)count++;
            }
        }
        return count;
    }
}