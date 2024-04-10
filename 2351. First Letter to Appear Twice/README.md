# 2351. First Letter to Appear Twice

## Problem Statement
Given a string s consisting of lowercase English letters, return the first letter to appear twice.

### Note:
- A letter 'a' appears twice before another letter 'b' if the second occurrence of 'a' is before the second occurrence of 'b'.
- s will contain at least one letter that appears twice.

## Examples
### Example 1:
```plaintext
Input: s = "abccbaacz"  
Output: "c"  
Explanation:  
The letter 'a' appears on the indexes 0, 5, and 6.  
The letter 'b' appears on the indexes 1 and 4.  
The letter 'c' appears on the indexes 2, 3, and 7.  
The letter 'z' appears on the index 8.  
The letter 'c' is the first letter to appear twice, because out of all the letters, the index of its second occurrence is the smallest.
```

### Example 2:
```plaintext
Input: s = "abcdd"  
Output: "d"  
Explanation:  
The only letter that appears twice is 'd', so we return 'd'.
```

## Intuition
To find the first repeated character in the string, we can keep track of characters we have seen using a boolean array.

## Approach
- Initialize a boolean array `seen` of size 128 (assuming ASCII characters).
- Iterate through the characters of the string.
- If a character is already marked as seen, return it.
- Otherwise, mark it as seen.
- If no character is repeated, return '\0'.

## Steps
1. Initialize a boolean array `seen` of size 128 with all elements as false.
2. Iterate through the characters of the string.
3. If a character is already marked as seen, return it.
4. Otherwise, mark it as seen by setting the corresponding index in the `seen` array to true.
5. If no character is repeated, return '\0'.

## Time Complexity
The time complexity of this approach is O(n), where n is the length of the input string.

## Space Complexity
The space complexity of this approach is O(1) since the size of the boolean array is fixed.
