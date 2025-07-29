class Solution {
    public int lengthAfterTransformations(String s, int t) {
       
    int mod = 1_000_000_007;
    int[] map = new int[26]; // Frequency of characters

    // Step 1: Initialize frequency from input string
    for (char ch : s.toCharArray()) {
        map[ch - 'a']++;
    }

    // Step 2: Simulate t transformations
    for (int i = 0; i < t; i++) {
        int[] count = new int[26];
        for (int j = 0; j < 25; j++) {
            count[j + 1] = (count[j + 1] + map[j]) % mod;
        }
        // 'z' → 'a' and 'b'
        count[0] = (count[0] + map[25]) % mod;
        count[1] = (count[1] + map[25]) % mod;

        map = count;
    }

    // Step 3: Sum all characters' frequencies
    int ans = 0;
    for (int freq : map) {
        ans = (ans + freq) % mod;
    }

    return ans;

        
    }
}