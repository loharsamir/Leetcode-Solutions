class Solution {
    public int countPartitions(int[] nums, int k) {
         int n = nums.length;
        final long MOD = 1_000_000_007L;

        long[] pref = new long[n + 1];

        pref[0] = 1L;

        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int left = 0;

        for (int right = 0; right < n; right++) {
            int x = nums[right];


            while (!maxD.isEmpty() && nums[maxD.peekLast()] < x) {
                maxD.pollLast();
            }
            maxD.addLast(right);


            while (!minD.isEmpty() && nums[minD.peekLast()] > x) {
                minD.pollLast();
            }
            minD.addLast(right);


            while (!maxD.isEmpty() && !minD.isEmpty() &&
                   nums[maxD.peekFirst()] - nums[minD.peekFirst()] > k) {
                if (maxD.peekFirst() == left) maxD.pollFirst();
                if (minD.peekFirst() == left) minD.pollFirst();
                left++;
            }


            long sumUntilR = pref[right];                
            long sumBeforeLeft = (left - 1 >= 0) ? pref[left - 1] : 0L;
            long dpRplus1 = (sumUntilR - sumBeforeLeft) % MOD;
            if (dpRplus1 < 0) dpRplus1 += MOD;


            pref[right + 1] = (pref[right] + dpRplus1) % MOD;
        }

 
        long ans = (pref[n] - pref[n - 1]) % MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }
}