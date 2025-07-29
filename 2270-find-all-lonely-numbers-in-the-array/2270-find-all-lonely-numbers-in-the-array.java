class Solution {
    public List<Integer> findLonely(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==1 && !map.containsKey(num-1) && !map.containsKey(num+1)){
                list.add(num);
            }
        }
        return list;
    }
}