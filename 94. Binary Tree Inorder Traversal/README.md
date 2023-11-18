# 94. Binary Tree Inorder Traversal
This repository contains a Java implementation of the inorder traversal of a binary tree. The code includes both recursive and iterative approaches.

## Problem Description

Given the root of a binary tree, the task is to return the inorder traversal of its nodes' values.

## Approach

### Recursive Approach

The recursive approach utilizes a helper function `inorderTraversalHelper` that takes a `TreeNode` as input. The algorithm follows these steps:

1. Check if the node is not null.
2. Recursively call `inorderTraversalHelper` on the left child of the current node.
3. Add the value of the current node to the result list.
4. Recursively call `inorderTraversalHelper` on the right child of the current node.

### Iterative Approach using a Stack

The iterative approach employs a stack to simulate the call stack of the recursive solution. The algorithm follows these steps:

1. Initialize an empty stack and start with the root node.
2. While the current node is not null or the stack is not empty:
   - Traverse to the leftmost node while pushing each node onto the stack.
   - Pop a node from the stack, add its value to the result list, and move to its right child.
3. Repeat until the stack is empty.

## Time and Space Complexity Analysis

### Recursive Approach:

- **Time Complexity:** \(O(n)\), where \(n\) is the number of nodes in the binary tree. In the worst case, we visit each node exactly once.
- **Space Complexity:** \(O(h)\), where \(h\) is the height of the binary tree. This represents the maximum depth of the function call stack during the recursive traversal. In the worst case, for a skewed binary tree, the space complexity is \(O(n)\), but for a balanced binary tree, it is \(O(\log n)\).

### Iterative Approach using a Stack:

- **Time Complexity:** \(O(n)\), where \(n\) is the number of nodes in the binary tree. Each node is visited once.
- **Space Complexity:** \(O(h)\), where \(h\) is the height of the binary tree. In the worst case (skewed binary tree), the space complexity is \(O(n)\), as all nodes could be pushed onto the stack. For a balanced binary tree, the space complexity is \(O(\log n)\).

In both cases, the space complexity is dominated by the function call stack or the stack data structure used to simulate the recursive calls in the iterative approach. The time complexity remains \(O(n)\) because we visit each node once during the traversal.

