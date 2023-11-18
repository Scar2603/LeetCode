# 204. Count Primes

## Overview

This Java class, `Solution`, provides a method `countPrimes` to calculate the number of prime numbers that are strictly less than a given integer `n`.

## Method: `countPrimes`

The `countPrimes` method takes an integer `n` as input and returns the count of prime numbers less than `n`.

1. Initialize an Array:
-Create a boolean array `isPrime` of size `n` and initialize all elements to `true`. The array is used to mark whether a number is prime.

2. Sieve of Eratosthenes:
- Use the Sieve of Eratosthenes algorithm to mark non-prime numbers. Iterate through the array, and for each prime number `i`, mark its multiples as non-prime.

3. Count Primes:
- Count the number of `true` values in the `isPrime` array, which corresponds to the number of prime numbers less than `n`.

4. Return the Result:
Return the count of prime numbers.

## Time Complexity: O(n log log n)
### 1. Sieve of Eratosthenes:

- The outer loop runs from `i=2` to `i * i < n`, and for each `i`, the inner loop marks multiples of `i` as non-prime.
- The time complexity of the Sieve of Eratosthenes is O(n log log n), which is an efficient algorithm for finding all primes up to a given limit.

### 2. Counting Primes:
- The final loop iterates from `i=2` to `i < n` to count the number of prime numbers marked as `true` in the `isPrime` array.
The time complexity of this loop is O(n), but it is dominated by the Sieve of Eratosthenes.


## Space Complexity: O(n)
### 1. Boolean Array:
- The space complexity is O(n) due to the boolean array `isPrime` of size `n`, which is used to mark whether a number is prime or not.
### 2. Additional Variables:
The algorithm uses a few additional variables (e.g., `i`, `j`, `count`), but these require constant space.

