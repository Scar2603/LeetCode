# 374. Guess Number Higher or Lower

## Problem Statement

You are playing the Guess Game. The game is as follows:

I pick a number from `1` to `n`. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API `int guess(int num)`, which returns three possible results:
- `-1`: Your guess is higher than the number I picked (i.e., `num > pick`).
- `1`: Your guess is lower than the number I picked (i.e., `num < pick`).
- `0`: Your guess is equal to the number I picked (i.e., `num == pick`).

Return the number that I picked.
```plaintext
Example 1:

Input: n = 10, pick = 6
Output: 6
```
```plaintext
Example 2:

Input: n = 1, pick = 1
Output: 1
```
```plaintext
Example 3:

Input: n = 2, pick = 1
Output: 1
```

## Approach

The problem is solved using a binary search approach. The key idea is to iteratively narrow down the search space based on the result of the `guess` function. If the guess is higher than the picked number, the search space is restricted to the left half; if the guess is lower, the search space is restricted to the right half.

## Steps

1. Initialize `left` and `right` to represent the search range, i.e., [1, n].
2. Perform a binary search within the given range.
3. Calculate the middle element and use the `guess` function to determine whether the picked number is higher, lower, or equal.
4. Update the search range accordingly based on the result.
5. Repeat steps 3-4 until the correct number is found.

## Time Complexity

The time complexity of this solution is O(log n) because each step reduces the search space by half.

## Space Complexity

The space complexity is O(1) as the algorithm uses a constant amount of extra space for variables regardless of the input size.
