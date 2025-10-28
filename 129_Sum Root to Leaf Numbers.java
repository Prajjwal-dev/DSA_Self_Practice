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
    public int sumNumbers(TreeNode root) {
        //Using dfs for traversal of binary tree
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        //Base case
        if(node == null) {
            return 0;
        }

        //Edge case
        currentSum = currentSum * 10 + node.val;

        //if it is leaf node then return currentSum
        if(node.left == null && node.right == null) {
            return currentSum;
        }

        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }
}