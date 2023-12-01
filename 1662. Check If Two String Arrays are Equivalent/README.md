# 1662. Check If Two String Arrays are Equivalent

## Problem Statement
Given two string arrays `word1` and `word2`, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

## Approach
The approach involves concatenating the elements of each array into strings and then comparing the resulting strings for equality.

### Example 1:
**Input:** 
```java
word1 = ["ab", "c"], word2 = ["a", "bc"]
```
**Output:**
```
true
```

**Explanation:**
```
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

```
### Example 2:
**Input:**
```
word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
```
**Output:**
```
true
```


## Steps
1. **Initialization:**
   - Initialize two empty strings `str1` and `str2`.

2. **Concatenate Elements of word1:**
   - Iterate through each element of `word1` and concatenate it to `str1`.

3. **Concatenate Elements of word2:**
   - Iterate through each element of `word2` and concatenate it to `str2`.

4. **Comparison:**
   - Compare `str1` and `str2`.

5. **Result:**
   - If `str1` equals `str2`, return true; otherwise, return false.

## Time Complexity
The time complexity is O(N), where N is the total number of characters in both arrays combined.

## Space Complexity
The space complexity is O(M + N), where M is the total number of characters in `word1`, and N is the total number of characters in `word2`.
