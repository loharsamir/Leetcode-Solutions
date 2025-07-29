class Solution {

    public int palindromeCount(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = palindromeCount(s, i-1, i+1);     // odd length palindromes
            int even = palindromeCount(s, i, i + 1); // even length palindromes
            count += odd + even+1;
        }
        return count;
    }
}