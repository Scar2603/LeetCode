# Fair Candy Swap

This repository contains a Java solution for the Fair Candy Swap problem. Given two integer arrays `aliceSizes` and `bobSizes`, representing the number of candies each person has in their respective boxes, the goal is to find a pair of candies to exchange such that both Alice and Bob have the same total number of candies after the exchange.

## Problem Overview

Alice and Bob want to exchange one candy box each so that their total number of candies becomes equal. The total amount of candy a person has is the sum of the number of candies in each box they have. The task is to return an integer array `[x, y]` where `x` is the number of candies in the box that Alice must exchange, and `y` is the number of candies in the box that Bob must exchange.

## Solution Approach

1. **Calculate Total Candies:**
   - Calculate the total number of candies Alice and Bob have using the arrays `aliceSizes` and `bobSizes`.

2. **Iterate and Find Exchange Pair:**
   - Iterate through each box of candy for both Alice and Bob.
   - For each pair of boxes, calculate the total number of candies each person would have after the exchange.
   - If the totals are equal, return the pair of candies as the answer.

3. **Return Result:**
   - If no suitable pair is found, return an empty array, as it is guaranteed that at least one answer exists.
