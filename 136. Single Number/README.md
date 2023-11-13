# 136.Single Number

## Overview

This Java project provides a solution for finding the single number in an array of integers. The array contains duplicates, and the goal is to identify the number that appears only once.

## Method: `singleNumber`

The `singleNumber` method takes an array of integers (`nums`) as input and returns the single number that appears only once in the array.

### Algorithm

1. Sort the array in ascending order.
2. Check each pair of adjacent elements in the sorted array.
3. Return the element that does not have a duplicate.

### Time Complexity

The time complexity of the `singleNumber` method is dominated by the sorting operation, which is typically O(n log n), where 'n' is the number of elements in the array.

### Space Complexity

The space complexity is O(1) since the sorting is performed in-place, and the algorithm does not use any additional data structures that scale with the input size.
