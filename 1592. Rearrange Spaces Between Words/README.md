# 1592. Rearrange Spaces Between Words

## Problem Statement
You are given a string `text` of words that are placed among some number of spaces. Each word consists of one or more lowercase English letters and is separated by at least one space. It's guaranteed that `text` contains at least one word.

Rearrange the spaces so that there is an equal number of spaces between every pair of adjacent words and that number is maximized. If you cannot redistribute all the spaces equally, place the extra spaces at the end, meaning the returned string should be the same length as `text`.

Return the string after rearranging the spaces.

## Examples
### Example 1
```plaintext
Input: text = "  this   is  a sentence " 
Output: "this   is   a   sentence"
Explanation:** There are a total of 9 spaces and 4 words. We can evenly divide the 9 spaces between the words: 9 / (4-1) = 3 spaces.
```


### Example 2
```plaintext
Input: text = " practice   makes   perfect"  
Output: "practice   makes   perfect "
Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces plus 1 extra space. We place this extra space at the end of the string.
```


## Approach
The solution involves counting the number of spaces and words in the given `text`, then redistributing the spaces evenly between the words. Extra spaces are placed at the end if needed.

## Steps
1. Initialize variables to count spaces, words, and the length of the string.
2. Iterate through the string to count spaces and extract words.
3. Calculate the even distribution of spaces between words.
4. Build the result string by appending words and evenly distributed spaces.
5. Return the final string.

## Time Complexity
The time complexity of this solution is O(n), where n is the length of the input string.

## Space Complexity
The space complexity is O(1) as only a constant amount of extra space is used.
