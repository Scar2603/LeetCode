# 392. Is Subsequence
## Problem Statement 
Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

**Example 1:**
```plaintext
Input: s = "abc", t = "ahbgdc"
Output: true
```
**Example 2:**
```plaintext
Input: s = "axc", t = "ahbgdc"
Output: false
```
## Approach
The algorithm determines whether string `s` is a subsequence of string `t` using a two-pointer approach. It iterates through both strings, advancing the pointers based on character matches.

## Steps
1. Initialize two pointers, `si` and `ti`, to 0.
2. Iterate through both strings (`s` and `t`) while `si` is less than the length of `s` and `ti` is less than the length of `t`.
3. If the characters at the current positions of `si` in `s` and `ti` in `t` are equal, increment `si`.
4. Always increment `ti`.
5. Check if `si` has reached the length of `s`. If true, return `true` indicating that `s` is a subsequence of `t`. Otherwise, return `false`.

## Time Complexity
The time complexity of this algorithm is O(min(len(s), len(t))), where len(s) and len(t) are the lengths of strings `s` and `t` respectively. The algorithm iterates through both strings once.

## Space Complexity
The space complexity of this algorithm is O(1) since it uses only a constant amount of extra space for the pointers and does not require additional data structures.
