# 2798. Number of Employees Who Met the Target

## Problem Statement

You are given an array `hours` representing the number of hours each employee has worked in a company, and an integer `target` representing the minimum number of hours each employee should work. Your task is to find and return the number of employees who have worked at least the target hours.

## Example

### Example 

```java
Input: hours = [5, 1, 4, 2, 2], target = 6
Output: 0
Explanation: 
The company wants each employee to work for at least 6 hours. There are 0 employees who met the target.
```

## Approach
The given solution sorts the `hours` array in ascending order and then iterates through it. For each employee, it checks if the number of hours worked is greater than or equal to the target. The moment it finds such an employee, it calculates the number of employees who have met the target as `n - i`, where `n` is the total number of employees and `i` is the index of the first employee who met the target. The result is then returned.

## Steps
1. Sort the `hours` array in ascending order.
2. Iterate through the sorted array.
3. For each employee, check if the number of hours worked is greater than or equal to the target.
4. If found, calculate the number of employees who met the target as `n - i`, where `n` is the total number of employees and `i` is the index of the first employee who met the target.
5. Return the result.

## Time Complexity
The time complexity of this solution is dominated by the sorting operation, which is O(n log n), where n is the number of employees. The iteration through the sorted array is O(n), so the overall time complexity is O(n log n).

## Space Complexity
The space complexity is O(1) since the algorithm uses a constant amount of space regardless of the input size.
