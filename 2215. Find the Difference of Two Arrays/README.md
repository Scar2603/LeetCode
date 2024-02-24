# 2215. Find the Difference of Two Arrays

## Problem Statement
Given two 0-indexed integer arrays `nums1` and `nums2`, return a list `answer` of size 2 where:

`answer[0]` is a list of all distinct integers in `nums1` which are not present in `nums2`.
`answer[1]` is a list of all distinct integers in `nums2` which are not present in `nums1`.
Note that the integers in the lists may be returned in any order.

## Examples
### Example 1
```plaintext
Input: `nums1 = [1,2,3], nums2 = [2,4,6]`
Output: `[[1,3],[4,6]]`
Explanation:
For `nums1`, `nums1[1] = 2` is present at index 0 of `nums2`, whereas `nums1[0] = 1` and `nums1[2] = 3` are not present in `nums2`. Therefore, `answer[0] = [1,3]`.
For `nums2`, `nums2[0] = 2` is present at index 1 of `nums1`, whereas `nums2[1] = 4` and `nums2[2] = 6` are not present in `nums1`. Therefore, `answer[1] = [4,6]`.

```

### Example 2
```plaintext
Input: `nums1 = [1,2,3,3], nums2 = [1,1,2,2]`
Output: `[[3],[]]`
Explanation:
For `nums1`, `nums1[2]` and `nums1[3]` are not present in `nums2`. Since `nums1[2] == nums1[3]`, their value is only included once, and `answer[0] = [3]`.
Every integer in `nums2` is present in `nums1`. Therefore, `answer[1] = []`.

```
**Input:** `nums1 = [1,2,3,3], nums2 = [1,1,2,2]`
**Output:** `[[3],[]]`
**Explanation:**
For `nums1`, `nums1[2]` and `nums1[3]` are not present in `nums2`. Since `nums1[2] == nums1[3]`, their value is only included once, and `answer[0] = [3]`.
Every integer in `nums2` is present in `nums1`. Therefore, `answer[1] = []`.

## Intuition
The problem asks to find the difference between two arrays, specifically the elements that are present in one array but not in the other.

## Approach
The given Java code implements a solution with the following steps:
1. Create two sets (`set1` and `set2`) to store distinct elements from `nums1` and `nums2`.
2. Iterate through `nums1` and `nums2` to add elements to `set1` and `set2`.
3. Create two lists (`diff1` and `diff2`) to store the elements that are present in one set but not in the other.
4. Iterate through `set1` to find elements not present in `set2` and add them to `diff1`.
5. Iterate through `set2` to find elements not present in `set1` and add them to `diff2`.
6. Create a list `result` and add `diff1` and `diff2` to it.
7. Return the `result` list.

## Steps
1. Initialize two sets (`set1` and `set2`).
2. Iterate through `nums1` and add elements to `set1`.
3. Iterate through `nums2` and add elements to `set2`.
4. Initialize two lists (`diff1` and `diff2`).
5. Iterate through `set1` to find elements not present in `set2` and add them to `diff1`.
6. Iterate through `set2` to find elements not present in `set1` and add them to `diff2`.
7. Initialize a list `result` and add `diff1` and `diff2` to it.
8. Return the `result` list.

## Time Complexity
The time complexity of this solution is O(max(N, M)), where N and M are the lengths of `nums1` and `nums2` respectively.

## Space Complexity
The space complexity is O(N + M), where N and M are the lengths of `nums1` and `nums2` respectively, as it uses two sets to store distinct elements.

