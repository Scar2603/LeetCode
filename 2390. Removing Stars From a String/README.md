# 2390. Removing Stars From a String

## Problem Statement
You are given a string `s`, which contains stars `*`.

In one operation, you can:
- Choose a star in `s`.
- Remove the closest non-star character to its left, as well as remove the star itself.

Return the string after all stars have been removed.

**Note:**
- The input will be generated such that the operation is always possible.
- It can be shown that the resulting string will always be unique.

## Examples
### Example 1
```plaintext
Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".
```

### Example 2
```plaintext
Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.
```

## Intuition
The problem asks to remove stars from a string by performing operations from left to right. In each operation, the closest non-star character to the left of the star is removed along with the star itself.

## Approach
The given Java code implements a solution with the following steps:
1. Use a stack to simulate the operations.
2. Iterate through the characters of the string.
3. If the character is '*', pop the stack (remove the closest non-star character to its left).
4. If the character is not '*', push it onto the stack.
5. Build the result string by popping elements from the stack.

## Steps
1. Use a stack to simulate the operations.
2. Iterate through the characters of the string.
3. If the character is '*', pop the stack (remove the closest non-star character to its left).
4. If the character is not '*', push it onto the stack.
5. Build the result string by popping elements from the stack.

## Time Complexity
The time complexity of this solution is O(N), where N is the length of the input string `s`. The algorithm iterates through the characters once.

## Space Complexity
The space complexity is O(N), where N is the length of the input string `s`. The stack stores characters, and in the worst case, it may store all characters.

