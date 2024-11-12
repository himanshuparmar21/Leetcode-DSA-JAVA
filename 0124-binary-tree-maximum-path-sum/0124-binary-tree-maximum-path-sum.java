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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);
        left = Math.max(0,left);
        right = Math.max(0,right);
        int temp = left + right + node.val;
        max= Math.max(max,temp);
        return Math.max(left,right) + node.val;
    }
}