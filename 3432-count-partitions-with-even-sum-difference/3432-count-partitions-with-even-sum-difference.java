class Solution {
    public int countPartitions(int[] nums) {
         int total = 0;
        for (int x : nums) total += x;
        if (total % 2 != 0) return 0; 
        return nums.length - 1;
    }
}