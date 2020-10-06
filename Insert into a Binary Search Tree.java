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
    
    private TreeNode solution1(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
        }
        if(val < root.val) {
            root.left = solution1(root.left, val);
        }
        else if(val > root.val) {
            root.right = solution1(root.right, val);
        }
        return root;
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return root = solution1(root, val);
    }
}