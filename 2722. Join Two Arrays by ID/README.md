# 2722. Join Two Arrays by ID
## Problem Statement
Given two arrays `arr1` and `arr2`, return a new array `joinedArray` formed by merging `arr1` and `arr2` based on their `id` key. The resulting array should contain objects with unique `id` values sorted in ascending order based on the `id` key. If two objects share the same `id`, their properties should be merged into a single object following certain rules.

## Examples
### Example 1:
```plaintext
Input:   
arr1 = [
    {"id": 1, "x": 1},
    {"id": 2, "x": 9}
],   
arr2 = [
    {"id": 3, "x": 5}
]  
Output:   
[
    {"id": 1, "x": 1},
    {"id": 2, "x": 9},
    {"id": 3, "x": 5}
]  
Explanation: There are no duplicate ids so arr1 is simply concatenated with arr2.
```

### Example 2:
```plaintext
Input:   
arr1 = [
    {"id": 1, "x": 2, "y": 3},
    {"id": 2, "x": 3, "y": 6}
],   
arr2 = [
    {"id": 2, "x": 10, "y": 20},
    {"id": 3, "x": 0, "y": 0}
]  
Output:   
[
    {"id": 1, "x": 2, "y": 3},
    {"id": 2, "x": 10, "y": 20},
    {"id": 3, "x": 0, "y": 0}
]  
Explanation: The two objects with id=1 and id=3 are included in the result array without modification. The two objects with id=2 are merged together. The keys from arr2 override the values in arr1.

```

### Example 3:
```plaintext
Input:   
arr1 = [
    {"id": 1, "b": {"b": 94},"v": [4, 3], "y": 48}
]  
arr2 = [
    {"id": 1, "b": {"c": 84}, "v": [1, 3]}
]  
Output:   
[
    {"id": 1, "b": {"c": 84}, "v": [1, 3], "y": 48}
]  
Explanation: The two objects with id=1 are merged together. For the keys "b" and "v", the values from arr2 are used. Since the key "y" only exists in arr1, that value is taken from arr1.
```

## Intuition
To solve this problem, we can use a hashmap to store objects based on their `id`. We iterate through both input arrays and merge objects with the same `id` by updating their properties according to the specified rules.

## Approach
1. Initialize an empty hashmap `id`.
2. Iterate through `arr1` and add each object to `id` with its `id` as the key.
3. Iterate through `arr2` and merge each object with the corresponding object in `id` if it exists, or add it to `id` if it doesn't.
4. Convert the values of `id` back to an array.
5. Sort the array based on the `id` key in ascending order.
6. Return the sorted array as the result.

## Steps
1. Create an empty hashmap `id`.
2. Iterate through `arr1` and add each object to `id` with its `id` as the key.
3. Iterate through `arr2`:
   - If an object with the same `id` exists in `id`, merge its properties with the current object from `arr2`.
   - If not, add the object from `arr2` to `id`.
4. Convert the values of `id` to an array `joined`.
5. Sort `joined` based on the `id` key in ascending order.
6. Return `joined` as the result.

## Time Complexity
Let n be the total number of elements in both arrays.
- Adding elements to the hashmap takes O(n) time.
- Merging objects with the same `id` takes constant time for each object.
- Converting the hashmap values to an array and sorting it takes O(n log n) time.
The overall time complexity is O(n log n).

## Space Complexity
The space complexity is O(n) due to the usage of the hashmap and the output array.
