class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] ans=new int[k];
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] arr=new List[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        for(int key:map.keySet()){
            arr[map.get(key)].add(key);
        }
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            List<Integer>list=arr[i];
            for(int j: list){
                temp.add(j);
            }

        }
        while(k-- >0){
            ans[k]=temp.get(k);
           
        }
        return ans;
    }
}