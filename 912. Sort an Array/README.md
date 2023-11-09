# Counting Sort for Sorting an Array

This repository contains a Java solution for sorting an array using the counting sort algorithm, achieving O(nlog(n)) time complexity and minimal space complexity.

## Problem Overview

Given an array of integers, the task is to sort the array in ascending order without using built-in sorting functions. The solution employs the counting sort algorithm, a non-comparison-based sorting technique.

## Solution Approach

1. **Find Maximum and Minimum Values:**
   - Iterate through the array to find the maximum (`max`) and minimum (`min`) values. This step is crucial for determining the range of values in the array.

2. **Calculate Range (`n`):**
   - Calculate the range `n` by subtracting the minimum value from the maximum value. This range will be used to create an auxiliary array.

3. **Counting Frequencies:**
   - Create an auxiliary array (`arr`) of size `n + 1` to store the frequency of each value in the original array.
   - Iterate through the original array and increment the count in the `arr` array corresponding to the value (`num - min`).

4. **Reconstruct Sorted Array:**
   - Iterate through the `arr` array and reconstruct the sorted array by placing the values back into the original array based on their frequencies.

5. **Return the Sorted Array:**
   - Return the modified original array, now sorted in ascending order.
