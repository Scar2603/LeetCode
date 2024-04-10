# 450. Delete Node in a BST

## Problem Statement
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

Basically, the deletion can be divided into two stages:
1. Search for a node to remove.
2. If the node is found, delete the node.

## Examples
### Example 1:
```plaintext
Input: root = [5,3,6,2,4,null,7], key = 3  
Output: [5,4,6,2,null,null,7]  
Explanation:  
Given key to delete is 3. So we find the node with value 3 and delete it.  
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.  
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
```

### Example 2:
```plaintext
Input: root = [5,3,6,2,4,null,7], key = 0  
Output: [5,3,6,2,4,null,7]  
Explanation:  
The tree does not contain a node with value = 0.
```

### Example 3:
Input: root = [], key = 0  
Output: []  

## Intuition
To delete a node in a binary search tree, we need to perform a search to find the node with the given key. Once found, we handle three cases:
1. If the node has no children, we simply remove it.
2. If the node has one child, we replace the node with its child.
3. If the node has two children, we find its inorder successor, replace the node's value with the successor's value, and recursively delete the successor.

## Approach
- Implement a recursive function to delete the node with the given key from the binary search tree.
- If the root is null, return null.
- If the key is less than the root's value, recursively call the function on the left subtree.
- If the key is greater than the root's value, recursively call the function on the right subtree.
- If the key is equal to the root's value:
  - If the root has no left child, return the right child.
  - If the root has no right child, return the left child.
  - Otherwise, find the inorder successor (the leftmost node in the right subtree), replace the root's value with the successor's value, and recursively delete the successor from the right subtree.
- Return the modified root.

## Steps
1. Implement a recursive function `deleteNode` that takes the root node and the key to delete.
2. If the root is null, return null.
3. If the key is less than the root's value, recursively call the function on the left subtree.
4. If the key is greater than the root's value, recursively call the function on the right subtree.
5. If the key is equal to the root's value:
   - If the root has no left child, return the right child.
   - If the root has no right child, return the left child.
   - Otherwise, find the inorder successor (the leftmost node in the right subtree), replace the root's value with the successor's value, and recursively delete the successor from the right subtree.
6. Return the modified root.

## Time Complexity
The time complexity of this approach is O(h), where h is the height of the binary search tree.

## Space Complexity
The space complexity of this approach is O(h), where h is the height of the binary search tree, due to the recursive function calls.
