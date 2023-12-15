# 1436. Destination City
## Problem Statement

You are given the array `paths`, where `paths[i] = [cityAi, cityBi]` means there exists a direct path going from `cityAi` to `cityBi`. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

## Example
### Example 1
```plaintext
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
```
### Example 2
```plaintext
Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly, the destination city is "A".
```
### Example 3
```plaintext
Input: paths = [["A","Z"]]
Output: "Z"
```

## Approach

The problem can be solved by iterating through the given paths and keeping track of the starting cities and destination cities. The destination city is the one that is present in the destination cities but not in the starting cities.

## Steps

1. Initialize two lists: `startCity` and `destCity`.
2. Iterate through each path and add the starting city to the `startCity` list and the destination city to the `destCity` list.
3. Iterate through the `destCity` list.
4. For each city in `destCity`, check if it is not present in the `startCity` list.
5. Return the city that satisfies the condition.

## Time Complexity

The time complexity of this approach is O(N), where N is the number of paths. The two iterations through the paths contribute to a linear time complexity.

## Space Complexity

The space complexity is also O(N), where N is the number of paths. The space is used to store the starting cities and destination cities in separate lists.

