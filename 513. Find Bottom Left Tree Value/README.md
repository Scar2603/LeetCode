# 513. Find Bottom Left Tree Value

## Problem Statement
Given the root of a binary tree, return the leftmost value in the last row of the tree.

## Examples
### Example 1
```plaintext
Input: root = [2,1,3]
Output: 1
```
### Example 2
```plaintext
Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7
```

## Intuition
The problem asks to find the leftmost value in the last row of a binary tree.

## Approach
The given Java code implements a solution with the following steps:
1. Use a queue to perform level order traversal of the binary tree.
2. Keep updating the `leftmostValue` variable while traversing the last row.
3. Return the `leftmostValue` at the end.

## Steps
1. Initialize a queue and offer the root to it.
2. Initialize a variable `leftmostValue` with the root's value.
3. While the queue is not empty:
    a. Get the current size of the queue.
    b. Update `leftmostValue` with the value of the first node in the current level.
    c. Iterate through the nodes in the current level:
        i. Poll the front node from the queue.
        ii. Offer its left and right children to the queue if they exist.
4. Return the `leftmostValue` after the loop.

## Time Complexity
The time complexity of this solution is O(N), where N is the number of nodes in the binary tree, as each node is processed once during the level order traversal.

## Space Complexity
The space complexity is O(W), where W is the maximum width of the binary tree, as the queue will store nodes at the widest level of the tree.

