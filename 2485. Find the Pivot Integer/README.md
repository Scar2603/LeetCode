# 2485. Find the Pivot Integer

## Problem Statement
Given a positive integer n, find the pivot integer x such that:
- The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

## Examples
### Example 1
```plaintext
Input: n = 8  
Output: 6  
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
```

### Example 2
```plaintext
Input: n = 1  
Output: 1  
Explanation: 1 is the pivot integer since: 1 = 1.
```

### Example 3
```plaintext
Input: n = 4  
Output: -1  
Explanation: It can be proved that no such integer exist.
```

## Approach
Iterate from n to 1, calculate the sum of elements up to i using the formula for sum of first n natural numbers. If the sum equals the cumulative sum from 1 to i, return i. If no such integer is found, return -1.

## Time Complexity
The time complexity of this approach is O(n).

## Space Complexity
The space complexity is O(1).
