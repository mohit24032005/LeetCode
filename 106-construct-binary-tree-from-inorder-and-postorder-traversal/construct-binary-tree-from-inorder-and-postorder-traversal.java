class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return splitTree(
            postorder,
            map,
            postorder.length - 1,
            0,
            inorder.length - 1
        );
    }
    private TreeNode splitTree(int[] postorder,HashMap<Integer, Integer> map,int rootIndex,int left,int right) {
        TreeNode root = new TreeNode(postorder[rootIndex]);
        int mid = map.get(postorder[rootIndex]);
        if (mid < right) {
            root.right = splitTree(postorder,map,rootIndex - 1,mid + 1,right
            );
        }

        if (mid > left) {
            root.left = splitTree(postorder,map,rootIndex - (right - mid) - 1,left,mid - 1
            );
        }
        return root;
    }
}