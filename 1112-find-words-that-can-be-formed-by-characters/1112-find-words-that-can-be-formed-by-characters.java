class Solution {
    public int countCharacters(String[] words, String chars) {
          HashMap<Character, Integer> map = new HashMap<>();

    // Build frequency map of chars
    for (char ch : chars.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    int length = 0;

    for (String word : words) {
        HashMap<Character, Integer> tempMap = new HashMap<>(map);
        boolean canForm = true;

        for (char ch : word.toCharArray()) {
            if (!tempMap.containsKey(ch) || tempMap.get(ch) == 0) {
                canForm = false;
                break;
            }
            tempMap.put(ch, tempMap.get(ch) - 1);
        }

        if (canForm) {
            length += word.length();
        }
    }

    return length;
    }
}