# 220. Contains Duplicate III

## Problem Statement
You are given an integer array `nums` and two integers `indexDiff` and `valueDiff`. You need to determine if there exists a pair of indices `(i, j)` in the array such that:
- `i != j`
- `|i - j| <= indexDiff`
- `|nums[i] - nums[j]| <= valueDiff`

Return `true` if such a pair exists, otherwise return `false`.

## Examples

### Example 1:
```plaintext
Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0  
Output: true  
Explanation: We can choose (i, j) = (0, 3).  
Conditions satisfied are:  
- i != j --> 0 != 3  
- |i - j| <= indexDiff --> |0 - 3| <= 3  
- |nums[i] - nums[j]| <= valueDiff --> |1 - 1| <= 0 
``` 

### Example 2:
```plaintext
Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3  
Output: false  
Explanation: After trying all possible pairs (i, j), we cannot satisfy the three conditions, so we return false.
```

## Intuition
This problem involves finding two indices in an array such that the values at these indices are close in value and the indices themselves are also close in the array. This suggests the use of a sliding window technique, enhanced by bucketing values to manage the closeness in value effectively.

## Approach
The problem is approached using a sliding window in combination with bucketing:
1. **Bucketing by Value**: Each bucket will store values in such a way that all values within a bucket and potentially neighboring buckets meet the `valueDiff` condition. 
2. **Window Size**: The sliding window will be maintained with a size determined by `indexDiff` to ensure indices are close enough.
3. **Bucket Assignment and Checking**:
   - Compute a bucket ID for each number such that numbers close in value fall into the same or adjacent buckets.
   - Check the current bucket and the neighboring buckets to see if a valid pair exists.
4. **Maintain Window**: Slide the window by removing the oldest entry once the window exceeds `indexDiff`.

## Steps
1. Initialize a hashmap to store bucket ids and the most recent number associated with those ids.
2. Traverse through the array, for each element:
   - Calculate its bucket ID.
   - Check for possible pairs in the same or adjacent buckets.
   - Update the buckets with the current number.
   - If the window size exceeds `indexDiff`, remove the element that is leaving the window from its corresponding bucket.
3. If a pair is found at any point, return true.
4. Return false if no such pair is found after examining all elements.

## Time Complexity
The overall time complexity is O(n), where n is the number of elements in the array, since each element is processed once.

## Space Complexity
The space complexity is O(min(n, k)), where k is the maximum number of elements that can be within the `indexDiff` range. This is due to the storage requirements for the sliding window.
