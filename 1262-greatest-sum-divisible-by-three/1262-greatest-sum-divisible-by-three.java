class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] best = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int x : nums) {
            int[] current = best.clone();
            for (int r = 0; r < 3; r++) {
                if (current[r] != Integer.MIN_VALUE) {
                    int newMod = (r + x % 3) % 3;
                    best[newMod] = Math.max(best[newMod], current[r] + x);
                }
            }
        }

        return best[0];
    }
}