# Reverse Integer

## Problem Statement
Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return 0.

## Approach
The provided solution reverses the digits of the input integer `x` and checks whether the reversed integer falls within the signed 32-bit integer range. If it does, the reversed integer is returned; otherwise, 0 is returned.

## Steps
1. If `x` is greater than 0, convert it to a string and reverse the string.
    - If the reversed integer falls within the specified range, return it.
    - Otherwise, return 0.
2. If `x` is less than or equal to 0, take the absolute value `y` of `x`, convert it to a string, and reverse the string.
    - If the reversed integer multiplied by -1 falls within the specified range, return it.
    - Otherwise, return 0.

## Time Complexity
The time complexity of this solution is O(log(x)), where x is the input integer. This is because the number of digits in the integer `x` determines the number of iterations required to reverse the digits.

## Space Complexity
The space complexity is O(log(x)) as well. This is due to the space required to store the reversed string representation of the integer.

