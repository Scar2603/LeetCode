# 442. Find All Duplicates in an Array

## Overview

This Python script provides a solution for finding duplicates in a list of integers using a specific algorithm.

## Method: `findDuplicates`

The `findDuplicates` method takes a list of integers (`nums`) as input and returns a list containing the duplicate elements.

### Algorithm

The algorithm utilizes the property that each element in the list is between 1 and the length of the list (inclusive). It marks visited elements by negating the value at the corresponding index. If an element is encountered again and its corresponding index has a negative value, it implies the element is a duplicate.
1. **Initialize an Empty List:**
   - `res` is initialized as an empty list to store duplicate elements.
2. **Iterate Through the List:**
   - For each element `i` in the input list `nums`, perform the following steps.
3. **Check for Negativity:**
   - If the value at the index corresponding to the absolute value of `i` in `nums` is negative, it means `i` has been encountered before. Add `abs(i)` to the result list.
4. **Mark Visited Elements:**
   - Negate the value at the index corresponding to the absolute value of `i` in `nums` to mark the element as visited.
5. **Return Result List:**
   - The final result list containing duplicate elements is returned.
  
## Time Complexity
The time complexity of this algorithm is O(n), where n is the length of the input list `nums`. The algorithm iterates through each element of the list once.

## Space Complexity
The space complexity is O(1) since the algorithm uses a constant amount of extra space, regardless of the input size.
