class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer>set=new HashSet<>();
        // ArrayList<Integer>list=new ArrayList<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        // return list;

        List<Integer> result = new ArrayList<>();

        // Mark the indices
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];  // Mark as visited
            }
        }

        // Collect missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);  // i+1 is missing
            }
        }

        return result;
    }
}