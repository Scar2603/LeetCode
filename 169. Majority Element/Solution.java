class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Sort the input array in ascending order.
        Arrays.sort(nums);

        // Step 2: The majority element will always be at the middle index of the sorted array,
        // since it appears more than n/2 times. The majority element is guaranteed to exist.
        return nums[nums.length/2];
    }
}
