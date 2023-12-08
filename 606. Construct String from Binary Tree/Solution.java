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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(root.val);

        if (root.left != null || root.right != null) {
            result.append("(");
            result.append(tree2str(root.left));
            result.append(")");

            if (root.right != null) {
                result.append("(");
                result.append(tree2str(root.right));
                result.append(")");
            }
        }

        return result.toString();
    }
}
