class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        List<Character>[] arr=new ArrayList[n+1];
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch:map.keySet()){
            if(arr[map.get(ch)]==null){
                arr[map.get(ch)]=new ArrayList<>();
            }
            arr[map.get(ch)].add(ch);
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                for(char c:arr[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}