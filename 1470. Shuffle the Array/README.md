# 1470. Shuffle the Array

## Problem Statement
Given an array `nums` consisting of 2n elements in the form [x1, x2, ..., xn, y1, y2, ..., yn], return the array in the form [x1, y1, x2, y2, ..., xn, yn].

## Examples
### Example 1
**Input:** `nums = [2,5,1,3,4,7], n = 3`
**Output:** `[2,3,5,4,1,7]`
**Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

### Example 2
**Input:** `nums = [1,2,3,4,4,3,2,1], n = 4`
**Output:** `[1,4,2,3,3,2,4,1]`

### Example 3
**Input:** `nums = [1,1,2,2], n = 2`
**Output:** `[1,2,1,2]`

## Intuition
The problem asks for a specific shuffling of elements in the given array. The task is to interleave the first half of the array with the second half.

## Approach
The given Java code implements a solution with the following steps:
1. Initialize an empty array `result` with the same length as the input array `nums`.
2. Use a loop to iterate over the first half of the array (up to index `n`).
3. Inside the loop, populate the `result` array with interleaved elements from the first and second halves of the input array.
4. Increment the index by 2 to ensure proper interleaving.
5. Return the resulting shuffled array.

## Steps
1. Create an array `result` with the same length as `nums`.
2. Initialize a variable `i` to 0.
3. Use a loop to iterate over the first half of `nums`.
    a. Set `result[i]` to `nums[j]`.
    b. Set `result[i+1]` to `nums[j+n]`.
    c. Increment `i` by 2.
4. Return the `result` array.

## Time Complexity
The time complexity of this solution is O(n), where n is the length of the input array `nums`.

## Space Complexity
The space complexity is O(n) as well, considering the space required for the `result` array.

