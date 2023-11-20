# 41. First Missing Positive

This Java program is designed to find the first missing positive integer in an array. The solution is based on the concept of swapping elements to their correct positions to ensure that each positive integer from 1 to n appears in the array.

## Algorithm

The algorithm has two main steps:

1. **Array Rearrangement (In-Place):**
    - Iterate through the array.
    - For each element `nums[i]` that is a positive integer within the range [1, n], swap it with the element at index `nums[i] - 1` until the array is in the correct order.

2. **Finding the First Missing Positive:**
    - Iterate through the rearranged array.
    - If the element at index `i` is not equal to `i + 1`, then `i + 1` is the first missing positive integer.
    - If all elements are in their correct positions, return `n + 1` as the first missing positive.

## Complexity Analysis
### Time Complexity:
The time complexity of the given code is O(n).
- The first loop iterates through the array once, performing constant-time operations for each element.
- The second loop also iterates through the array once, performing constant-time operations for each element.
Both loops have a linear relationship with the size of the input array, making the overall time complexity linear, O(n).

### Space Complexity:
The space complexity of the given code is O(1).
- The algorithm rearranges the elements in-place without using any additional data structures that scale with the input size.
- The only extra space used is for a constant number of variables (e.g., `n`, `i`, `temp`), which does not depend on the size of the input array.
Therefore, the space complexity is constant, O(1).
