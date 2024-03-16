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
We can solve this problem using a HashMap to keep track of the running sum of 0s and 1s encountered so far and their indices. We initialize the map with (0, -1) to handle the case when the subarray with equal number of 0s and 1s starts from the beginning. We iterate through the array, and for each 0 encountered, we decrement the count by 1, and for each 1 encountered, we increment the count by 1. If the count is already present in the map, it means that the subarray from the index in the map to the current index has equal number of 0s and 1s. We update the length accordingly. If the count is not present in the map, we add it along with the current index to the map. Finally, we return the maximum length found.

## Time Complexity
The time complexity of this approach is O(n), where n is the length of the input array nums.

## Space Complexity
The space complexity is O(n), where n is the length of the input array nums.
