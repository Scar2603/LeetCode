# 977. Squares of a Sorted Array

## Problem Statement
Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

## Examples
### Example 1
```plaintext
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation:
After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
```
### Example 2

```plaintext
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```


## Intuition
The problem asks to return an array containing the squares of each number in the given sorted array in non-decreasing order.

## Approach
The given Java code implements a solution with the following steps:
1. Iterate through the array and square each element.
2. Sort the resulting array of squared values in non-decreasing order.
3. Return the sorted array.

## Steps
1. Initialize an array `result` with the same length as the input array `nums`.
2. Iterate through `nums` and square each element, storing the result in the `result` array.
3. Sort the `result` array in non-decreasing order.
4. Return the sorted `result` array.

## Time Complexity
The time complexity of this solution is O(N log N), where N is the length of the input array. The dominating factor is the sorting operation.

## Space Complexity
The space complexity is O(N), where N is the length of the input array. It accounts for the space used to store the squared values in the `result` array.

