class Solution {
    public int maxDepth(TreeNode root) {

        // Base case: empty tree
        if (root == null) {
            return 0;
        }

        // Find depth of left subtree
        int left = maxDepth(root.left);

        // Find depth of right subtree
        int right = maxDepth(root.right);

        // Return the larger depth + 1 for current node
        return 1 + Math.max(left, right);
    }
}