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
    
    // Solution 1 (Recursive)
    List<String> total;
    String temp;
    private void traverseLeft(TreeNode node) {
        temp += node.val;
        if(node.left == null && node.right == null) {
            total.add(temp);
            temp = temp.substring(0, temp.length()-1); // remove last character
            return;
        }
        if(node.left != null) {
            traverseLeft(node.left);
        }
        if(node.right != null) {
            traverseLeft(node.right);
        }
        temp = temp.substring(0, temp.length()-1); // remove last character
        return;
    }
    private int solution1(TreeNode root) {
        int res = 0;
        total = new ArrayList<>();
        temp = "";
        
        traverseLeft(root);
        
        for(String s: total) {
            res += Integer.parseInt(s, 2);
        }
        
        return res;
    }
    // Solution 1
    
    // Solution 2
    private int solution2(TreeNode root) {
        int rootToLeaf = 0, currNumber = 0;
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));

        while (!stack.isEmpty()) {
          Pair<TreeNode, Integer> p = stack.pop();
          root = p.getKey();
          currNumber = p.getValue();

          if (root != null) {
            currNumber = (currNumber << 1) | root.val;
            // if it's a leaf, update root-to-leaf sum
            if (root.left == null && root.right == null) {
              rootToLeaf += currNumber;
            } else {
              stack.push(new Pair(root.right, currNumber));
              stack.push(new Pair(root.left, currNumber));
            }
          }
        }
        return rootToLeaf;
    }
    // Solution 2
    
    public int sumRootToLeaf(TreeNode root) {
        
        // return solution1(root);
        return solution2(root);
    }
}