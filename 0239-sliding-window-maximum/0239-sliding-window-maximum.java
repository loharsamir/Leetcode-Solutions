class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        ans[0] = pq.peek()[0];

        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i], i});

            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            ans[i - k + 1] = pq.peek()[0];
        }

        return ans;
    }
}