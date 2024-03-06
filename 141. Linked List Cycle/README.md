# 141. Linked List Cycle

## Problem Statement
Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, `pos` is used to denote the index of the node that tail's next pointer is connected to. Note that `pos` is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

## Examples
### Example 1
```plaintext
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

### Example 2
```plaintext
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```

### Example 3
```plaintext
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

## Intuition
The problem asks to determine if there is a cycle in a linked list. The solution uses the Floyd's Tortoise and Hare algorithm, which involves two pointers moving at different speeds.

## Approach
The given Java code implements a solution with the following steps:
1. Initialize two pointers, `slow` and `fast`, both pointing to the head of the linked list.
2. Move `slow` one step at a time and `fast` two steps at a time.
3. If there is a cycle, the `fast` pointer will eventually catch up to the `slow` pointer.
4. If there is no cycle, the `fast` pointer will reach the end of the linked list.
5. Return `true` if there is a cycle and `false` otherwise.

## Steps
1. Initialize two pointers, `slow` and `fast`, both pointing to the head of the linked list.
2. While `fast` is not null and `fast.next` is not null:
    a. Move `slow` one step forward.
    b. Move `fast` two steps forward.
    c. If `slow` and `fast` meet (point to the same node), return `true`.
3. If the loop ends, return `false`.

## Time Complexity
The time complexity of this solution is O(N), where N is the number of nodes in the linked list. In the worst case, both pointers will traverse the entire linked list.

## Space Complexity
The space complexity is O(1), as no additional space is used proportional to the input size.

