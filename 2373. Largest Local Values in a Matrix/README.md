# 2373. Largest Local Values in a Matrix

## Problem Statement
You are given an `n x n` integer matrix `grid`.

Generate an integer matrix `maxLocal` of size `(n - 2) x (n - 2)` such that:

- `maxLocal[i][j]` is equal to the largest value of the `3 x 3` matrix in `grid` centered around row `i + 1` and column `j + 1`.
In other words, we want to find the largest value in every contiguous `3 x 3` matrix in `grid`.

Return the generated matrix.

## Examples
### Example 1:
```plaintext
Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
```
### Example 2:
```plaintext
Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
```

## Intuition
The goal is to identify the largest value within each 3x3 sub-matrix in the `grid`. By iterating over every possible 3x3 sub-matrix position and computing the maximum value within it, we can populate the result matrix `maxLocal` accordingly.

## Approach
The approach involves a brute-force method to iterate over every potential 3x3 sub-matrix in the input `grid`, compute the maximum value within each sub-matrix, and store the results in the output matrix `maxLocal`.

## Steps
1. Initialization:
  - Initialize the `result` matrix result of size `(n - 2) x (n - 2)` to store the maximum values for each 3x3 sub-matrix.
2. Nested Loops:
  - Iterate through the rows and columns of the result matrix `result` using two nested loops.
  - For each `(i, j)` position in the result matrix, traverse the corresponding 3x3 sub-matrix in the input grid.
    - Use two additional loops to iterate over the rows (`x`) and columns (`y`) of the 3x3 sub-matrix starting from position `(i, j)` in the input grid.
    - Update the `max` variable to find the maximum value within the current 3x3 sub-matrix.

## Time complexity
The time complexity of this solution is `O((n-2) * (n-2) * 3 * 3) = O(n^2)`, where `n` is the size of the input grid.


## Space complexity
The space complexity is `O((n-2) * (n-2)) = O(n^2)` for the output matrix `maxLocal`. The additional space used for variables is constant, `O(1)`.




