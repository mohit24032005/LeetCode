class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return splitTree(preorder, map, 0, 0, inorder.length - 1);
    }

    private TreeNode splitTree(
        int[] preorder,
        Map<Integer, Integer> map,
        int rootIndex,
        int left,
        int right
    ) {
        TreeNode root = new TreeNode(preorder[rootIndex]);

        int mid = map.get(preorder[rootIndex]);

        if (mid > left) {
            root.left = splitTree(
                preorder,
                map,
                rootIndex + 1,
                left,
                mid - 1
            );
        }

        if (mid < right) {
            root.right = splitTree(
                preorder,
                map,
                rootIndex + mid - left + 1,
                mid + 1,
                right
            );
        }

        return root;
    }
}