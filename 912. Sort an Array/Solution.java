class Solution {
    public int[] sortArray(int[] nums) {
        // Step 1: Find the maximum and minimum values in the array.
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // Step 2: Calculate the range of values in the array.
        int n = max - min;

        // Step 3: Create an array to store the frequency of each value in the original array.
        int[] arr = new int[n + 1];
        for (int num : nums) {
            arr[num - min]++;
        }

        // Step 4: Reconstruct the sorted array using the frequency information.
        int index = 0;
        for (int i = 0; i <= n; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }
            min++;
        }

        // Step 5: Return the sorted array.
        return nums;
    }
}
