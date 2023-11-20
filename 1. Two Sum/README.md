# 1. Two Sum

This Python program, implemented as a method within the `Solution` class, aims to find a pair of indices in an array where the sum of the elements at those indices equals a given target.

## Algorithm

The algorithm uses a straightforward approach with two nested loops:

1. **Double Iteration:**
   - Iterate through each element in the array using two nested loops.
   - For each pair of indices (i, j) with i < j, check if `nums[i] + nums[j]` equals the target.

2. **Output Result:**
   - If a pair is found, return the indices as a list immediately.

## Time Complexity:
The time complexity of this code is O(n^2), where `n` is the length of the input list `nums`. This is because there are two nested loops that iterate through all possible pairs of indices.

## Space Complexity:
The space complexity is O(1) because the additional space used (the `ans` list) does not depend on the size of the input list. The space required for variables `i`, `j`, and `target` is constant, irrespective of the size of the input list.
