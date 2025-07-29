class Solution {
    public List<String> stringMatching(String[] words) {
        // ArrayList<String>list=new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     String str=words[i];
        //     for(int j=0;j<words.length;j++){
        //         if(i!=j && words[j].length()>=str.length() && words[j].indexOf(str)!=-1){
        //             list.add(str);
        //             break;
        //         }
        //     }
        // }
        // return list;

        ArrayList<String>list=new ArrayList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=i+1;j<words.length;j++){
                if(words[j].indexOf(str)!=-1){
                    list.add(str);
                    break;
                }
            }
        }
        return list;
    }
}