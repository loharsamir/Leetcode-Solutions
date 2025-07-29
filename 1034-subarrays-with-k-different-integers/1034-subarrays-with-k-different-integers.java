class Solution {
    public int countSub(int[] num,int k){
        int l=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r=0;r<num.length;r++){
            map.put(num[r],map.getOrDefault(num[r],0)+1);
            while(map.size()>k){
                 map.put(num[l],map.getOrDefault(num[l],0)-1);
                 if(map.get(num[l])==0){
                    map.remove(num[l]);
                    
                 }
                 l++;
            }
            count+=r-l+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countSub(nums,k)-countSub(nums,k-1);
    }
}