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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue <TreeNode> elementinqueue = new LinkedList<>();
        elementinqueue.add(root);
        int level = 0;
        while(true){
            int numberofel = elementinqueue.size();
            if(numberofel == 0){
                return level;
            }
            while(numberofel > 0){
                TreeNode element = elementinqueue.poll();
                if(element.left!=null){
                    elementinqueue.add(element.left);
                }
                if(element.right!=null){
                    elementinqueue.add(element.right);
                }
                numberofel--;
            }
            level++;
            
        }
        
        
    }
}
        