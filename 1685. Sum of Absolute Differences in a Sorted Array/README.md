# 1685. Sum of Absolute Differences in a Sorted Array

## Problem Statement

You are given an integer array `nums` sorted in non-decreasing order. Build and return an integer array `result` with the same length as `nums` such that `result[i]` is equal to the summation of absolute differences between `nums[i]` and all the other elements in the array.

In other words, `result[i]` is equal to `sum(|nums[i]-nums[j]|)` where `0 <= j < nums.length` and `j != i` (0-indexed).

### Example
```
Input:nums = [1,4,6,8,10]
Output: [24,15,13,15,21]
```

## Approach

To solve this problem efficiently, we can pre-calculate the total sum of the array and iterate through each element to compute the absolute differences. We can optimize the calculation of the right sum by subtracting the left sum from the total sum.

## Steps

1. Calculate the total sum of the array.
2. Initialize variables `leftSum` and `rightSum` to keep track of the cumulative sum on the left and right sides of the current element.
3. Iterate through each element in the array and calculate the result based on the formula: `result[i] = i * nums[i] - leftSum + (totalSum - leftSum - nums[i] * (n - i))`.
4. Update `leftSum` in each iteration.
5. Return the resulting array.

## Time Complexity

The time complexity of this solution is O(n), where n is the length of the input array `nums`.

## Space Complexity

The space complexity is O(n) as we are using an additional array `result` to store the output.
