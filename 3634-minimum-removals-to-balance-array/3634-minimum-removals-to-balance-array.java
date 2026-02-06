class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxWindow = 1; 
        int left = 0;

        for (int i = 0; i < n; i++) {
            while ((long) nums[i] > (long) nums[left] * k) {
                left++;
            }
            maxWindow = Math.max(maxWindow, i - left + 1);
        }

        return n - maxWindow;
    }
}