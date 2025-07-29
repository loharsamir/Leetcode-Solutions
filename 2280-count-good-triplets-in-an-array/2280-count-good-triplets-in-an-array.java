class Solution {
     class FenwickTree {
        int[] tree;
        int size;

        FenwickTree(int size) {
            this.size = size + 2; 
            tree = new int[this.size];
        }

        void update(int index, int delta) {
            index++; 
            while (index < size) {
                tree[index] += delta;
                index += index & -index;
            }
        }

        int query(int index) {
            index++; 
            int res = 0;
            while (index > 0) {
                res += tree[index];
                index -= index & -index;
            }
            return res;
        }
    }
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] pos2 = new int[n];

        
        for (int i = 0; i < n; i++) {
            pos2[nums2[i]] = i;
        }

        FenwickTree fenwickLeft = new FenwickTree(n);
        int[] leftSmaller = new int[n];

        for (int i = 0; i < n; i++) {
            int mappedIndex = pos2[nums1[i]];
            leftSmaller[i] = fenwickLeft.query(mappedIndex - 1);
            fenwickLeft.update(mappedIndex, 1);
        }

        FenwickTree fenwickRight = new FenwickTree(n);
        int[] rightLarger = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int mappedIndex = pos2[nums1[i]];
            rightLarger[i] = fenwickRight.query(n - 1) - fenwickRight.query(mappedIndex);
            fenwickRight.update(mappedIndex, 1);
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += (long) leftSmaller[i] * rightLarger[i];
        }

        return total;
    }
}