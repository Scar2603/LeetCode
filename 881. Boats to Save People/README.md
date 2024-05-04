# 881. Boats to Save People

## Problem Statement
You are given an array `people` where `people[i]` is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most `limit`.

Return the minimum number of boats required to carry every given person.

## Examples
### Example 1:
```plaintext
Input: people = [1,2], limit = 3  
Output: 1  
Explanation: 1 boat (1, 2)
```

### Example 2:
```plaintext
Input: people = [3,2,2,1], limit = 3  
Output: 3  
Explanation: 3 boats (1, 2), (2) and (3)
```

### Example 3:
```plaintext
Input: people = [3,5,3,4], limit = 5  
Output: 4  
Explanation: 4 boats (3), (3), (4), (5)
```

## Approach
1. Sort the `people` array in non-decreasing order of weights.
2. Use two pointers `left` and `right` initialized to the start and end of the array respectively.
3. Initialize a variable `num` to keep track of the number of boats.
4. Traverse the array using the two pointers:
   - If the sum of weights at `left` and `right` pointers is less than or equal to `limit`, move the `left` pointer to the right (indicating that these two people can share a boat).
   - Move the `right` pointer to the left in every iteration to consider the next heaviest person.
   - Increment the `num` counter for each boat needed.
5. Continue the traversal until the `left` pointer surpasses the `right` pointer.
6. Return the value of `num` which represents the minimum number of boats required.

## Steps
1. Sort the `people` array in non-decreasing order.
2. Initialize `left` to 0 (start of the array) and `right` to `people.length - 1` (end of the array).
3. Initialize `num` to 0 (number of boats).
4. While `left` <= `right`:
     - If `people[left] + people[right]` <= `limit`, increment `left`.
     - Decrement `right`.
     - Increment `num`.
5. Return `num`, which represents the minimum number of boats required to carry all people.

## Time Complexity
The time complexity is O(n log n) due to the sorting step, where n is the number of people. The subsequent linear traversal using two pointers takes O(n) time.

## Space Complexity
The space complexity is O(1) as we use a constant amount of extra space regardless of the input size.
