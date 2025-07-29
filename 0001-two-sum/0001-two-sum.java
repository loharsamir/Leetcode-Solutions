class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        List<String>ans=new ArrayList<>();
        List<String>[] arr=new ArrayList[words.length+1];
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:map.keySet()){
            if(arr[map.get(str)]==null)arr[map.get(str)]=new ArrayList<>();
            arr[map.get(str)].add(str);
        }
      
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=null){
                Collections.sort(arr[i]);
                for(String str:arr[i]){
                    ans.add(str);
                    if(ans.size()==k)return ans;
                }
            }
        }
        return ans;
        
    }
}