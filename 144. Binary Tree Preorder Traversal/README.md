# 144. Binary Tree Preorder Traversal
## Problem Statement
Given the root of a binary tree, return the preorder traversal of its nodes' values.

## Examples
### Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

### Example 2:
Input: root = []
Output: []

### Example 3:
Input: root = [1]
Output: [1]

## Intuition
The preorder traversal visits the root node first, then recursively visits the left subtree, and finally recursively visits the right subtree.

## Approach
1. Initialize an empty list `result` to store the preorder traversal.
2. Use a helper function `preorder` to perform recursive preorder traversal:
   - If the current node is null, return.
   - Add the value of the current node to `result`.
   - Recursively call `preorder` on the left subtree.
   - Recursively call `preorder` on the right subtree.
3. Return the `result` list containing the preorder traversal of the binary tree.

## Time Complexity
The time complexity of the preorder traversal is O(n), where n is the number of nodes in the binary tree. Each node is visited exactly once.

## Space Complexity
The space complexity is O(n), where n is the number of nodes in the binary tree. This space is used for the recursive call stack during the traversal and to store the preorder traversal result.
