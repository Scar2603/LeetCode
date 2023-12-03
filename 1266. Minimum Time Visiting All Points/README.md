# 1266. Minimum Time Visiting All Points

## Problem Statement
On a 2D plane, there are `n` points with integer coordinates `points[i] = [xi, yi]`. Return the minimum time in seconds to visit all the points in the order given by `points`.

You can move according to these rules:

- In 1 second, you can either:
  - Move vertically by one unit,
  - Move horizontally by one unit, or
  - Move diagonally √2 units (in other words, move one unit vertically then one unit horizontally in 1 second).

You have to visit the points in the same order as they appear in the array. You are allowed to pass through points that appear later in the order, but these do not count as visits.

## Intuition
To minimize the time, efficiently move from one point to the next using the specified movement rules. The minimum time to travel between two points is the maximum of the absolute differences in their x-coordinates and y-coordinates.

## Approach
1. **Initialize** `totalTime` to 0 to store the cumulative time.
2. **Iterate** through the points starting from index 1 (since there is no previous point for the first one).
3. For each pair of consecutive points, **calculate** the absolute differences in x and y coordinates.
4. **Update** `totalTime` by adding the maximum of the two differences.
5. **Return** the final `totalTime`.

## Time Complexity
The time complexity of this solution is O(N), where N is the number of points. We iterate through the array once, performing constant-time operations in each iteration.

## Space Complexity
The space complexity is O(1) since we use only a constant amount of extra space regardless of the input size. We do not use any data structures that depend on the size of the input.
