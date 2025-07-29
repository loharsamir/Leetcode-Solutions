class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int left=0;
        ArrayList<String>list=new ArrayList<>();
        list.add(words[0]);
        for(int right=1;right<words.length;right++){
            if(groups[left]!=groups[right]){
                list.add(words[right]);
                left=right;
            }
        }
        return list;
    }
}