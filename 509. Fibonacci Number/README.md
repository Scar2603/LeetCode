# 509. Fibonacci Number
## Overview

This Java project provides a recursive solution for calculating the Fibonacci sequence for a given input `n`.

## Method: `fib`

The `fib` method takes an integer `n` as input and returns the nth term of the Fibonacci sequence.

### Algorithm

The Fibonacci sequence is calculated using recursion with the following base cases:
- If `n` is 0 or 1, return `n`.
- Otherwise, return the sum of the previous two terms in the sequence: `fib(n-1) + fib(n-2)`.

#### Recursive Step

In the recursive step of the algorithm, the nth Fibonacci number is calculated by summing the (n-1)th and (n-2)th Fibonacci numbers. This step is implemented as follows:

```java
return fib(n-1) + fib(n-2);
