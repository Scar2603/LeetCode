# 633. Sum of Square Numbers

# Problem Statement

Given a non-negative integer c, decide whether there are two integers a and b such that a^2 + b^2 = c.

## Example
###Example 1
```plaintext
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
```

###Example 2
```plaintext
Input: c = 3
Output: false
```

# Intuition

- We iterate through all possible values of 'a' and 'b' such that a^2 + b^2 <= c.
- At each step, we calculate the sum of squares of 'a' and 'b'.
- If the sum equals 'c', we return true.
- If the sum is less than 'c', we increment 'a'.
- If the sum is greater than 'c', we decrement 'b'.
- We continue this process until 'a' is less than or equal to 'b'.

# Approach

1. Initialize 'left' to 0 and 'right' to the square root of 'c'.
2. While 'left' is less than or equal to 'right':
    - Calculate the sum of squares of 'left' and 'right'.
    - If the sum equals 'c', return true.
    - If the sum is less than 'c', increment 'left'.
    - If the sum is greater than 'c', decrement 'right'.
3. If no such pair of 'a' and 'b' exists, return false.

# Time Complexity

The time complexity of this approach is O(sqrt(c)), where c is the given non-negative integer.

# Space Complexity

The space complexity is O(1) as we are using only a constant amount of extra space.
