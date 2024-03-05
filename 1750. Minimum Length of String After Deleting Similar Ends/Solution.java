class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currentChar = s.charAt(left);

            while (left <= right && s.charAt(left) == currentChar) {
                left++;
            }

            while (left <= right && s.charAt(right) == currentChar) {
                right--;
            }
        }

        return right - left + 1;
    }
}
