# 908. Smallest Range I

## Problem Statement

Given an integer array `nums` and an integer `k`, in one operation, you can choose any index `i` where `0 <= i < nums.length` and change `nums[i]` to `nums[i] + x`, where `x` is an integer from the range `[-k, k]`. You can apply this operation at most once for each index `i`. The score of `nums` is the difference between the maximum and minimum elements in `nums`. Return the minimum score of `nums` after applying the mentioned operation at most once for each index in it.

## Example

```java
Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
```

## Approach
The solution follows a straightforward approach:
1. Find the minimum and maximum values in the array.
2. Check if the difference between the maximum and minimum values is less than or equal to 2k. If yes, return 0 because you can make all elements equal.
3. Otherwise, calculate the difference between the maximum and minimum values and subtract 2k from it.


## Implementation
The solution is implemented in Java. The `Solution` class contains a method `smallestRangeI` that takes an array of integers `nums` and an integer `k` as input and returns the minimum score of `nums` after applying the mentioned operation.

## Time Complexity
The time complexity of the solution is O(N), where N is the length of the input array `nums`. This is because we iterate through the array once to find the minimum and maximum values.

## Space Complexity
The space complexity is O(1) as we use only a constant amount of extra space to store the variables `minVal` and `maxVal`.
