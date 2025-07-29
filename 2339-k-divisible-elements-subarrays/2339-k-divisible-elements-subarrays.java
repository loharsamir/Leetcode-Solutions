class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int l=0;
        int countDivP=0;
        int count=0;
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        for(int r=0;r<nums.length;r++){
            if(nums[r]%p==0)countDivP++;
            while(countDivP>k){
                if(nums[l]%p==0)countDivP--;
                l++;
            }
            List<Integer>list=new ArrayList<>();
            for(int i=r;i>=l;i--){
                list.add(0,nums[i]);
                set.add(new ArrayList<>(list));
            }
            
        }
        return set.size();
    }
}