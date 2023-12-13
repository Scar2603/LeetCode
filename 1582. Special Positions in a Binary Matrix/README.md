# 1582. Special Positions in a Binary Matrix

## Problem Statement
Given an `m x n` binary matrix `mat`, return the number of special positions in `mat`.<br>

A position `(i, j)` is called special if `mat[i][j] == 1` and all other elements in row `i` and column `j` are `0` (rows and columns are 0-indexed).

## Approach
The problem can be efficiently solved by counting the number of 1s in each row and each column separately. The steps are as follows:

### Step 1: Count 1s in Rows and Columns
- Initialize arrays `row` and `col` to store the count of 1s in each row and each column, respectively.
- Iterate through the matrix `mat`.
  ```java
  for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
          if (mat[i][j] == 1) {
              row[i]++;
              col[j]++;
          }
      }
  }
# Step 2: Check for Special Positions

- Initialize a variable `count` to 0, which will store the number of special positions.
- Iterate through the matrix `mat` again.
  ```java
  for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
          if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
              count++;
          }
      }
  }
In this step, a position `(i, j)` is considered special if `mat[i][j]` is `1`, and both `row[i]` and `col[j]` are equal to `1`. When a special position is encountered, the `count` variable is incremented.

## Time Complexity
- Let `r` be the number of rows and `c` be the number of columns in the matrix.
- The time complexity is O(r * c) for the two nested loops in each step.

## Space Complexity
- The space complexity is O(r + c) for the arrays storing row and column counts.

