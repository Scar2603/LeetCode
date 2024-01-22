# 645. Set Mismatch
## Problem Statement
You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in **repetition of one** number and **loss of another** number.

You are given an integer array `nums` representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
```plaintext
Input: nums = [1,2,2,4]
Output: [2,3]
```
**Example 2:**
```plaintext
Input: nums = [1,1]
Output: [1,2]
```
## Intuition
Given an array that represents a set of numbers from 1 to n with one duplicate and one missing number, the code aims to find and return both the duplicate and the missing numbers.


## Approach
1. Iterate through the array:
   - For each element, take its absolute value and use it as an index to access the corresponding element in the array.
   - Check the sign of the element at that index:
      - If it's negative, it means we have seen this number before, and it is the duplicate.
      - If it's positive, mark the element at that index as negative to indicate that we have seen this number.
2. After the first loop, iterate through the array again:
   - Find the positive element in the array; its index + 1 is the missing number.

## Time Complexity
- The time complexity is O(n) because we iterate through the array twice, and each iteration takes O(n) time.

## Space Complexity
- The space complexity is O(1) as we do not use any extra data structures that scale with the input size. The algorithm uses a constant amount of space to store the result array and loop variables.
