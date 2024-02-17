# 1642. Furthest Building You Can Reach

## Problem Statement
You are given an integer array `heights` representing the heights of buildings, some bricks, and some ladders. 

You start your journey from building `0` and move to the next building by possibly using bricks or ladders. 

While moving from building `i` to building `i+1` (**0-indexed**),
1. If the current building's height is **greater than or equal** to the next building's height, you do **not** need a ladder or bricks.
2. If the current building's height is **less than** the next building's height, you can either use **one ladder** or `(h[i+1] - h[i])` bricks.

*Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.*

## Examples
**Example 1:**
```plaintext
Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
Output: 4
Explanation: Starting at building 0, you can follow these steps:
- Go to building 1 without using ladders nor bricks since 4 >= 2.
- Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
- Go to building 3 without using ladders nor bricks since 7 >= 6.
- Go to building 4 using your only ladder. You must use either bricks or ladders because 6 < 9.
It is impossible to go beyond building 4 because you do not have any more bricks or ladders.
```
**Example 2:**
```plaintext
Input: heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
Output: 7
```
**Example 3:**
```plaintext
Input: heights = [14,3,19,3], bricks = 17, ladders = 0
Output: 3
```

## Intuition
The problem asks to find the furthest building index one can reach using the given ladders and bricks optimally.

## Approach
The given Java code implements a solution with the following steps:
1. Use a PriorityQueue (`heightDifferences`) to store the height differences between consecutive buildings in ascending order.
2. Iterate through the buildings, calculate the height differences, and add them to the `heightDifferences` PriorityQueue.
3. If the size of the `heightDifferences` PriorityQueue exceeds the number of available ladders, subtract the smallest difference from the available bricks.
4. If the available bricks become negative, return the index of the last successfully visited building.
5. If the loop completes, return the index of the last building.

## Steps
1. Create a PriorityQueue (`heightDifferences`) to store the height differences between consecutive buildings.
2. Iterate through the buildings (starting from index 1).
    a. Calculate the height difference `diff` between the current building and the previous one.
    b. If `diff` is positive, add it to the `heightDifferences` PriorityQueue.
    c. If the size of `heightDifferences` exceeds the available ladders, subtract the smallest difference from available bricks.
    d. If available bricks become negative, return the index of the last successfully visited building (`i - 1`).
3. If the loop completes, return the index of the last building (`n - 1`).

## Time Complexity
The time complexity of this solution is O(n * log(k)), where n is the length of the input array `heights`, and k is the number of ladders.

## Space Complexity
The space complexity is O(k), where k is the number of ladders, as it is used to store height differences in the PriorityQueue.

