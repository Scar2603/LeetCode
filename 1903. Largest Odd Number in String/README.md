# 1903. Largest Odd Number in String
## Problem Statement

Given a string `num`, representing a large integer, find the largest-valued odd integer (as a string) that is a non-empty substring of `num`, or return an empty string "" if no odd integer exists.
<br>
A substring is a contiguous sequence of characters within a string.
### Examples:

#### Example 1:
Input: num = "52" 
<br>
Output: "5" <br>
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

#### Example 2:
Input: num = "4206" <br>
Output: ""  <br>
Explanation: There are no odd numbers in "4206".

#### Example 3:
Input: num = "35427" <br>
Output: "35427"  <br>
Explanation: "35427" is already an odd number.

## Approach

1. Start iterating through the string `num` from the right.
2. For each digit encountered, check if it is odd.
3. If an odd digit is found, return the substring from the beginning of the string to that position.
4. If no odd digit is found, return an empty string.

## Steps

1. **Start iterating through the string `num` from the right.**
   
2. **For each digit encountered, check if it is odd.**

3. **If an odd digit is found, return the substring from the beginning of the string to that position.**

4. **If no odd digit is found, return an empty string.**

## Complexity Analysis

- **Time Complexity: O(n)**
  - We iterate through the string once, where n is the length of the string.

- **Space Complexity: O(1)**
  - We use a constant amount of space for variables (no extra data structures are used).
