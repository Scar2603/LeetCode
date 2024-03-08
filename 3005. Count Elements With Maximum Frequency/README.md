# 3005. Count Elements With Maximum Frequency

## Problem Statement
You are given an array `nums` consisting of positive integers.

Return the total frequencies of elements in `nums` such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

## Examples
### Example 1
```plaintext
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array. So the number of elements in the array with maximum frequency is 4.
```

### Example 2
```plaintext
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum. So the number of elements in the array with maximum frequency is 5.
```

## Intuition
The problem asks to find the total frequencies of elements in the array that have the maximum frequency.

## Approach
The given Java code implements a solution with the following steps:
1. Find the maximum element in the array to determine the size of the frequency array.
2. Initialize an array `frequencyArray` to store the frequencies of each element.
3. Traverse the array and count the frequencies of each element.
4. Find the maximum frequency among all elements.
5. Traverse the frequency array again and count the elements with the maximum frequency.
6. Return the total count of elements with the maximum frequency.

## Steps
1. Find the maximum element in the array to determine the size of the frequency array.
2. Initialize an array `frequencyArray` to store the frequencies of each element.
3. Traverse the array and count the frequencies of each element.
4. Find the maximum frequency among all elements.
5. Traverse the frequency array again and count the elements with the maximum frequency.
6. Return the total count of elements with the maximum frequency.

## Time Complexity
The time complexity of this solution is O(N), where N is the length of the input array `nums`. The algorithm traverses the array twice.

## Space Complexity
The space complexity is O(K), where K is the maximum element in the array. The space is used to store the frequency array.

