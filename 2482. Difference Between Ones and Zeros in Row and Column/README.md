# 2482. Difference Between Ones and Zeros in Row and Column

## Problem Statement

You are given a 0-indexed `m x n` binary matrix `grid`. A difference matrix `diff` is created with the following procedure:

- Let the number of ones in the ith row be `onesRowi`.
- Let the number of ones in the jth column be `onesColj`.
- Let the number of zeros in the ith row be `zerosRowi`.
- Let the number of zeros in the jth column be `zerosColj`.
- `diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj`

Return the difference matrix `diff`.

### Example 1:

**Input:**
```plaintext
grid = [[0,1,1],[1,0,1],[0,0,1]]  
```

**Output:** 
```plaintext
[[0,0,4],[0,0,4],[-2,-2,2]] 
```
**Explanation:** 
```plaintext
- diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0 = 2 + 1 - 1 - 2 = 0 
- diff[0][1] = onesRow0 + onesCol1 - zerosRow0 - zerosCol1 = 2 + 1 - 1 - 2 = 0 
- diff[0][2] = onesRow0 + onesCol2 - zerosRow0 - zerosCol2 = 2 + 3 - 1 - 0 = 4 
- diff[1][0] = onesRow1 + onesCol0 - zerosRow1 - zerosCol0 = 2 + 1 - 1 - 2 = 0 
- diff[1][1] = onesRow1 + onesCol1 - zerosRow1 - zerosCol1 = 2 + 1 - 1 - 2 = 0 
- diff[1][2] = onesRow1 + onesCol2 - zerosRow1 - zerosCol2 = 2 + 3 - 1 - 0 = 4 
- diff[2][0] = onesRow2 + onesCol0 - zerosRow2 - zerosCol0 = 1 + 1 - 2 - 2 = -2
- diff[2][1] = onesRow2 + onesCol1 - zerosRow2 - zerosCol1 = 1 + 1 - 2 - 2 = -2
- diff[2][2] = onesRow2 + onesCol2 - zerosRow2 - zerosCol2 = 1 + 3 - 2 - 0 = 2
```

### Example 2:

**Input:**
```plaintext
grid = [[1,1,1],[1,1,1]]
```

**Output:** 
```plaintext
[[5,5,5],[5,5,5]]
```
**Explanation:** 
```plaintext
- diff[0][0] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0 = 3 + 2 - 0 - 0 = 5
- diff[0][1] = onesRow0 + onesCol1 - zerosRow0 - zerosCol1 = 3 + 2 - 0 - 0 = 5
- diff[0][2] = onesRow0 + onesCol2 - zerosRow0 - zerosCol2 = 3 + 2 - 0 - 0 = 5
- diff[1][0] = onesRow1 + onesCol0 - zerosRow1 - zerosCol0 = 3 + 2 - 0 - 0 = 5
- diff[1][1] = onesRow1 + onesCol1 - zerosRow1 - zerosCol1 = 3 + 2 - 0 - 0 = 5
- diff[1][2] = onesRow1 + onesCol2 - zerosRow1 - zerosCol2 = 3 + 2 - 0 - 0 = 5

```
## Approach

To solve this problem, follow these steps:

1. Initialize arrays `onesRow`, `onesCol`, `zerosRow`, `zerosCol` to store the counts of ones and zeros for rows and columns.
2. Iterate through the elements of the grid, updating the counts in the above arrays.
3. Calculate the `diff` matrix using the provided formula.
4. Return the `diff` matrix as the final result.

## Steps

1. Initialize arrays `onesRow`, `onesCol`, `zerosRow`, `zerosCol` of size `m` and `n`.
2. Iterate through each element `(i, j)` in the grid:
    - If `grid[i][j]` is 0, increment `zerosRow[i]` and `zerosCol[j]`.
    - If `grid[i][j]` is 1, increment `onesRow[i]` and `onesCol[j]`.
3. Initialize a 2D array `diff` of size `m` x `n`.
4. Iterate through each element `(i, j)` in the grid:
    - Calculate `diff[i][j]` using the formula: `onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j]`.
5. Return the `diff` matrix as the final result.

## Time Complexity

The time complexity is O(m * n), where m is the number of rows and n is the number of columns in the input grid.

## Space Complexity

The space complexity is O(m + n), as arrays are used to store counts for rows and columns.
