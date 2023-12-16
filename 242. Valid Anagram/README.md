# 242. Valid Anagram

## Problem Statement
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**
```plaintext
Input: s = "anagram", t = "nagaram"
Output: true
```
**Example 1:**
```plaintext
Input: s = "rat", t = "car"
Output: false
```

## Approach

The approach used in this solution is to convert the input strings `s` and `t` into character arrays, sort the arrays, and then compare them. If the sorted arrays are equal, the original strings are anagrams.

## Steps

1. Convert the input strings `s` and `t` into character arrays (`sChar` and `tChar`).
2. Sort both character arrays.
3. Compare the sorted arrays using `Arrays.equals`.
4. If the sorted arrays are equal, return `true`, indicating that the strings are anagrams. Otherwise, return `false`.

## Time Complexity

Let `n` be the length of the input strings. The time complexity of this solution is dominated by the sorting step, which has a time complexity of O(n log n) due to the use of `Arrays.sort`.

## Space Complexity

The space complexity is O(n) as we use additional space to store the character arrays (`sChar` and `tChar`).

