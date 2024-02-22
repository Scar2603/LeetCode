# 997. Find the Town Judge

## Problem Statement
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:
1. The town judge trusts nobody.
2. Everybody (except for the town judge) trusts the town judge.
3. There is exactly one person that satisfies properties 1 and 2.

You are given an array `trust` where `trust[i] = [ai, bi]` representing that the person labeled `ai` trusts the person labeled `bi`. If a trust relationship does not exist in the `trust` array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

## Examples
### Example 1:
```plaintext
Input: `n = 2, trust = [[1,2]]`
Output: `2`
```

### Example 2
```plaintext
Input:`n = 3, trust = [[1,3],[2,3]]`
Output: `3`
```

### Example 3
```plaintext
Input: `n = 3, trust = [[1,3],[2,3],[3,1]]`
Output: `-1`
```

## Intuition
The problem asks to find the label of the town judge based on the trust relationships provided.

## Approach
The given Java code implements a solution with the following steps:
1. Create an array `count` of size `N+1` to represent the count of trusts each person has.
2. Iterate through the `trust` array, decrementing the count for the person who trusts and incrementing the count for the person being trusted.
3. Iterate through the `count` array, and if there exists a person with `N-1` trusts, return their label.
4. If no such person is found, return -1.

## Steps
1. Initialize an array `count` of size `N+1` to store the count of trusts for each person.
2. Iterate through the `trust` array.
    a. Decrement the count for the person who trusts (`count[i[0]]--`).
    b. Increment the count for the person being trusted (`count[i[1]]++`).
3. Iterate through the `count` array.
    a. If a person has `N-1` trusts (`count[i] == N-1`), return their label.
4. If no such person is found, return -1.

## Time Complexity
The time complexity of this solution is O(E + V), where E is the number of trust relationships (edges) and V is the number of people (vertices).

## Space Complexity
The space complexity is O(N), where N is the number of people.

