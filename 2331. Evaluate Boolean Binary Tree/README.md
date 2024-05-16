# 2331. Evaluate Boolean Binary Tree

## Problem statement:
You are given the `root` of a **full binary tree** with the following properties:

- **Leaf nodes** have either the value `0` or `1`, where `0` represents `False` and `1` represents `True`.
- **Non-leaf nodes** have either the value `2` or `3`, where `2` represents the boolean `OR` and `3` represents the boolean `AND`.

The **evaluation** of a node is as follows:
- If the node is a leaf node, the evaluation is the **value** of the node, i.e. `True` or `False`.
- Otherwise, `evaluate` the node's two children and `apply` the boolean operation of its value with the children's evaluations.

Return the *boolean result of* ***evaluating*** the `root` *node*.

A **full binary tree** is a binary tree where each node has either `0` or `2` children.

A **leaf node** is a node that has zero children.

## Examples:
### Example 1:
```plaintext
Input: root = [2,1,3,null,null,0,1]
Output: true
Explanation: The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true.
```

### Example 2:
```plaintext
Input: root = [0]
Output: false
Explanation: The root node is a leaf node and it evaluates to false, so we return false.
```
## Intuition
The problem involves recursively evaluating a full binary tree based on node values representing boolean operations (AND and OR) and leaf values representing boolean True or False.

## Approach
1. Base Cases:
   - If the root is `null`, return `false`.
   - If the root is a leaf node (no children), return `root.val == 1 `(True if `root.val` is 1, False otherwise).

2. Recursive Evaluation:
   - Recursively evaluate the left and right subtrees.
   - Depending on the value of the current node (`root.val)`, perform the respective boolean operation (`AND` or `OR`) on the evaluations of the left and right subtrees.

3. Return Result:
   - Return the result of the boolean operation based on the node value (`2` for `OR` and `3` for `AND`).

## Steps
1. Check if the `root` is `null`.
2. If the root is a leaf node (`root.left == null && root.right == null`), return `root.val == 1`.
3. Recursively evaluate the left subtree and the right subtree using the `evaluateTree` function.
4. Depending on the value of `root.val`:
    - If `root.val == 2` (OR), return `leftNode || rightNode.`
    - If `root.val == 3` (AND), return `leftNode && rightNode`.
  
## Time complexity:
The time complexity of this solution is `O(n)`, where `n` is the number of nodes in the binary tree. This is because we traverse each node exactly once.

## Space complexity:
The space complexity is also `O(n)` in the worst-case scenario, where `n` is the number of nodes in the binary tree due to the recursive stack space.
