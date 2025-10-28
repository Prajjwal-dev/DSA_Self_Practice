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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //If both are null, they are same
        if(p == null && q == null) {
            return true;
        } 

        //If one is null and other isn't or values doesnt match, they aren't same
        if(p == null || q == null || p.val != q.val) {
            return false;
        }

        //Recursively check left and right subtrees
        return isSameTree(p.left, q.left) &&  isSameTree(p.right, q.right);
    }
}