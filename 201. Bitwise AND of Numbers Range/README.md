# 201. Bitwise AND of Numbers Range

## Problem Statement
Given two integers `left` and `right` that represent the range `[left, right]`, return the bitwise AND of all numbers in this range, inclusive.

## Examples
### Example 1
```plaintext
Input: `left = 5, right = 7`
Output: `4`
```

### Example 2
```plaintext
Input: `left = 0, right = 0`
Output: `0`
```

### Example 3
```plaintext
Input: `left = 1, right = 2147483647`
Output: `0`
```

## Intuition
The problem asks to find the bitwise AND of all numbers in the given range [left, right].

## Approach
The given Java code implements a solution with the following steps:
1. Use a loop to right-shift both `left` and `right` until they become equal.
2. Count the number of shifts performed.
3. Left-shift the `left` value by the count of shifts and return the result.

## Steps
1. Initialize a variable `shift` to 0.
2. Use a while loop to continue right-shifting both `left` and `right` until they become equal.
    a. Right-shift `left`.
    b. Right-shift `right`.
    c. Increment `shift` by 1.
3. After the loop, left-shift the `left` value by the count of shifts (`left << shift`) and return the result.

## Time Complexity
The time complexity of this solution is O(log(right - left)), where `right - left` represents the range of numbers.

## Space Complexity
The space complexity is O(1), as the algorithm uses a constant amount of space.

