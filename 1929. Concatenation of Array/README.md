# Concatenation of Array

## Problem Statement

Given an integer array `nums` of length `n`, you want to create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (0-indexed). Specifically, `ans` is the concatenation of two `nums` arrays.

## Example

```
Input:
nums = [1,3,2,1]
```
```
Output:
[1,3,2,1,1,3,2,1]
```
```
Explanation:
The array `ans` is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
```
## Approach

The approach is to create a new array `ans` with double the length of the input array `nums`. The first half of `ans` is filled with the elements of `nums`, and the second half is also filled with the elements of `nums`.

## Steps

1. Initialize an array `result` of size `2n`.
2. Iterate over the elements of `nums` and copy them to the first half of `result`.
3. Iterate over the elements of `nums` again and copy them to the second half of `result`.
4. Return the resulting array `result`.

## Time Complexity

The time complexity of this solution is O(n), where n is the length of the input array `nums`.

## Space Complexity

The space complexity is O(n), as we are using an additional array `result` of size `2n`.
