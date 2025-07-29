class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();

    // Store jewel types in a HashSet
    for (char c : jewels.toCharArray()) {
        set.add(c);
    }

    int count = 0;
    // Check how many stones are jewels
    for (char c : stones.toCharArray()) {
        if (set.contains(c)) {
            count++;
        }
    }

return count;

    }
}