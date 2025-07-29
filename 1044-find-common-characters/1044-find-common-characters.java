class Solution {
    public List<String> commonChars(String[] words) {
       int[] minFreq = new int[26];
    Arrays.fill(minFreq, Integer.MAX_VALUE);

    for (String word : words) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            minFreq[i] = Math.min(minFreq[i], freq[i]);
        }
    }

    List<String> result = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
        for (int j = 0; j < minFreq[i]; j++) {
            result.add((char) (i + 'a') + "");
        }
    }

    return result;
    }
}