class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=new int[arr.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
            
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],map.size());
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i])+1;
        }
        return arr;
    }
}