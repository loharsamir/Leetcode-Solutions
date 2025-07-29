class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        int total = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();       // the answer a rabbit gave
            int count = entry.getValue(); // how many rabbits gave that answer
            int groupSize = k + 1;

            // number of full groups needed
            int groups = (count + groupSize - 1) / groupSize;

            total += groups * groupSize;
        }

        return total;
    }
}