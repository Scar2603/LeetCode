# 606. Construct String from Binary Tree

## Problem Statement

Given the root of a binary tree, construct a string consisting of parentheses and integers from a binary tree using the preorder traversal. <br> 
Omit all unnecessary empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

### Examples:

#### Example 1:

Input: root = [1,2,3,4] <br>
Output: "1(2(4))(3)"<br>
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"

#### Example 2:

Input: root = [1,2,3,null,4]<br>
Output: "1(2()(4))(3)"<br>
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.

## Approach

1. If the current node is `null`, return an empty string.
2. Append the value of the current node to the result string.
3. If either the left or right child is non-null, append an opening parenthesis.
4. Recursively process the left subtree and append the result to the string.
5. Append a closing parenthesis.
6. If the right child is non-null, append an opening parenthesis.
7. Recursively process the right subtree and append the result to the string.
8. Append a closing parenthesis.
9. Return the constructed string.


## Time Complexity

Let \(n\) be the number of nodes in the binary tree.

The time complexity is \(O(n)\) because each node is visited exactly once in the preorder traversal.

## Space Complexity

The space complexity is \(O(h)\), where \(h\) is the height of the binary tree. This is due to the recursive calls in the function, which create a stack. In the worst case, the height of the tree is equal to the number of nodes in the tree, leading to a space complexity of \(O(n)\). In the average case, where the tree is balanced, the space complexity is \(O(\log n)\).
