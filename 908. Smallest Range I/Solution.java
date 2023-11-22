class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (maxVal - minVal <= 2 * k) {
            return 0;
        }

        return maxVal - minVal - 2 * k;
    }
}
