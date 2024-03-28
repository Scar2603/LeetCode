# 2095. Delete the Middle Node of a Linked List

## Problem Statement
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For example, for n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

## Examples
### Example 1:
```plaintext
Input: head = [1,3,4,7,1,2,6]  
Output: [1,3,4,1,2,6]  
Explanation:  
The above figure represents the given linked list. The indices of the nodes are written below.  
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.  
We return the new list after removing this node.
```
### Example 2:
```plaintext
Input: head = [1,2,3,4]  
Output: [1,2,4]  
Explanation:  
The above figure represents the given linked list.  
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
```
### Example 3:
```plaintext
Input: head = [2,1]  
Output: [2]  
Explanation:  
The above figure represents the given linked list.  
For n = 2, node 1 with value 1 is the middle node, which is marked in red.  
Node 0 with value 2 is the only node remaining after removing node 1.
```
## Intuition
To delete the middle node of a linked list, we need to find the middle node and remove it by adjusting the pointers.

## Approach
1. Traverse the linked list to count the total number of nodes.
2. Calculate the index of the middle node.
3. Traverse the linked list again to reach the node before the middle node.
4. Adjust pointers to remove the middle node.

## Steps
1. Initialize a pointer `curr` to the head of the linked list.
2. Traverse the linked list to count the total number of nodes and store the count in a variable `c`.
3. If `c` is equal to 1, set `head` to null and return.
4. Calculate the index of the middle node using `mid = (c / 2) - 1`.
5. Reset `c` to 0 and initialize another pointer `temp` to `head`.
6. Traverse the linked list until `c` reaches `mid`.
7. Update `temp` to point to the node before the middle node.
8. Adjust pointers to remove the middle node: `temp.next = temp.next.next`.
9. Return the head of the modified linked list.

## Time Complexity
The time complexity of this approach is O(n), where n is the number of nodes in the linked list.

## Space Complexity
The space complexity of this approach is O(1) as it uses constant extra space.
