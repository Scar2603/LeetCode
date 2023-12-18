class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,prod1,prod2;
        prod1 = nums[0]*nums[1];
        prod2 = nums[n-1]*nums[n-2];
        int result = Math.abs(prod1 - prod2);
        return result;
    }
}
