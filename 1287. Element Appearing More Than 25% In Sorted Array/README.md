# 1287. Element Appearing More Than 25% In Sorted Array

## Problem Description
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

### Example
**Example 1:**
```
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
```
**Example 2:**
```
Input: arr = [1,1]
Output: 1
```
### Approach
1. **Initialization:**
   - Initialize a variable `percent` to represent 25% of the array length.
   
2. **Iteration:**
   - Iterate through the array up to the point where there is still 25% of the array remaining.
   
3. **Comparison:**
   - Compare each element with the one at a distance of `percent`.
   
4. **Matching Element:**
   - If a match is found, return the element.
### Steps
1. Set `n` as the length of the input array.
2. Calculate `percent` as `n / 4`.
3. Start a loop from index `0` up to `n - percent`.
    - Inside the loop, compare `arr[i]` with `arr[i + percent]`.
    - If a match is found, return `arr[i]`.
4. If no match is found in the loop, return -1.

### Time Complexity
The time complexity of this solution is O(n), where n is the length of the input array. The algorithm iterates through the array once.

### Space Complexity
The space complexity is O(1) since the algorithm uses only a constant amount of space, regardless of the size of the input array.
