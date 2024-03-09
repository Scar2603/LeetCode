# 2540. Minimum Common Value

## Problem Statement
Given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst `nums1` and `nums2`, return -1.

Note that an integer is said to be common to `nums1` and `nums2` if both arrays have at least one occurrence of that integer.

## Examples
### Example 1
```plaintext
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
```

### Example 2
```plaintext
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
```

## Intuition
The problem asks to find the minimum common integer between two sorted arrays. We can use a two-pointer approach to traverse both arrays and identify the common element.

## Approach
1. Initialize two pointers `i` and `j` to the start of `nums1` and `nums2` respectively.
2. Iterate through the arrays while `i` and `j` are within the array bounds.
3. If `nums1[i]` equals `nums2[j]`, return `nums1[i]` as it is the common integer.
4. If `nums1[i]` is less than `nums2[j]`, increment `i`.
5. If `nums1[i]` is greater than `nums2[j]`, increment `j`.
6. If no common integer is found, return -1.

## Steps
1. Initialize two pointers `i` and `j` to the start of `nums1` and `nums2` respectively.
2. Iterate through the arrays while `i` and `j` are within the array bounds.
3. If `nums1[i]` equals `nums2[j]`, return `nums1[i]` as it is the common integer.
4. If `nums1[i]` is less than `nums2[j]`, increment `i`.
5. If `nums1[i]` is greater than `nums2[j]`, increment `j`.
6. If no common integer is found, return -1.

## Time Complexity
The time complexity of this solution is O(min(N, M)), where N and M are the lengths of the input arrays `nums1` and `nums2`. The algorithm traverses both arrays with the two-pointer approach.

## Space Complexity
The space complexity is O(1) as no additional space is used beyond a few pointers.

