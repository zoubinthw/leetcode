package q1080;

import tree.TreeNode;

public class Q1080 {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return dfs(0, root, limit);
    }

    private TreeNode dfs(int sum, TreeNode node, int limit) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            if (node.val + sum < limit) {
                return null;
            } else {
                return node;
            }
        }

        node.left = dfs(sum + node.val, node.left, limit);
        node.right = dfs(sum + node.val, node.right, limit);

        if (node.left == null && node.right == null) {
            return null;
        }

        return node;
    }
}
