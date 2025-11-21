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
    List<Integer> rightSide = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);
        return rightSide;
    }

    private void traverse(TreeNode node, int level) {
        //Base Case
        if(node == null) {
            return;
        }

        //If we are visiting rightmost node at first tiem take it as rightside element
        if(level == rightSide.size()) {
            rightSide.add(node.val);
        }

        traverse(node.right, level + 1);
        traverse(node.left, level + 1);
    }
}