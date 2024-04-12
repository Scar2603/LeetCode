# 1448. Count Good Nodes in Binary Tree

## Problem Statement
Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.

## Examples
### Example 1:
```plaintext
Input: root = [3,1,4,3,null,1,5]  
Output: 4  
Explanation: Nodes in blue are good.  
Root Node (3) is always a good node.  
Node 4 -> (3,4) is the maximum value in the path starting from the root.  
Node 5 -> (3,4,5) is the maximum value in the path  
Node 3 -> (3,1,3) is the maximum value in the path.
```

### Example 2:
```plaintext
Input: root = [3,3,null,4,2]  
Output: 3  
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
```

### Example 3:
```plaintext
Input: root = [1]  
Output: 1  
Explanation: Root is considered as good.
```

## Intuition
We traverse the tree recursively while keeping track of the maximum value encountered in the path from the root to the current node. If the current node's value is greater than or equal to the maximum value encountered so far, it is considered a good node. We count such nodes and return the count.

## Approach
We use a recursive approach to traverse the tree. We pass down the maximum value encountered so far as a parameter to each recursive call. If the current node's value is greater than or equal to this maximum value, we increment the count and update the maximum value. We then recursively call the function for the left and right children of the current node.

## Steps
1. Initialize a count variable to 0.
2. Define a recursive function `countNodes(node, max)` that takes a node and the maximum value encountered so far as parameters.
3. If the current node is null, return 0.
4. Increment the count if the current node's value is greater than or equal to the maximum value encountered so far.
5. Recursively call the function for the left and right children of the current node, passing down the updated maximum value.
6. Return the count.

## Time Complexity
The time complexity of this approach is O(n), where n is the number of nodes in the binary tree. This is because we visit each node exactly once.

## Space Complexity
The space complexity of this approach is O(h), where h is the height of the binary tree. This is the space required for the recursive call stack.
