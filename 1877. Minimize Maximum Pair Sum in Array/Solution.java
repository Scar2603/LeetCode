class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxPairSum = Integer.MIN_VALUE;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            maxPairSum = Math.max(maxPairSum, nums[l] + nums[r]);
            l++;
            r--;
        }

        return maxPairSum;
    }
}
