class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[1000];
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int j=0;
        for(int i:nums2){
            if(map.containsKey(i)){
                arr[j]=i;
                j++;
                map.put(i,map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        int ans[]=new int[j];
        for(int i=0;i<j;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
}