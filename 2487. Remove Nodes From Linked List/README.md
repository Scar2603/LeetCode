# 2487. Remove Nodes From Linked List
## Problem Statement
Given the head of a linked list, remove every node which has a node with a greater value anywhere to its right side. Return the head of the modified linked list.

## Examples
### Example 1:
```plaintext
Input: head = [5,2,13,3,8]  
Output: [13,8]  
Explanation: The nodes that should be removed are 5, 2, and 3 because there are nodes with greater values to their right.
```


### Example 2:
```plaintext
Input: head = [1,1,1,1]  
Output: [1,1,1,1]  
Explanation: Every node has the same value (1), so no nodes are removed.
```


## Intuition
To solve this problem:
- Traverse the linked list in reverse using a stack to keep track of nodes.
- Keep track of the maximum value encountered while traversing from right to left.
- Construct a new linked list by adding nodes to the front (head) if their value is greater than or equal to the current maximum.

## Approach
1. **Reverse Traversal with Stack**:
   - Traverse the linked list from left to right and push each node onto a stack.
   - Initialize `max` to `Integer.MIN_VALUE` and `result` to `null`.
   - Pop nodes from the stack:
     - If the node's value is greater than or equal to `max`, update `max`, set the node's next pointer to `result`, and update `result` to the current node.
   - Return `result` which is the head of the modified linked list.

## Steps
1. Traverse the linked list from left to right and push each node onto a stack.
2. Initialize `max` to `Integer.MIN_VALUE` and `result` to `null`.
3. Pop nodes from the stack:
   - If the node's value is greater than or equal to `max`, update `max`, set the node's next pointer to `result`, and update `result` to the current node.
4. Return `result` which is the head of the modified linked list.

## Time Complexity
The time complexity of this approach is O(n) where n is the number of nodes in the linked list, as we traverse the list twice (once to push nodes onto the stack and once to pop nodes and construct the result list).

## Space Complexity
The space complexity is O(n) due to the use of the stack to store all nodes in the linked list.
