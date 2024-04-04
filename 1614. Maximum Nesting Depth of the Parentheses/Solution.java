class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                current++;
                max = Math.max(max, current);
            } else if (c == ')') {
                current--;
            }
        }
        
        return max;
    }
}
