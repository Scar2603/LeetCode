# 328. Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

## Examples
### Example 1
```plaintext
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
```


### Example 2
```plaintext
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
```


## Approach
The problem can be solved using the two-pointer technique to separate odd and even indices. Maintain separate pointers for odd and even positions, traverse the list, and update pointers accordingly.

## Steps
1. Initialize pointers `odd` and `even` to the head and head.next respectively.
2. Traverse the list while updating the pointers to reorder odd and even indices.
3. Connect the last odd node to the head of the even list.
4. Return the head of the reordered list.

## Time Complexity
The time complexity of this solution is O(n) since it traverses the linked list once.

## Space Complexity
The space complexity is O(1) as only a constant amount of extra space is used.
