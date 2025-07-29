class Solution {
   
    public long countGood(int[] nums, int k) {
         Map<Integer, Integer> freq = new HashMap<>();
        long count = 0;
        int left = 0;
        long pairs = 0;

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            int f = freq.getOrDefault(val, 0);

            pairs += f; // each previous occurrence adds one new pair
            freq.put(val, f + 1);

            // shrink window from left while pairs >= k
            while (pairs >= k) {
                // all subarrays starting from left to right are valid
                count += nums.length - right;

                // remove nums[left] from freq and adjust pairs
                int freqLeft = freq.get(nums[left]);
                pairs -= (freqLeft - 1); // removing 1 occurrence removes (freq - 1) pairs
                if (freqLeft == 1) {
                    freq.remove(nums[left]);
                } else {
                    freq.put(nums[left], freqLeft - 1);
                }

                left++;
            }
        }

        return count;
    }
}