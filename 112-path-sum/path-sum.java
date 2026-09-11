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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        backtrack(root, 0, targetSum);
        return ans;
    }
    void backtrack(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                ans = true;
            }
            else{
                return;
            }
        }
        backtrack(root.left, sum, targetSum);
        backtrack(root.right, sum, targetSum);
        sum -= root.val;
    }
}