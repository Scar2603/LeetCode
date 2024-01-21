# 198. House Robber

## Problem Statement

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and **it will automatically contact the police if two adjacent houses were broken into on the same night.**

Given an integer array `nums` representing the amount of money in each house, the task is to determine the maximum amount of money you can rob tonight without alerting the police.

## Examples

### Example 1:

Input: `nums = [1,2,3,1]`

Output: `4`

Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). The total amount you can rob is 1 + 3 = 4.

### Example 2:

Input: `nums = [2,7,9,3,1]`

Output: `12`

Explanation: Rob house 1 (money = 2), rob house 3 (money = 9), and rob house 5 (money = 1). The total amount you can rob is 2 + 9 + 1 = 12.

## Implementation

The solution for this problem can be implemented in Java using dynamic programming.

## Approach
The algorithm uses dynamic programming to keep track of the maximum amount of money that can be robbed up to the previous house (`prevMax`) and the current house (`currMax`). It iterates through the houses, making choices at each step to maximize the total robbed amount without alerting the police.

## Explaination
**Step 1: Initialization**
```java
int prevMax = 0;  // Maximum amount of money that can be robbed up to the previous house
int currMax = 0;  // Maximum amount of money that can be robbed up to the current house
```
Here, we initialize two variables, `prevMax` and `currMax`, to keep track of the maximum amount of money that can be robbed up to the previous and current houses, respectively.
**Step 2: Iteration through Houses**
```java
for (int num : nums) {
    int temp = currMax;
    currMax = Math.max(prevMax + num, currMax);  // Choose between robbing the current house or skipping it
    prevMax = temp;  // Update prevMax for the next iteration
}
```
We iterate through the array of house money (`nums`). For each house, we have two choices:

- Rob the current house and add its money to the money robbed from the previous house (`prevMax + num`).
- Skip the current house and stick with the money robbed from the previous house (`currMax`).
We update `currMax` to the maximum value of the two choices using `Math.max()`. We also update `prevMax` for the next iteration.

**Step 3: Return the Result**
```java
return currMax;
```
The final result is the maximum amount of money that can be robbed without alerting the police, which is stored in the variable `currMax`.
