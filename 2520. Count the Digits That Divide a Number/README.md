# Count Digits That Divide a Number

## Overview

This Java project provides a simple solution for counting the digits in a given number that evenly divide the original number.

## Implementation

The solution is implemented in the `Solution` class, which contains a method `countDigits`. This method takes an integer as input and returns the count of digits in the number that are divisors of the original number.

### Algorithm

1. **Initialization:**
    ```java
    int temp = num;
    int count = 0;
    ```
   - `temp` is a temporary variable initialized with the value of the input `num`.
   - `count` is a variable to keep track of the count of digits that evenly divide `num`.

2. **While Loop:**
    ```java
    while(temp > 0){
        // Code inside the loop
    }
    ```
   The code inside the while loop iterates through each digit of the number.

3. **Extracting Digits:**
    ```java
    int val = temp % 10;
    ```
   - `val` is assigned the last digit of `temp` using the modulo operator (`%`). This extracts the last digit of `temp`.

4. **Checking Divisibility:**
    ```java
    if(val != 0 && num % val == 0)
        count++;
    ```
   - If `val` is not equal to 0 (to avoid division by zero) and `num` is divisible by `val`, the count is incremented.

5. **Updating `temp`:**
    ```java
    temp /= 10;
    ```
   - `temp` is then divided by 10 to move to the next digit (remove the last digit).

6. **Returning the Count:**
    ```java
    return count;
    ```
   The final count of digits that divide `num` is returned.

