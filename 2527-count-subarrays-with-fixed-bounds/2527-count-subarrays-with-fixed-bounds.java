class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
    int minPos = -1, maxPos = -1, badPos = -1;
    long count = 0;

    for (int i = 0; i < n; i++) {
        // If out of bounds
        if (nums[i] < minK || nums[i] > maxK) {
            badPos = i;
        }

        // Track latest positions of minK and maxK
        if (nums[i] == minK) minPos = i;
        if (nums[i] == maxK) maxPos = i;

        // Valid subarray ends here if both found after bad
        int validStart = Math.min(minPos, maxPos);
        if (validStart > badPos) {
            count += validStart - badPos;
        }
    }

    return count;
    }
}