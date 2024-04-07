# 101. Symmetric Tree

## Problem Statement
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

## Examples
### Example 1:
```plaintext
Input: root = [1,2,2,3,4,4,3]  
Output: true
```  

### Example 2:

```plaintext
Input: root = [1,2,2,null,3,null,3]  
Output: false 
```
 

## Intuition
To check if a binary tree is symmetric, we need to compare the left subtree of the root with the right subtree. If they are mirror images of each other, the tree is symmetric.

## Approach
- Create a helper function to compare if two subtrees are symmetric.
- Check if the root is null. If it is, return true.
- Call the helper function with the left and right subtrees of the root.
- In the helper function:
  - If both nodes are null, return true.
  - If one of the nodes is null or their values are different, return false.
  - Recursively check if the left subtree's left child is symmetric to the right subtree's right child, and the left subtree's right child is symmetric to the right subtree's left child.
- Return the result of the helper function.

## Steps
1. Create a helper function `same` that takes two TreeNode arguments representing the left and right subtrees.
2. If both nodes are null, return true.
3. If one of the nodes is null or their values are different, return false.
4. Recursively check if the left subtree's left child is symmetric to the right subtree's right child, and the left subtree's right child is symmetric to the right subtree's left child.
5. In the main function `isSymmetric`:
   - Check if the root is null. If it is, return true.
   - Call the `same` function with the left and right subtrees of the root.
   - Return the result.

## Time Complexity
The time complexity of this approach is O(n), where n is the number of nodes in the binary tree.

## Space Complexity
The space complexity of this approach is O(h), where h is the height of the binary tree, due to the recursive function calls.
