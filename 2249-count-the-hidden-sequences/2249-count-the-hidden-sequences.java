class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0, sum = 0;
    
    for (int diff : differences) {
        sum += diff;
        min = Math.min(min, sum);
        max = Math.max(max, sum);
    }

    long left = lower - min;
    long right = upper - max;

    return (int) Math.max(0, right - left + 1);
    }
}