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
    public int goodNodes(TreeNode root) {
        return countNodes(root, Integer.MIN_VALUE);
    }
    
    private int countNodes(TreeNode node, int max) {
        if (node == null) return 0;
        
        int count = 0;
        if (node.val >= max) {
            count++;
            max = node.val;
        }
        
        count += countNodes(node.left, max);
        count += countNodes(node.right, max);
        
        return count;
    }
}
