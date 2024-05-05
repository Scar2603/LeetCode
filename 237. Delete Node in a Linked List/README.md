# 237. Delete Node in a Linked List

## Problem Statement
Given a singly-linked list `head` and a node `node` in the list, delete the specified node from the linked list. You are not given access to the first node of `head`.

All the values of the linked list are unique, and it is guaranteed that the given node `node` is not the last node in the linked list.

Delete the given node by removing its value from the list and adjusting the pointers accordingly. The number of nodes in the linked list should decrease by one.

## Examples
### Example 1:
```plaintext
Input: head = [4,5,1,9], node = 5  
Output: [4,1,9]  
Explanation: You are given the second node with value 5, and the linked list should become 4 -> 1 -> 9 after deleting the node.
```


### Example 2:
```plaintext
Input: head = [4,5,1,9], node = 1  
Output: [4,5,9]  
Explanation: You are given the third node with value 1, and the linked list should become 4 -> 5 -> 9 after deleting the node.
```

## Intuition
To delete a node from a linked list when you have access only to the node itself (and not the head of the list):
- Copy the value of the next node (`node.next`) to the current node (`node`).
- Update the `node.next` pointer to skip over the next node (`node.next.next`).

## Approach
1. Copy the value of `node.next` to `node` (`node.val = node.next.val`).
2. Update `node.next` to skip over the next node (`node.next = node.next.next`).

## Steps
1. Copy the value of `node.next` to `node` (`node.val = node.next.val`).
2. Update `node.next` to skip over the next node (`node.next = node.next.next`).

## Time Complexity
The time complexity of this approach is O(1) because we are performing a constant number of operations.

## Space Complexity
The space complexity is also O(1) because we are using a constant amount of extra space regardless of the input size.
