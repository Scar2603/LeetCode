# 1480. Running Sum of 1d Array

# Problem Statement

Given an array nums, return the running sum of nums, where runningSum[i] is defined as the sum of all elements nums[0] through nums[i].

## Example
### Example 1
```plaintext
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```
### Example 2
```plaintext
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```
### Example 3
```plaintext
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
```
# Intuition

- We iterate through the array 'nums' and calculate the running sum.
- At each index 'i', the running sum is equal to the sum of all elements from index 0 to 'i'.

# Approach

1. Initialize an array 'sum' of the same length as 'nums'.
2. Initialize 'sum[0]' to 'nums[0]'.
3. Iterate through 'nums' starting from index 1:
    - Calculate 'sum[i]' as 'sum[i-1]' + 'nums[i]'.
4. Return the array 'sum'.

# Time Complexity

The time complexity of this approach is O(n), where n is the length of the input array 'nums'.

# Space Complexity

The space complexity is O(n) as we are using an additional array of the same length as 'nums' to store the running sum.
