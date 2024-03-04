# 700. Search in a Binary Search Tree

## Problem Statement
You are given the root of a binary search tree (BST) and an integer `val`.

Find the node in the BST that has a value equal to `val` and return the subtree rooted with that node. If such a node does not exist, return null.

## Examples
### Example 1
```plaintext
Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
```

### Example 2
```plaintext
Input: root = [4,2,7,1,3], val = 5
Output: []
```

## Intuition
The problem asks to find and return the subtree rooted at the node with a specific value in a binary search tree.

## Approach
The given Java code implements a solution with the following steps:
1. If the root is null or the value of the current root is equal to the target value, return the root.
2. If the target value is less than the current root value, recursively search the left subtree.
3. If the target value is greater than the current root value, recursively search the right subtree.
4. Return the result of the recursive search.

## Steps
1. Check if the root is null or the value of the current root is equal to the target value. If true, return the root.
2. If the target value is less than the current root value, call the `searchBST` method recursively with the left subtree.
3. If the target value is greater than the current root value, call the `searchBST` method recursively with the right subtree.
4. Return the result of the recursive search.

## Time Complexity
The time complexity of this solution is O(H), where H is the height of the binary search tree. In the worst case, the algorithm traverses the height of the tree.

## Space Complexity
The space complexity is O(H), where H is the height of the binary search tree. The space used by the call stack during recursion is proportional to the height of the tree.

