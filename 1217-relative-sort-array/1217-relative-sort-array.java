class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        
        int j=0;
        for(int i=0;i<arr2.length;i++){
            
            while(map.get(arr2[i])!=0){
                arr1[j]=arr2[i];
                map.put(arr2[i],map.get(arr2[i])-1);
                j++;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int key:map.keySet()){
            int freq=map.get(key);
           while(freq-- >0){
            list.add(key);
           }
        }
        Collections.sort(list);
        for(int val:list){
            arr1[j++]=val;
            
        }
        return arr1;
    }
}