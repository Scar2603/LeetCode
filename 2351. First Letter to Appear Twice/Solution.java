class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[128]; 

        for (char c : s.toCharArray()) {
            if (seen[c]) {
                return c;
            } else {
                seen[c] = true;
            }
        }
        return '\0';
    }
}
