class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i)==1)sum+=i;
        }
        return sum;
    }
}