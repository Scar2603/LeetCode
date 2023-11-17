# 240. Search a 2D Matrix II

## Problem Statement
You are given an `m x n` matrix where:
- Integers in each row are sorted in ascending order from left to right.
- Integers in each column are sorted in ascending order from top to bottom.

Write a function `searchMatrix` to determine if a target value exists in the matrix.
## Approach
The algorithm uses a two-pointer approach, starting from the top-right corner of the matrix and iteratively moving towards the bottom-left corner.

#### 1. Base Case Check:
- Check if the matrix is null or empty. If true, return `false` as the target cannot be found.

#### 2. Initialize Pointers: 
- Initialize two pointers, `row` and `col`, to the top-right corner of the matrix.

#### 3. Search Loop: 
- Enter a loop that continues until the `row `index is out of bounds (below the last row) or the `col` index is out of bounds (before the first column).
- If the current matrix value at `(row, col)` is equal to the target, return `true` as the target is found.
- If the matrix value is less than the target, move to the next row.
- If the matrix value is greater than the target, move to the previous column.
#### 4. Target Not Found:
- If the loop completes without finding the target, return `false`.

## Time Complexity
The time complexity of this algorithm is O(m + n), where m is the number of rows and n is the number of columns in the matrix. This is because, in each iteration of the while loop, either the row is incremented or the column is decremented.

## Space Complexity
The algorithm has a constant space complexity of O(1) as it uses a fixed number of variables regardless of the input size.
