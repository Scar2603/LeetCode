# 1716. Calculate Money in Leetcode Bank

## Intuition
Hercy is saving money systematically, increasing the amount each day and resetting the count every Monday. To find the total amount of money he will have at the end of `n` days, we need to simulate this savings process.

## Approach
1. Initialize variables `total`, `week`, and `day` to keep track of the total amount saved, the current week, and the current day within the week, respectively.
2. Use a loop to simulate Hercy's savings over `n` days.
   - On each day, add the amount saved on that day to the total.
   - Increment the day, and if it becomes greater than 7 (Monday), increment the week and reset the day to 1.
3. Return the total amount saved.

## Steps
1. Set `total` = 0, `week` = 0, and `day` = 1.
2. Loop from 1 to `n`:
   - Add `week + day` to `total`.
   - Increment `day`.
   - If `day > 7`, increment `week` and reset `day` to 1.
3. Return `total`.

## Time Complexity
The time complexity is O(n) because the loop iterates `n` times, and each iteration involves simple arithmetic operations.

## Space Complexity
The space complexity is O(1) since we use a constant amount of extra space regardless of the input `n`. The variables `total`, `week`, and `day` do not depend on the size of the input.
