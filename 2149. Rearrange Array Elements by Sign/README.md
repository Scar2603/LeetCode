# 2149. Rearrange Array Elements by Sign

## Problem Statement
You are given a **0-indexed** integer array `nums` of **even** length consisting of an **equal** number of positive and negative integers.

You should **rearrange** the elements of `nums` such that the modified array follows the given conditions:

1. Every **consecutive pair** of integers have **opposite signs**.
2. For all integers with the same sign, the order in which they were present in `nums` is **preserved**.
3. The rearranged array begins with a positive integer.

Return _the modified array after rearranging the elements to satisfy the aforementioned conditions._
## Examples
**Example 1**
```plaintext
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation: The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4]. The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
```

**Example 2**
```plaintext
Input: nums = [-1,1]
Output: [1,-1]
Explanation: 1 is the only positive integer and -1 the only negative integer in nums. So nums is rearranged to [1,-1].
```
## Intuition
The problem asks for a specific rearrangement of positive and negative integers in the array, satisfying given conditions.

## Approach
The given Java code implements a solution with the following steps:
1. Separate positive and negative integers into two separate lists.
2. Initialize an array `result` with the same length as `nums`.
3. Iterate through both positive and negative lists, interleaving their elements into the `result` array.
4. Return the `result` array.

## Steps
1. Create two lists, `positive` and `negative`, to store positive and negative integers, respectively.
2. Iterate through `nums` and add positive integers to the `positive` list and negative integers to the `negative` list.
3. Initialize an array `result` with the same length as `nums`.
4. Initialize a variable `i` to 0.
5. While either `positive` or `negative` is not empty:
    a. If `positive` is not empty, assign `result[i]` with the first element of `positive` and increment `i`.
    b. If `negative` is not empty, assign `result[i]` with the first element of `negative` and increment `i`.
6. Return the `result` array.

## Time Complexity
The time complexity of this solution is O(n), where n is the length of the input array `nums`.

## Space Complexity
The space complexity is also O(n), considering the space required for the `positive`, `negative`, and `result` lists.

