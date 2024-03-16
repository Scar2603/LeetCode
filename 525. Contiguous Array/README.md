# 525. Contiguous Array

## Problem Statement
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

## Examples
### Example 1
```plaintext
Input: nums = [0,1]  
Output: 2  
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
```

### Example 2
```plaintext
Input: nums = [0,1,0]  
Output: 2  
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
```

## Constraints
- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Approach
1. Initialize a HashMap to store the running sum of 0s and 1s encountered so far and their indices.
2. Initialize variables `length` to store the maximum length found and `count` to keep track of the running sum.
3. Put an initial entry (0, -1) into the map to handle the case when the subarray with equal number of 0s and 1s starts from the beginning.
4. Iterate through the array.
5. For each 0 encountered, decrement the count by 1.
6. For each 1 encountered, increment the count by 1.
7. Check if the count is present in the map.
   - If present, update the length by taking the maximum of the current length and the difference between the current index and the index stored in the map.
   - If not present, add the count along with the current index to the map.
8. Finally, return the maximum length found.


## Time Complexity
The time complexity of this approach is O(n), where n is the length of the input array nums.

## Space Complexity
The space complexity is O(n), where n is the length of the input array nums.
