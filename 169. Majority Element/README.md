# Majority Element

## Problem Description

Given an array of integers, find the majority element, which is the element that appears more than n/2 times in the array.

## Solution

I've implemented a solution using Java. Here's how it works:

- Step 1: We sort the input array in ascending order using `Arrays.sort(nums)`.
- Step 2: The majority element will always be at the middle index of the sorted array, as it appears more than n/2 times.

## Complexity Analysis

- Time Complexity: O(nlogn) due to the sorting step.
- Space Complexity: O(1) as we don't use any additional data structures.

Feel free to explore the code for a more detailed understanding.
