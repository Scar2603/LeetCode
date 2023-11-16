# 1980. Find Unique Binary String

## Overview

This repository contains a Java solution to a coding problem that involves finding a binary string of length n that does not appear in a given array of unique binary strings.

## Problem Statement

Given an array of strings `nums` containing n unique binary strings each of length n, the task is to return a binary string of length n that does not appear in `nums`. If there are multiple valid answers, any of them can be returned.

### Example

#### Input:

```java
String[] nums = ["01", "10"];
Output: "11"
Explanation: "11" does not appear in nums. "00" would also be correct.
```
## Implementation-
The solution uses a simple approach to iterate through each position in the binary strings and flips the bit at that position. If the bit at a given position in the current string is '1', it is replaced with '0', and vice versa. The resulting binary string is then returned.

## Step-wise Analysis:
1. Initialization:
- `int n = nums.length;`: Get the length of the array `nums`, denoted as `n`.
- `char[] str = new char[n];`: Initialize a character array `str` of length `n` to store the result.

2. Iteration through Binary Strings:
- `for(int i = 0; i < n; i++) {`: Iterate through each position in the binary strings.
- `if(nums[i].charAt(i) == '1') {`: Check if the bit at the current position is `1`.
- `str[i] = '0';`: If `1`, flip it to `0`.
- `} else {`: If the bit at the current position is `0`.
- `str[i] = '1';`: Flip it to `1`.

3. Result Formation:
- `return new String(str);`: Create a new string from the character array `str` and return it as the result.

## Time Complexity:
- The code iterates through each position in the binary strings, and the loop runs `n` times.
- Within the loop, each iteration involves constant-time operations (simple comparisons and assignments).
- Therefore, the overall time complexity is O(n).
## Space Complexity:
- The space complexity is O(n) due to the additional space used to store the character array `str`.
- The space required is proportional to the size of the input, which is the length of the binary strings (`n`).
