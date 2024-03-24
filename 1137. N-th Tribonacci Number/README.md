# 1137. N-th Tribonacci Number

# Problem Statement

The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

## Examples
### Example 1
```plaintext
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
```
### Example 2
```plaintext
Input: n = 25
Output: 1389537
```
# Intuition

- We can solve this problem iteratively.
- We start with the base cases T0 = 0, T1 = 1, and T2 = 1.
- Then, we use a loop to calculate the Tribonacci numbers T3 to Tn.
- At each iteration, we update the values of T0, T1, and T2, and calculate the next Tribonacci number Tn.
- Finally, we return the value of Tn.

# Approach

1. Handle the base cases: if n == 0, return 0; if n <= 2, return 1.
2. Initialize variables t0 = 0, t1 = 1, t2 = 1, and tn = 0 to store the Tribonacci numbers.
3. Iterate from i = 3 to n:
    - Calculate tn as the sum of t0, t1, and t2.
    - Update the values of t0, t1, and t2: t0 = t1, t1 = t2, t2 = tn.
4. Return tn.

# Time Complexity

The time complexity of this approach is O(n), where n is the input parameter.

# Space Complexity

The space complexity is O(1) as we are using only a constant amount of extra space to store the variables.
