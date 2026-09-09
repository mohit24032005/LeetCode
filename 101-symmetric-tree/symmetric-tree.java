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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> lt = new LinkedList<>();
        Queue<TreeNode> rt = new LinkedList<>();
        lt.add(root.left);
        rt.add(root.right);
        while(!lt.isEmpty() && !rt.isEmpty()){
            TreeNode r2d2 = lt.poll();
            TreeNode r2d3 = rt.poll();
            if(r2d2 == null && r2d3 == null){
                continue;
            }
            if(r2d2 == null || r2d3 == null){
                return false;
            }
            if(r2d2.val != r2d3.val){
                return false;

            }
            lt.add(r2d2.left);
            lt.add(r2d2.right);
            rt.add(r2d3.right);
            rt.add(r2d3.left);
        }
        return true;
        
    }
}