# 203. Remove Linked List Elements

## Problem Statement
Given the head of a linked list and an integer `val`, remove all nodes in the linked list that have `Node.val == val`, and return the new head of the modified linked list.

## Examples
### Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6  
Output: [1,2,3,4,5]  
Explanation: The nodes with value 6 are removed from the linked list.

### Example 2:
Input: head = [], val = 1  
Output: []  
Explanation: The linked list is empty, so no nodes are removed.

### Example 3:
Input: head = [7,7,7,7], val = 7  
Output: []  
Explanation: All nodes have value 7 and are removed.

## Intuition
To remove nodes with a specific value from a linked list:
- Use a dummy node (`temp`) to handle cases where the head of the linked list itself needs to be removed.
- Traverse the linked list with two pointers (`prev` and `curr`).
- If `curr.val` matches `val`, skip `curr` by updating `prev.next` to `curr.next`.
- Otherwise, move both `prev` and `curr` pointers to the next node.

## Approach
1. **Initialize Pointers**:
   - Create a dummy node (`temp`) and set its `next` pointer to `head`.
   - Initialize two pointers (`prev` and `curr`) pointing to `temp` and `head` respectively.
   
2. **Traversal and Removal**:
   - Traverse the linked list using `curr`:
     - If `curr.val` matches `val`, skip `curr` by updating `prev.next` to `curr.next`.
     - Otherwise, move both `prev` and `curr` pointers to the next node.
   
3. **Return Modified List**:
   - Return `temp.next` as the new head of the modified linked list.

## Steps
1. Create a dummy node `temp` and set `temp.next` to `head`.
2. Initialize two pointers `prev` pointing to `temp` and `curr` pointing to `head`.
3. Traverse the linked list using `curr`:
   - If `curr.val` equals `val`, skip `curr` by updating `prev.next` to `curr.next`.
   - Otherwise, move both `prev` and `curr` pointers to the next node (`prev = curr` and `curr = curr.next`).
4. Return `temp.next` as the new head of the modified linked list.

## Time Complexity
The time complexity of this approach is O(n), where n is the number of nodes in the linked list. We traverse the list once.

## Space Complexity
The space complexity is O(1) because we use a constant amount of extra space regardless of the input size.
