# 506. Relative Ranks

## Problem Statement
You are given an integer array `score` of size `n`, where `score[i]` is the score of the ith athlete in a competition. All scores are guaranteed to be unique. Athletes are ranked based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The rank of each athlete determines their medal or placement number:

- The 1st place athlete's rank is "Gold Medal".
- The 2nd place athlete's rank is "Silver Medal".
- The 3rd place athlete's rank is "Bronze Medal".
- For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").

Return an array `answer` of size `n` where `answer[i]` is the rank of the ith athlete.

## Examples
### Example 1:
Input: score = [5,4,3,2,1]  
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]  
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

### Example 2:
Input: score = [10,3,8,9,4]  
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]  
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

## Intuition
To solve this problem, we can follow these steps:
- Create an array `index` of Integer objects to store indices of athletes.
- Sort the `index` array based on the scores of athletes in descending order.
- Assign ranks to athletes based on their positions in the sorted `index` array.
- Use conditional statements to determine the rank of each athlete:
  - "Gold Medal" for the 1st place athlete.
  - "Silver Medal" for the 2nd place athlete.
  - "Bronze Medal" for the 3rd place athlete.
  - Numeric rank (e.g., "4th", "5th") for athletes from the 4th to nth place.

## Approach
1. Create an array `index` of Integer objects with indices `0` to `n-1`.
2. Sort the `index` array based on the scores of athletes in descending order using a custom comparator.
3. Initialize a `result` array to store the ranks of athletes.
4. Traverse the sorted `index` array and assign ranks to athletes based on their positions:
   - Use conditional statements to assign specific ranks ("Gold Medal", "Silver Medal", "Bronze Medal", numeric ranks) based on the athlete's position.
5. Return the `result` array containing ranks of all athletes.

## Time Complexity
The time complexity of this approach is O(n log n) due to sorting the `index` array based on scores.

## Space Complexity
The space complexity is O(n) due to the additional arrays (`index` and `result`) used to store indices and ranks.
