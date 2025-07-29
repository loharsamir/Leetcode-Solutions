class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums, upper) - countPairs(nums, lower - 1);
        
    }
    private long countPairs(int[] nums, int maxSum) {
        long count = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] <= maxSum) {
                // All pairs from left to right-1 are valid with right
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}