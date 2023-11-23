# 88. Merge Sorted Array

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, both sorted in non-decreasing order. The goal is to merge these arrays into a single array, which should also be sorted in non-decreasing order. The array `nums1` has a length of `m + n`, where the first `m` elements represent the elements to be merged, and the last `n` elements are initialized to 0 and should be ignored. The array `nums2` has a length of `n`.

## Approach

The provided Java solution follows a simple approach:

1. Iterate through the elements of `nums2` and append them to the end of `nums1`, starting from the `m`-th index of `nums1`.
2. After adding the elements from `nums2` to `nums1`, sort the entire `nums1` array.

## Steps

1. Initialize two pointers: `i` for `nums1` and `j` for `nums2`. Start `i` at the index `m` in `nums1`.
2. Iterate through the elements of `nums2`:
    a. Set `nums1[i]` to the current element of `nums2`.
    b. Increment both `i` and `j`.
3. Sort the entire `nums1` array to ensure it is in non-decreasing order.

## Time Complexity

The time complexity of this solution is dominated by the sorting operation. The sorting step has a time complexity of O((m + n) log(m + n)), where `m` is the length of `nums1` and `n` is the length of `nums2`. The initial iteration has a time complexity of O(n).

Therefore, the overall time complexity is O((m + n) log(m + n)).

## Space Complexity

The space complexity of this solution is O(1) since the operations are performed in-place, and no additional space is used except for a constant amount of space for variables.
