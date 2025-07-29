class Solution {
    public int countAsterisks(String s) {
        boolean insideBars = false;
    int count = 0;

    for (char ch : s.toCharArray()) {
        if (ch == '|') {
            insideBars = !insideBars; 
        } else if (ch == '*' && !insideBars) {
            count++;
        }
    }

    return count;
    }
}