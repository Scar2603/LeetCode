# 1877. Minimize Maximum Pair Sum in Array

This Java solution is designed to find the minimum pair sum from a given array of integers.

## Problem Statement

Given an array of integers `nums`, the task is to find and return the minimum pair sum. A pair sum is the sum of two integers where each integer is taken from the array, and the goal is to minimize this sum.

## Approach

The provided Java code utilizes a sorted array and two pointers to efficiently find the minimum pair sum.

1. The input array `nums` is sorted in ascending order using `Arrays.sort(nums)`.

2. Two pointers, `l` and `r`, are initialized at the beginning and end of the sorted array, respectively.

3. A `while` loop iterates as long as `l` is less than or equal to `r`.

4. Inside the loop, the maximum pair sum is updated using `Math.max(maxPairSum, nums[l] + nums[r])`.

5. The pointers `l` and `r` are then incremented and decremented, respectively.

6. Finally, the maximum pair sum is returned.

## How to Use

1. Copy the `Solution` class into your Java project.

2. Create an instance of the `Solution` class.

3. Call the `minPairSum` method, passing the array of integers as an argument.

4. Retrieve and use the result, which represents the minimum pair sum.

## Time Complexity

The time complexity of this solution is O(n log n), where n is the length of the input array. The dominating factor is the sorting step, which has a time complexity of O(n log n) for the average and worst cases.

## Space Complexity

The space complexity of this solution is O(1) since it uses a constant amount of extra space for the pointers and variables, regardless of the input size. The sorting operation is performed in-place and does not require additional space proportional to the input size.

