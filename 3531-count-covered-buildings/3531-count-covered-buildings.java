class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, List<Integer>> row = new HashMap<>();
        Map<Integer, List<Integer>> col = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            row.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
            col.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
        }

        for (List<Integer> list : row.values()) Collections.sort(list);
        for (List<Integer> list : col.values()) Collections.sort(list);

        int count = 0;

        for (int[] b : buildings) {
            int x = b[0], y = b[1];

            List<Integer> xs = row.get(y);
            List<Integer> ys = col.get(x);

            int minX = xs.get(0), maxX = xs.get(xs.size() - 1);
            int minY = ys.get(0), maxY = ys.get(ys.size() - 1);

            if (x > minX && x < maxX && y > minY && y < maxY) {
                count++;
            }
        }

        return count;
    }
}