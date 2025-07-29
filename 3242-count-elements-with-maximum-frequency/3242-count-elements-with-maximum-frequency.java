class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        int count=0;
        for(int key:map.keySet()){
            if(map.get(key)==max){
                count++;
            }
        }
        return count*max;
    }
}