class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

    // Store index of each character in t
    for (int i = 0; i < t.length(); i++) {
        map.put(t.charAt(i), i);
    }

    int total = 0;

    // Compare positions of same character in s and t
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        int j = map.get(ch);
        total += Math.abs(i - j);
    }

    return total;
    }
}