class Solution {
    public int findShortestSubArray(int[] nums) {
         HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> firstIndexMap = new HashMap<>();
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();

        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Set first occurrence only once
            firstIndexMap.putIfAbsent(num, i);

            // Always update last occurrence
            lastIndexMap.put(num, i);

            // Frequency count
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // Track degree
            degree = Math.max(degree, countMap.get(num));
        }

        int minLength = nums.length;

        for (int num : countMap.keySet()) {
            if (countMap.get(num) == degree) {
                int length = lastIndexMap.get(num) - firstIndexMap.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}