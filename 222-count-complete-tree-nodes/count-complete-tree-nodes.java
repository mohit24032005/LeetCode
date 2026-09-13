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
    public int countNodes(TreeNode root) {
        int leftd = leftt(root);
        int rightd = rightt(root);
        if(leftd == rightd){
            return (int) Math.pow(2,leftd)-1;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
        
    }
    private int rightt(TreeNode root){
        int len = 0;
        while(root!=null){
            root = root.right;
            len++;

        }
        return len;
    }
    private int leftt(TreeNode root){
        int len = 0;
        while(root!=null){
            root = root.left;
            len++;
        }
        return len;
    }
}