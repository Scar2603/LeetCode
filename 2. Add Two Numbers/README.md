# 2. Add Two Numbers

## Problem Statement
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Examples
### Example 1
```plaintext
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

### Example 2
```plaintext
Input: l1 = [0], l2 = [0]
Output: [0]
```

### Example 3
```plaintext
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Intuition
The problem asks to add two numbers represented as linked lists. The numbers are given in reverse order, and the goal is to return the sum as a linked list.

## Approach
The given C code implements a solution with the following steps:
1. Initialize a dummy node to store the result.
2. Initialize a current pointer to traverse the linked lists.
3. Initialize a carry variable to handle overflow during addition.
4. Traverse both linked lists while there are still nodes or there's a carry.
5. Calculate the sum of corresponding digits and the carry.
6. Create a new node with the calculated sum and add it to the result linked list.
7. Move to the next nodes in the input linked lists.
8. If there's a carry after the traversal, add a new node for the carry.
9. Return the result linked list.

## Steps
1. Initialize a dummy node and a current pointer.
2. Initialize a carry variable to 0.
3. While there are nodes in either linked list or there's a carry:
    a. Calculate the sum of corresponding digits and the carry.
    b. Create a new node with the calculated sum and add it to the result linked list.
    c. Move to the next nodes in the input linked lists.
4. If there's a carry after the traversal, add a new node for the carry.
5. Return the result linked list.

## Time Complexity
The time complexity of this solution is O(max(N, M)), where N and M are the lengths of the input linked lists. The algorithm traverses both linked lists once.

## Space Complexity
The space complexity is O(max(N, M)), where N and M are the lengths of the input linked lists. The space is used to store the result linked list.

