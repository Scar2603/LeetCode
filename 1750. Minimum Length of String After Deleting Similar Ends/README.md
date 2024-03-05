# 1750. Minimum Length of String After Deleting Similar Ends

## Problem Statement
Given a string `s` consisting only of characters 'a', 'b', and 'c', apply the following algorithm on the string any number of times:
- Pick a non-empty prefix from the string `s` where all the characters in the prefix are equal.
- Pick a non-empty suffix from the string `s` where all the characters in this suffix are equal.
- The prefix and the suffix should not intersect at any index.
- The characters from the prefix and suffix must be the same.
- Delete both the prefix and the suffix.
Return the minimum length of `s` after performing the above operation any number of times (possibly zero times).

## Examples
### Example 1
```plaintext
Input: s = "ca"
Output: 2
Explanation: You can't remove any characters, so the string stays as is.
```

### Example 2
```plaintext
Input:** s = "cabaabac"
Output:** 0
Explanation:** An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".
```

### Example 3
```plaintext
Input: s = "aabccabba"
Output: 3
Explanation: An optimal sequence of operations is:
- Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
- Take prefix = "b" and suffix = "bb" and remove them, s = "cca".
```

## Intuition
The problem asks to find the minimum length of the string after applying a specific operation. The operation involves removing non-overlapping equal prefixes and suffixes.

## Approach
The given Java code implements a solution with the following steps:
1. Use two pointers (`left` and `right`) to iterate from both ends of the string.
2. While the characters at `left` and `right` are equal, find the common character and move the pointers inward.
3. Return the remaining length after performing the operation.

## Steps
1. Initialize two pointers `left` and `right` at the start and end of the string, respectively.
2. While the characters at `left` and `right` are equal:
    a. Find the common character (`currentChar`).
    b. Move `left` to the right until a different character is encountered.
    c. Move `right` to the left until a different character is encountered.
3. Return the remaining length after performing the operation.

## Time Complexity
The time complexity of this solution is O(N), where N is the length of the string `s`. The algorithm iterates through the string once.

## Space Complexity
The space complexity is O(1), as no additional space is used proportional to the input size.

