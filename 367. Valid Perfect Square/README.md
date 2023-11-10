# Problem

Given a positive integer `num`, determine whether it is a perfect square.

A perfect square is an integer that is the square of another integer.

You must not use any built-in library function, such as `sqrt`.

---

# Solution

## Intuition

Leverage the characteristics of perfect squares, specifically their monotonic behavior when squared, to efficiently determine if a given positive integer is a perfect square. Utilize binary search to narrow down the possible values for the square root.

## Approach

1. **Base Case Check:**
   - If `num` is less than 2, return `true` as 0 and 1 are considered perfect squares.

2. **Binary Search:**
   - Initialize two pointers, `left` and `right`, setting the search space between 2 and `num / 2`.
   - Use a binary search loop to iteratively calculate the square of the middle point (`mid`).
   - If the square is equal to `num`, return `true` as `num` is a perfect square.
   - Adjust the search space based on whether the square is less than or greater than `num`.

3. **Return False:**
   - If the loop completes without finding a perfect square, return `false`.

## Complexity Analysis

- **Time Complexity:**
  - O(log(num)) due to binary search.
  - The search space is repeatedly halved, efficiently determining whether `num` is a perfect square.

- **Space Complexity:**
  - O(1) as the function uses a constant amount of extra space.

---

This solution efficiently addresses the problem by intelligently narrowing down the search space using binary search, making it a time-optimal and space-efficient approach.
