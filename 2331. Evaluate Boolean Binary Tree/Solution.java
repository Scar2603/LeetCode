/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        
        boolean leftNode = evaluateTree(root.left);
        boolean rightNode = evaluateTree(root.right);
        
        if (root.val == 2) {
            return leftNode || rightNode;
        } else if (root.val == 3) {
            return leftNode && rightNode;
        }
        
        return false;
    }
}
